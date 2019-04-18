
package com.huatu.paike.api_test;

import com.huatu.common.dto.resp.Node;
import com.huatu.common.errorcode.CommonErrorCode;
import com.huatu.common.exception.BusinessException;
import com.huatu.common.service.StageService;
import com.huatu.common.service.SubjectService;
import com.huatu.common.utils.DateUtil;
import com.huatu.common.utils.JsonUtil;
import com.huatu.ehr.service.EhrNodeService;
import com.huatu.ehr.service.dto.resp.EhrNode;
import com.huatu.order.dto.OrderDetail;
import com.huatu.order.dto.OrderMoneyDto;
import com.huatu.order.service.paike.GoodsListService;
import com.huatu.order.service.paike.OrderService;
import com.huatu.order.service.paike.StudentService;
import com.huatu.paike.api_test.dto.NewOrderCostItem;
import com.huatu.paike.api_test.dto.OrderCostItem;
import com.huatu.paike.api_test.dto.OrderDurationWaste;
import com.huatu.paike.api_test.service.impl.CostOrderService;
import com.huatu.sku.entity.GoodsDetail;
import com.huatu.sku.service.CourseService;
import com.huatu.sku.service.GoodsService;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import org.apache.commons.lang3.StringUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
@MapperScan("com.huatu.paike.**.mapper")
//@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
@ImportResource({ "classpath:dubbo-consumer.xml" })
public class WebApplication implements CommandLineRunner {

    @Autowired
    GoodsListService goodListService;

    @Autowired
    GoodsService goodsService;

    @Autowired
    OrderService orderService;

    @Autowired
    StudentService studentService;

    @Autowired
    CourseService courseServie;

    @Autowired
    StageService stageService;

    @Autowired
    SubjectService subjectService;

    @Autowired
    EhrNodeService nodeService;

    @Autowired
    CostOrderService costOrderService;

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }



    @Override
    public void run(String...args) throws Exception {



        // queryTeacherHistory();
        // queryLessonDetail();
        // queryCsstConpensate();
        // getOrderPriceInfo("XC201812110000436_3484");
        // readFile("C:\\Users\\w\\Desktop\\201812排课系统推送数据.csv", "C:\\Users\\w\\Desktop\\12_out.csv");
        //readFile("C:\\Users\\w\\Desktop\\201901排课系统推送数据.csv", "C:\\Users\\w\\Desktop\\1_out.csv");
        //System.exit(0);
/*        List<Long> subList=Lists.newArrayList(606974L,
                606975L,
                606976L);
        List<OssId2CssDto> ossId2CssDtos=ossMapper.queryCss(subList);

        Map<Long,ClassStageSubject> ossId2CssMap=ossId2CssDtos.stream().collect(Collectors.toMap(a->a.getOssId(), a->a.getCss()));
        System.out.println(ossId2CssMap);
        System.exit(0);*/
        /*OrderInfoDto dto=costOrderService.queryOrderCostInfo(150853L);

        List<com.huatu.order.dto.OrderInfoDto> result=orderService.getOrderInfos(Lists.newArrayList(150853L));
        System.out.println(JsonUtil.toStr(dto));
        System.out.println(JsonUtil.toStr(result));*/
        //costOrderService.buildCostOrder_test();

        List<com.huatu.order.dto.OrderInfoDto> orderList = orderService.getOrderInfos(Lists.newArrayList(318258L));
        System.out.println(orderList);
        OrderDetail orderDetail =
                orderService.getOrderDetail("XC201904050001128", "WMGQFJ4X19003WYA", 318258L);
        if (null == orderDetail) {
            throw new BusinessException(CommonErrorCode.BUSINESS_ERROR, "orderDetail is null");
        }
        GoodsDetail goodsDetail = goodsService.getGoodsDetail(orderDetail.getGoodsNo());
        if (goodsDetail == null || StringUtils.isEmpty(goodsDetail.getProductNo())) {
            throw new BusinessException(CommonErrorCode.BUSINESS_ERROR, "根据订单所属商品查询不到商品详情");
        }
        System.out.println(orderDetail);
        System.out.println(goodsDetail);
    }

    /*
     * public void queryTeacherHistory() { TeachingHistoryReqDto params = new TeachingHistoryReqDto();
     * params.setBeginTime(null); params.setEndTime(null); params.setStaffNo("041572"); TeachingHistoryListRespDto dto =
     * teacherService.queryTeachingHistory(params); System.out.println(dto); }
     * 
     * public void queryLessonDetail() { LessonDetailReq dto = new LessonDetailReq(); dto.setLessonId(795L);
     * dto.setTimeDetailId(2335L); LessonDetailRsp rsp = teacherService.queryLessonDetail(dto); System.out.println(rsp);
     * }
     */

    /*
     * public void queryCsstConpensate() { List<Long> csstIds = Lists.newArrayList(); csstIds.add(1434L);
     * csstIds.add(1440L); Map<Long, CsstCompensateDto> result = classService.queryExamTypeByCsstId(csstIds);
     * System.out.println(result); }
     */

    /**
     * 订单信息
     *
     * @param orderNo
     * @return
     */
    public void getOrderPriceInfo(String orderNo) {
        String[] strArr = orderNo.split("_");
        long orderGoodId = Long.parseLong(strArr[1]);
        OrderMoneyDto moneyInfo = orderService.getOrderMoneyInfo(orderGoodId);
        System.out.println(moneyInfo);
        OrderInfoDto orderInfo = new OrderInfoDto();
        orderInfo.setProductTypeCode(moneyInfo.getProductTypeCode());
        orderInfo.setRealpay(moneyInfo.getRealpay());
        orderInfo.setTuition(moneyInfo.getTuition());
        orderInfo.setExtra(moneyInfo.getExtra());
        orderInfo.setStagePriceMap(moneyInfo.getStagePriceMap());
        orderInfo.setStageIdToSubjectDurationMap(moneyInfo.getStageIdToSubjectDurationMap());
        orderInfo.caculate();
        System.out.println(JsonUtil.toStr(orderInfo));
    }

    // LICENCE_ID ORDER_NO CLASS_NAME GOODS_NO PROTOCOL_TYPE STAGE_ID SUBJECT_ID
    // cos.DURATION/60 START_DATE END_DATE xue_cost za_cost
    public void readFile(String path, String outPath) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path), 1024 * 1024 * 4);
        List<OrderCostItem> list = Lists.newArrayList();

        Set<String> goodsNoSet = Sets.newHashSet();
        // 跳过第一行
        bufferedReader.readLine();
        String data = bufferedReader.readLine();
        while (StringUtils.isNotEmpty(data)) {
            String[] arr = data.split("(?<=\\\"),(?=\\\")");
            for (int i = 0; i < arr.length; i++) {
                String item = arr[i];
                arr[i] = item.substring(1, item.length() - 1);
                // arr[i]=new String(arr[i].getBytes("utf-8"),"utf-8");
            }
            OrderCostItem item = new OrderCostItem();
            item.setLicenceId(arr[0]);
            item.setOrderNo(arr[1]);
            item.setClassName(arr[2]);
            item.setGoodsNo(arr[3]);
            item.setProtocolType(arr[4]);
            try {
                item.setStageId(Long.valueOf(arr[5]));
            } catch (Exception e) {
                log.error("{}", arr);
            }
            item.setSubjectId(Long.valueOf(arr[6]));
            item.setDuration(Double.valueOf(arr[7]));
            item.setStartTime(arr[8]);
            item.setEndTime(arr[9]);
            item.setXueCost(Double.valueOf(arr[10]));
            item.setZaCost(Double.valueOf(arr[11]));
            list.add(item);
            goodsNoSet.add(item.getGoodsNo());
            data = bufferedReader.readLine();
        }
        bufferedReader.close();
        Map<String, GoodsDetail> maps = Maps.newHashMap();
        Set<Long> departmentIds = Sets.newHashSet();
        goodsNoSet.stream().forEach(a -> {
            GoodsDetail goodsDetail = null;
            try {
                goodsDetail = goodsService.getGoodsDetail(a);
            } catch (Exception e) {
                log.error("query goodsNo={} fali", a);
            }
            maps.put(a, goodsDetail);
            if (goodsDetail != null) {
                departmentIds.add(goodsDetail.getSubDepartmentId());
            }
        });
        Map<Long, String> stageId2NameMap =
            stageService.getAll().stream().collect(Collectors.toMap(a -> a.getId(), a -> a.getName()));
        Map<Long, String> subjectId2NameMap =
            subjectService.getAll().stream().collect(Collectors.toMap(a -> a.getId(), a -> a.getName()));
        List<Node> nodes = nodeService.getByIds(departmentIds);
        Map<Long, Node> id2Nodes = nodes.stream().collect(Collectors.toMap(a -> a.getId(), a -> a));
        List<NewOrderCostItem> result = Lists.newArrayList();
        for (int i = 0; i < list.size(); i++) {
            OrderCostItem a = list.get(i);
            GoodsDetail detail = maps.get(a.getGoodsNo());
            NewOrderCostItem item = new NewOrderCostItem();
            if (detail != null) {
                item.setBuName(detail.getBusinessDepartmentName());
                EhrNode ehrNode = (EhrNode) id2Nodes.get(detail.getSubDepartmentId());
                item.setCompanyName(
                    ehrNode != null && ehrNode.getCompany() != null ? ehrNode.getCompany().getName() : "");
                item.setDepartmentName(detail.getSubDepartment());
                item.setExamType(detail.getExamTypeName());
                item.setPenOrFace(String.valueOf(detail.getExamWay()));
                item.setProtocolType(detail.getProtocolTypeName());
                item.setGoodsStartTime(DateUtil.getStrByDate(detail.getStartTime()));
                item.setGoodsEndTime(DateUtil.getStrByDate(detail.getEndTime()));
            }
            item.setOrderNo(a.getOrderNo());
            item.setGoodsNo(a.getGoodsNo());
            item.setClassName(a.getClassName());
            item.setLicenceId(a.getLicenceId());
            item.setDuration(a.getDuration());
            item.setEndTime(a.getEndTime());
            item.setStartTime(a.getStartTime());
            item.setStageId(a.getStageId());
            item.setStageName(stageId2NameMap.getOrDefault(a.getStageId(), ""));
            item.setSubjectId(a.getSubjectId());
            item.setSubjectName(subjectId2NameMap.getOrDefault(a.getSubjectId(), ""));
            item.setXueCost(a.getXueCost());
            item.setZaCost(a.getZaCost());
            result.add(item);
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outPath), 1024 * 1024 * 4);
        StringBuffer sb = new StringBuffer();
        sb.append("\"").append(new String("听课证号".getBytes("utf-8"), "utf-8")).append("\"").append(",");
        sb.append("\"").append(new String("学员订单号".getBytes("utf-8"), "utf-8")).append("\"").append(",");
        sb.append("\"").append(new String("班级名称".getBytes("utf-8"), "utf-8")).append("\"").append(",");
        sb.append("\"").append(new String("商品编号".getBytes("utf-8"), "utf-8")).append("\"").append(",");
        sb.append("\"").append(new String("公司".getBytes("utf-8"), "utf-8")).append("\"").append(",");
        sb.append("\"").append(new String("商品分部".getBytes("utf-8"), "utf-8")).append("\"").append(",");
        sb.append("\"").append(new String("事业部".getBytes("utf-8"), "utf-8")).append("\"").append(",");
        sb.append("\"").append(new String("笔面试".getBytes("utf-8"), "utf-8")).append("\"").append(",");
        sb.append("\"").append(new String("协议类型".getBytes("utf-8"), "utf-8")).append("\"").append(",");
        sb.append("\"").append(new String("考试类型".getBytes("utf-8"), "utf-8")).append("\"").append(",");
        sb.append("\"").append(new String("阶段".getBytes("utf-8"), "utf-8")).append("\"").append(",");
        sb.append("\"").append(new String("科目".getBytes("utf-8"), "utf-8")).append("\"").append(",");
        sb.append("\"").append(new String("时长（小时）".getBytes("utf-8"), "utf-8")).append("\"").append(",");
        sb.append("\"").append(new String("科目开课时间".getBytes("utf-8"), "utf-8")).append("\"").append(",");
        sb.append("\"").append(new String("科目结课时间".getBytes("utf-8"), "utf-8")).append("\"").append(",");
        sb.append("\"").append(new String("学费".getBytes("utf-8"), "utf-8")).append("\"").append(",");
        sb.append("\"").append(new String("杂费".getBytes("utf-8"), "utf-8")).append("\"").append(",");
        sb.append("\"").append(new String("商品开课时间".getBytes("utf-8"), "utf-8")).append("\"").append(",");
        sb.append("\"").append(new String("商品结课时间".getBytes("utf-8"), "utf-8")).append("\"").append("\n");
        bufferedWriter.write(sb.toString());
        for (int i = 0; i < result.size(); i++) {
            NewOrderCostItem a = result.get(i);
            StringBuffer sb1 = new StringBuffer();
            sb1.append("\"").append(new String(a.getLicenceId().getBytes("utf-8"), "utf-8")).append("\"").append(",");
            sb1.append("\"").append(new String(a.getOrderNo().getBytes("utf-8"), "utf-8")).append("\"").append(",");
            sb1.append("\"").append(new String(a.getClassName().getBytes("utf-8"), "utf-8")).append("\"").append(",");
            sb1.append("\"").append(new String(a.getGoodsNo().getBytes("utf-8"), "utf-8")).append("\"").append(",");
            sb1.append("\"").append(new String(a.getCompanyName().getBytes("utf-8"), "utf-8")).append("\"").append(",");
            sb1.append("\"").append(new String(a.getDepartmentName().getBytes("utf-8"), "utf-8")).append("\"")
                .append(",");
            sb1.append("\"").append(new String(a.getBuName().getBytes("utf-8"), "utf-8")).append("\"").append(",");
            sb1.append("\"").append(new String(a.getPenOrFace().getBytes("utf-8"), "utf-8")).append("\"").append(",");
            sb1.append("\"").append(new String(a.getProtocolType().getBytes("utf-8"), "utf-8")).append("\"")
                .append(",");
            sb1.append("\"").append(new String(a.getExamType().getBytes("utf-8"), "utf-8")).append("\"").append(",");
            sb1.append("\"").append(new String(a.getStageName().getBytes("utf-8"), "utf-8")).append("\"").append(",");
            sb1.append("\"").append(new String(a.getSubjectName().getBytes("utf-8"), "utf-8")).append("\"").append(",");
            sb1.append("\"").append(a.getDuration()).append("\"").append(",");
            sb1.append("\"").append(new String(a.getStartTime().getBytes("utf-8"), "utf-8")).append("\"").append(",");
            sb1.append("\"").append(new String(a.getEndTime().getBytes("utf-8"), "utf-8")).append("\"").append(",");
            sb1.append("\"").append(a.getXueCost()).append("\"").append(",");
            sb1.append("\"").append(a.getZaCost()).append("\"").append(",");
            sb1.append("\"").append(new String(a.getGoodsStartTime().getBytes("utf-8"), "utf-8")).append("\"")
                .append(",");
            sb1.append("\"").append(new String(a.getGoodsEndTime().getBytes("utf-8"), "utf-8")).append("\"")
                .append("\n");
            try {
                bufferedWriter.write(sb1.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        bufferedWriter.close();
    }

    private StringBuffer append(StringBuffer sb, Object object, boolean end) {
        sb.append("\"").append(object).append("\"");
        if (end) {
            sb.append("\n");
        } else {
            sb.append(",");
        }
        return sb;
    }

    private OrderDurationWaste buildOrderDuration(String[] arr) {
        OrderDurationWaste item = new OrderDurationWaste();
        item.setOrderNo(arr[0]);
        item.setLicenseId(arr[1]);
        item.setGoodsNo(arr[2]);
        item.setBuyTime(arr[3]);
        item.setHaveFinish(arr[4]);
        item.setAllDuration(Double.valueOf(arr[5]));
        item.setFinishDuration(Double.valueOf(arr[6]));
        if (arr.length > 7) {
            item.setFinishIn_12_Duration(Double.valueOf(arr[7]));
            item.setFinishIn_01_Duration(Double.valueOf(arr[8]));
        }
        return item;
    }

    public void readFile_1(String path, String outPath) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path), 1024 * 1024 * 4);
        List<OrderDurationWaste> list = Lists.newArrayList();
        Set<String> goodsNoSet = Sets.newHashSet();
        // 跳过第一行
        bufferedReader.readLine();
        String data = bufferedReader.readLine();
        while (StringUtils.isNotEmpty(data)) {
            String[] arr = data.split("(?<=\\\"),(?=\\\")");
            for (int i = 0; i < arr.length; i++) {
                String item = arr[i];
                // 去除两边的双引号
                arr[i] = item.substring(1, item.length() - 1);
            }
            OrderDurationWaste tem = buildOrderDuration(arr);
            list.add(tem);
            goodsNoSet.add(tem.getGoodsNo());
            data = bufferedReader.readLine();
        }
        bufferedReader.close();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outPath), 1024 * 1024 * 4);
        StringBuffer sb = new StringBuffer();
        append(sb, "订单编号", false);
        append(sb, "听课证号", false);
        append(sb, "商品编号", false);
        append(sb, "购买时间", false);
        append(sb, "是否已上完", false);
        append(sb, "总课时数", false);
        append(sb, "已结课课时数", true);
/*        append(sb, "已结课课时数", false);
        append(sb, "12月份结课课时数", false);
        append(sb, "1月份结课课时数", true);*/
        bufferedWriter.write(sb.toString());
        for (int i = 0; i < list.size(); i++) {
            OrderDurationWaste a = list.get(i);
            StringBuffer sb1 = new StringBuffer();
            append(sb1, a.getOrderNo(), false);
            append(sb1, "商品编号", false);
            append(sb1, "购买时间", false);
            append(sb1, "是否已上完", false);
            append(sb1, "总课时数", false);
            append(sb1, "已结课课时数", true);
        }
        bufferedWriter.close();
    }
}
