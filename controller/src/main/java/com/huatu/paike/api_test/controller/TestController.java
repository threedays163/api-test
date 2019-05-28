package com.huatu.paike.api_test.controller;

import com.google.common.collect.Lists;
import com.huatu.common.dto.resp.IdAndNameDto;
import com.huatu.common.dto.resp.Node;
import com.huatu.common.enums.ExamWayEnum;
import com.huatu.common.errorcode.CommonErrorCode;
import com.huatu.common.exception.BusinessException;
import com.huatu.common.service.dto.resp.BusinessUnitRespDto;
import com.huatu.common.utils.DateUtil;
import com.huatu.paike.api_test.dto.LessonPrintDto;
import com.huatu.paike.api_test.dto.NoAndNameScoreDto;
import com.huatu.paike.api_test.dto.TimeTableDto;
import com.huatu.paike.api_test.service.CommonService;
import com.huatu.paike.api_test.service.NodeService;
import com.huatu.paike.api_test.service.OrderVersionService;
import com.huatu.paike.api_test.service.TimeTableService;
import com.huatu.paike.api_test.utils.PojoExport2Excel;
import com.huatu.paike.api_test.utils.TeachWayUtils;
import com.huatu.paike.dal.goodsOrder.entity.OrderInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @ClassName TestController
 * @Description
 * @Author zhangjing
 * @DATE 2019/5/8 14:14
 * @Version 1.0
 */
@Slf4j
@RequestMapping("/test")
@Controller
public class TestController {

    @Autowired
    TimeTableService timeTableService;

    @Autowired
    CommonService commonService;

    @Autowired
    NodeService nodeService;

    @Autowired
    OrderVersionService orderVersionService;

    @GetMapping("/diffOrderVersion")
    @ResponseBody
    public List<String> showDiffOrderVersion(){
        List<OrderInfo> list=orderVersionService.checkDiffOrderVersion();
        list.stream().forEach(a-> System.out.println(a.getOrderNo()));
        return list.stream().map(a->a.getOldOrderNo()).collect(Collectors.toList());
    }

    @GetMapping("/orderVersion.json")
    @ResponseBody
    public Object getMoneyInfoByOrderGoodsId(@RequestParam Long orderGoodsId){
        return orderVersionService.getOrderInfoByOrderGoodsId(Lists.newArrayList(orderGoodsId));
    }

    @GetMapping("/export")
    public void exportLesson(HttpServletRequest request, HttpServletResponse response){
        String startTime = request.getParameter("startTime");
        String endTime = request.getParameter("endTime");
        Date startDate = null;
        Date endDate = null;
        if (StringUtils.isNotBlank(startTime)) {
            startDate = DateUtil.getStrToDate("yyyy-MM-dd", startTime);
        }
        if (StringUtils.isNotBlank(endTime)) {
            endDate = DateUtil.getStrToDate("yyyy-MM-dd", endTime);
        }
        List<TimeTableDto> list = timeTableService.classTableList(startDate,endDate);
        try {

            List<LessonPrintDto> resultList=convert(list);

            String returnName = "data";// 表名
            String sheetName = "课表";
            PojoExport2Excel.printByAnnotation(resultList, LessonPrintDto.class, request, response,
                    returnName, sheetName, Lists.newArrayList(), true);
        } catch (Exception e) {
            log.error("exportTeachingHistory", e);
            throw new BusinessException(CommonErrorCode.SYSTEM_ERROR, "教师课表导出异常");
        }
    }

    private List<LessonPrintDto> convert(List<TimeTableDto> list){
        if(CollectionUtils.isEmpty(list)){
            return Lists.newArrayList();
        }

        List<LessonPrintDto> resultList=Lists.newArrayList();

        Map<Long, BusinessUnitRespDto> businessUnitRespDtoMap=commonService.getAllUnitMap();
        Map<String,String> examTypeMap=commonService.getAllExamType2NameMap();

        for(TimeTableDto dto:list){
            LessonPrintDto item=new LessonPrintDto();
            StringBuilder assisStr=new StringBuilder();
            boolean isFirst=true;
            for(NoAndNameScoreDto dto1 :dto.getAssistants()) {
                if(isFirst) {
                    assisStr.append(dto1.getName());
                }else{
                    assisStr.append(",").append(dto1.getName());
                }
                isFirst = false;
            }
            item.setAssisTeacher(assisStr.toString());
            item.setBusinessName(businessUnitRespDtoMap.get(dto.getBuId()).getName());
            item.setClassName(dto.getClassName());
            item.setClassNo(dto.getClassNo());
            item.setDurationStr(String.format("%d时%d分",dto.getDurations()/60,dto.getDurations()%60));
            item.setEndTime(dto.getEndDate());
            item.setExamType(examTypeMap.get(dto.getExamType()));
            item.setMasterTeahcer(dto.getTeacher().getName());
            if(dto.getBatchNum()>0){
                item.setStageName(dto.getStage().getName()+dto.getBatchNum());
            }else{
                item.setStageName(dto.getStage().getName());
            }
            if(dto.getSubSchool()!=null&&dto.getSubSchool()>=0){
                Node node=nodeService.getNode(dto.getSubSchool());
                if(node!=null&&StringUtils.isNotEmpty(node.getName())){
                    item.setSubSchool(node.getName());
                }
            }

            item.setSubjectName(dto.getSubject().getName());
            item.setStartTime(dto.getStartDate());
            item.setStatus(dto.getStatus().getName());
            item.setStuCount(dto.getStuCount());
            item.setTeachWay(TeachWayUtils.getTeachWay(dto.getTeachWay()).getName());
            if(StringUtils.isEmpty(dto.getExamWay())){
                item.setExamWay("笔试");
            }else{
                ExamWayEnum examWayEnum=ExamWayEnum.get(dto.getExamWay());
                if(examWayEnum==null){
                    item.setExamWay("笔试");
                }else{
                    item.setExamWay(examWayEnum.getDesc());
                }
            }
            if(CollectionUtils.isNotEmpty(dto.getStuRoomList())){
                IdAndNameDto room=new IdAndNameDto();
                for(IdAndNameDto i:dto.getStuRoomList()){
                    room=i;
                    break;
                }
                item.setRoom(room.getName());
            }else{

                item.setRoom("");
            }
            resultList.add(item);
        }
        return resultList;
    }
}
