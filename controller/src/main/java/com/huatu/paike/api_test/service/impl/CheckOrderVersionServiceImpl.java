package com.huatu.paike.api_test.service.impl;

import com.huatu.common.utils.DateUtil;
import com.huatu.common.utils.FileUtil;
import com.huatu.paike.api_test.dto.ChangeOrderDto;
import com.huatu.paike.api_test.dto.OrderInfoDto;
import com.huatu.paike.api_test.service.CheckOrderVersionService;
import com.huatu.paike.api_test.service.OrderVersionService;
import com.huatu.paike.dal.goodsOrder.entity.OrderInfo;
import com.huatu.paike.dal.goodsOrder.entity.OrderVersion;
import com.huatu.paike.dal.goodsOrder.mapper.OrderInfoMapper;
import com.huatu.paike.dal.goodsOrder.mapper.OrderVersionMapper;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CheckOrderVersionServiceImpl implements CheckOrderVersionService {

    @Autowired
    OrderInfoMapper orderInfoMapper;

    @Autowired
    OrderVersionMapper orderVersionMapper;

    @Autowired
    OrderVersionService orderVersionService;

    @Override
    public void check() {
        log.info("开始检查商品订单和排课不一致的orderVersion");
        StopWatch watch = new StopWatch();

        StopWatch watch1 = new StopWatch();

        watch.start("query all orderInfo");
        List<OrderInfo> orderInfoList = orderInfoMapper.selectAll();
        watch.stop();
        log.info("查询所有订单信息，共{}个，耗时：{}", orderInfoList.size(), watch.getLastTaskTimeMillis());

        List<Long> orderGoodsIdList = orderInfoList.stream().map(a -> a.getOrderGoodsId()).collect(Collectors.toList());

        watch1.start("并发查询订单版本");
        Map<Long, OrderInfoDto> moneyTotalMap = orderVersionService.getMoneyInfoParallel(orderGoodsIdList);
        watch1.stop();
        log.info("并发查询订单版本信息，共{}个，耗时：{}", orderGoodsIdList.size(), watch1.getLastTaskTimeMillis());

        Map<Long, ChangeOrderDto> resultMap = Maps.newHashMap();
        watch.start("批量入库");
        int i = 0, size = orderInfoList.size();
        int batchSize = 5000;
        int orderVersionCount = 0;
        while (i < size) {
            int lastIndex = Math.min(i + batchSize, size);
            List<OrderInfo> subList = orderInfoList.subList(i, lastIndex);

            List<Long> orderGoodsIds = subList.stream().map(a -> a.getOrderGoodsId()).collect(Collectors.toList());
            // Map<Long,OrderInfoDto>
            // orderGoodsId2OrderInfoDto=orderVersionService.getOrderInfoByOrderGoodsId(orderGoodsIds);
            List<OrderVersion> orderVersionList = orderVersionMapper.getNewestVersionByOrderGoodsIds(orderGoodsIds);
            Map<Long, OrderVersion> orderVersionMap =
                orderVersionList.stream().collect(Collectors.toMap(a -> a.getOrderGoodsId(), a -> a));

            for (Long orderGoodsId : orderGoodsIds) {
                OrderInfoDto moneyInfo = moneyTotalMap.get(orderGoodsId);
                OrderVersion alreadyHave = orderVersionMap.get(orderGoodsId);
                if (moneyInfo == null) {
                    log.error("商品订单有不存在的订单{}", orderGoodsId);
                    continue;
                }
                OrderInfoDto orderInfoDto = JSONObject.parseObject(alreadyHave.getJson(), OrderInfoDto.class);
                if (!moneyInfo.equals(orderInfoDto)) {
                    orderVersionCount++;
                    ChangeOrderDto dto = new ChangeOrderDto();
                    dto.setPaike(orderInfoDto);
                    dto.setSource(reasonStr(alreadyHave.getSource()));
                    dto.setCreateTime(alreadyHave.getCreateTime());
                    dto.setSku(moneyInfo);
                    resultMap.put(orderGoodsId, dto);
                }
            }

            log.info("插入数据{}个", resultMap.size());
            i = lastIndex;
        }
        watch.stop();
        log.info("比对完毕，耗时：{}", watch.getLastTaskTimeMillis());
        log.info("比对完成，共{}个", orderVersionCount);
        log.info(watch.prettyPrint());

        String filePath = "D:\\huatu\\changes2.csv";
        try {
            FileUtil.write(filePath, getStr("orderGoodsId", "paike","reason", "paike_create_time", "sku"), true);
            Set<Map.Entry<Long, ChangeOrderDto>> sets = resultMap.entrySet();
            for (Map.Entry<Long, ChangeOrderDto> item : sets) {
                Long orderGoodsId = item.getKey();
                ChangeOrderDto value=item.getValue();
                String paike;
                if (item.getValue().getPaike() != null) {
                    paike = item.getValue().getPaike().toString();
                } else {
                    paike = "";
                }
                String sku;
                if (item.getValue().getSku() != null) {
                    sku = item.getValue().getSku().toString();
                } else {
                    sku = "";
                }
                String orderGoodsStr = String.valueOf(orderGoodsId);
                FileUtil.write(filePath, getStr(orderGoodsStr,value.getSource(), DateUtil.getStrByDateFormate(value.getCreateTime(),"yyyy-MM-dd HH:mm:ss" ), paike, sku), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String reasonStr(String source) {
        switch (source) {
            case "0":
                return "初始化";
            case "2":
                return "订单提报";
            case "history_repair":
                return "排课历史修数据";
            case "order_system_modify_orderInfo":
                return "商品订单系统修改";
            case "task repair":
                return "修复任务";
            default:
                return "";
        }

    }

    private String getStr(String...strings) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean isFirst = true;
        for (String str : strings) {
            if (!isFirst) {
                stringBuilder.append(",");
            } else {
                isFirst = false;
            }
            stringBuilder.append("\"");
            stringBuilder.append(str);
            stringBuilder.append("\"");
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }
}
