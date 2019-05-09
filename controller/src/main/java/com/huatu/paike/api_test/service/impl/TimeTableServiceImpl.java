package com.huatu.paike.api_test.service.impl;

import com.huatu.common.dto.resp.IdAndNameDto;
import com.huatu.common.enums.EnumDto;
import com.huatu.common.enums.ExamWayEnum;
import com.huatu.common.enums.TeachingMethod;
import com.huatu.paike.api_test.dto.NoAndNameScoreDto;
import com.huatu.paike.api_test.dto.PreparedInfo;
import com.huatu.paike.api_test.dto.TimeSliceDto;
import com.huatu.paike.api_test.dto.TimeTableDto;
import com.huatu.paike.api_test.service.PaikeTeacherType;
import com.huatu.paike.api_test.service.PreparedService;
import com.huatu.paike.api_test.utils.StatusUtils;
import com.huatu.paike.api_test.service.TimeTableService;
import com.huatu.paike.dal.paike.entity.ClassStageSubjectTeacher;
import com.huatu.paike.dal.paike.mapper.ClassLessonMapper;
import com.huatu.paike.dal.paike.mapper.ClassStageSubjectTeacherMapper;
import com.huatu.shizi.service.dto.response.TeacherListResp;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName TimeTableServiceImpl
 * @Description
 * @Author zhangjing
 * @DATE 2019/5/8 11:42
 * @Version 1.0
 */
@Service
public class TimeTableServiceImpl implements TimeTableService {

    @Autowired
    ClassStageSubjectTeacherMapper classStageSubjectTeacherMapper;

    @Autowired
    private PreparedService preparedService;

    @Autowired
    private ClassLessonMapper classLessonMapper;

    @Override
    public List<TimeTableDto> classTableList(Date startDate, Date endDate) {
        List<ClassStageSubjectTeacher> csstList = classStageSubjectTeacherMapper.queryListByClassId(null,
                startDate, endDate, null, null, null, null, null,null);
        return buildTimeTable(csstList, null, null);
    }

    /**
     * 构建课表信息
     *
     * @param csstList
     * @param teacherNo
     * @param studentId
     * @return
     */
    private List<TimeTableDto> buildTimeTable(List<ClassStageSubjectTeacher> csstList, String teacherNo,
                                              Long studentId) {
        if (CollectionUtils.isEmpty(csstList)) {
            return Lists.newArrayList();
        }
        PreparedInfo preparedInfo = new PreparedInfo(true, true, true, false, true, true,true,true);
        for (ClassStageSubjectTeacher csst : csstList) {
            if (csst.getId() != null) {
                preparedInfo.getCsstIds().add(csst.getId());
            } else {
                String key = csst.getLessonTableId() + "_" + csst.getTeacherStaffNo();
                preparedInfo.getDoubleTeacherLtId_staffNoList().add(key);
                preparedInfo.setDoubleTeacherDuration(key, csst.getDuration());
            }
            preparedInfo.getStageIds().add(csst.getStageId());
            preparedInfo.getSubjectIds().add(csst.getSubjectId());
            preparedInfo.getTeacherNos().add(csst.getTeacherStaffNo());
            preparedInfo.getClassIds().add(csst.getClassId());
            if (!csst.getLessonTableId().equals(0L)) {
                preparedInfo.getLessonTableIds().add(csst.getLessonTableId());
            }
        }
        // 教室IDs 或学生端教室ID
        Map<Long, List<Long>> roomIdsMap = classLessonMapper.queryClassRoomIdsByCsstIds(preparedInfo.getCsstIds());
        for (List<Long> roomIds : roomIdsMap.values()) {
            preparedInfo.getRoomIds().addAll(roomIds);
        }
        // 主讲端IDs
        Map<Long, List<Long>> teacherDevIdMap =
                classStageSubjectTeacherMapper.queryTeacherDevIdByCsstIds(preparedInfo.getCsstIds());
        if (teacherDevIdMap != null && teacherDevIdMap.size() > 0) {
            for (List<Long> roomIds : teacherDevIdMap.values()) {
                preparedInfo.getRoomIds().addAll(roomIds);
            }
        }
        preparedService.buildBusinessAndTeachWay(preparedInfo,csstList );
        /**
         * 教室，阶段，科目
         */
        preparedService.buildSomPareparedInfo(preparedInfo);
        /**
         * 主讲
         */
        preparedService.buildCsstInfo(preparedInfo);
        /**
         * 助教
         */
        preparedService.buildCssaInfo(preparedInfo);
        /**
         * 老师信息
         */
        // preparedService.buildTeacherInfo(preparedInfo);
        /**
         * 老师信息
         */
        preparedService.buildTeacherInfo2(preparedInfo);
        /**
         * lessonTableNO
         */
        preparedService.buildLessonTableNo(preparedInfo);
        if (studentId == null) {// 学生的课次天数,时间与班级老师的不同
            preparedService.buildCsstDaysInfo(preparedInfo);
            preparedService.buildCsstDurationInfo(preparedInfo);
        } else {
            preparedService.buildCsstDaysInfo(preparedInfo, studentId);
            preparedService.buildCsstDurationInfo(preparedInfo, studentId);
        }

        if (studentId != null) {
            preparedService.buildFinishedDurationInfo(preparedInfo, studentId);
        }
        if (studentId == null && teacherNo == null) {
            preparedService.buildStudentCount(preparedInfo);
        }
        List<TimeTableDto> result = Lists.newArrayList();
        Date now = new Date();
        for (ClassStageSubjectTeacher csst : csstList) {
            result.add(build(csst, preparedInfo, teacherNo, studentId, now, roomIdsMap, teacherDevIdMap));
        }
        return result;
    }

    /**
     * 构建课表信息
     *
     * @param csst
     * @param info
     * @param teacherNo
     * @param studentId
     * @param roomIdsMap
     * @return
     */
    private TimeTableDto build(ClassStageSubjectTeacher csst, PreparedInfo info, String teacherNo, Long studentId,
                               Date now, Map<Long, List<Long>> roomIdsMap, Map<Long, List<Long>> teacherRoomIdMap) {
        TimeTableDto dto = new TimeTableDto();

        String cssKey=String.format("%d#%d#%d#%d",csst.getClassId(),csst.getStageId(),csst.getSubjectId(),csst.getBatchNum());

        dto.setId(csst.getId());
        dto.setStage(info.getStage(csst.getStageId()));
        dto.setBatchNum(csst.getBatchNum());
        dto.setSubject(info.getSubject(csst.getSubjectId()));
        dto.setStuRoomList(info.getRoom(roomIdsMap.get(csst.getId())));
        int day = info.getCsstDays(csst.getId());
        int duration = info.getCsstDuration(csst.getId());
        if (csst.getTeachWay() == TeachingMethod.DOUBLE_TEACHER.getValue()) {
            String key = csst.getLessonTableId() + "_" + csst.getTeacherStaffNo();
            if (day == 0) {
                day = info.getDoubleTeacherDays(key);
            }
            if (duration == 0) {
                duration = info.getDoubleTeacherDuration(key);
            }
        }
        dto.setDays(day);
        dto.setDurations(duration);
        dto.setStartDate(TimeSliceDto.getDate(csst.getStartDate()));
        dto.setEndDate(TimeSliceDto.getDate(csst.getEndDate()));
        dto.setClassId(csst.getClassId());
        dto.setClassName(info.getClassName(csst.getClassId()));
        dto.setClassNo(info.getClassNo(csst.getClassId()));
        dto.setBuId(info.getBuId(cssKey));
        dto.setTeachWay(info.getTeachWay(cssKey));
        dto.setExamType(info.getExamType(csst.getClassId()));
        if(info.getExamWay(cssKey)==null){
            dto.setExamWay(info.getExamWay(cssKey));
        }else{
            dto.setExamWay(info.getExamWay(cssKey));
        }


        dto.setStuCount(info.getStuCount(csst.getId()));
        dto.setAccident(csst.getAccidentStatus().intValue() != 0);
        dto.setLessonTableId(csst.getLessonTableId());
        dto.setLessonTableNo(info.getLessonTableNo(csst.getLessonTableId()));
        dto.setTeachWay(csst.getTeachWay());
        dto.setTeacherRoomList(info.getRoom(teacherRoomIdMap.getOrDefault(csst.getId(), null)));
        dto.setStatus(EnumDto.from(
                StatusUtils.getRealStatusEnumService((int) csst.getStatus(), csst.getStartDate(), csst.getEndDate())));

        TeacherListResp teacherListResp =
                info.getTeacherMap().getOrDefault(csst.getTeacherStaffNo(), new TeacherListResp());
        dto.setTeacher(buildTeacher(csst.getTeacherStaffNo(), csst.getScore(), csst.getScoreDetail(),
                PaikeTeacherType.master.getValue(), info.getTeacherName(csst.getTeacherStaffNo()),
                teacherListResp.getMobile(), teacherListResp.getTeacherUnit()));
        dto.setScore(csst.getScore());
        Set<NoAndNameScoreDto> assitants =
                Sets.newHashSet(info.getCssaMap().getOrDefault(csst.getId(), Maps.newHashMap()).values());
        for (NoAndNameScoreDto noAndNameScoreDto : assitants) {
            noAndNameScoreDto.setName(info.getTeacherName(noAndNameScoreDto.getStaffNo()));
            if (teacherNo != null && teacherNo.equals(noAndNameScoreDto.getStaffNo())) {
                dto.setScore(noAndNameScoreDto.getScore());
            }
        }
        if (studentId != null) {
            dto.setFinishedDurations(info.getFinishedDuration(csst.getId()));
        }
        // 主讲不是要查询的老师就将,将要查的老师设置为助教
        if (teacherNo != null && !teacherNo.equals(dto.getTeacher().getStaffNo())) {
            Set<NoAndNameScoreDto> assList =
                    Sets.newHashSet(assitants.stream().filter(a -> a.getStaffNo().equals(teacherNo)).findFirst().get());
            dto.setAssistants(assList);
        } else {
            dto.setAssistants(assitants);
        }
        dto.setAccident(csst.getAccidentStatus().intValue() != 0);
        return dto;
    }

    /**
     * 构建老师信息
     *
     * @param teacherNo
     * @param score
     * @param scoreDetail
     * @param teacherType
     * @param teacherName
     * @return
     */
    private NoAndNameScoreDto buildTeacher(String teacherNo, int score, String scoreDetail, int teacherType,
                                           String teacherName, String mobile, IdAndNameDto teacherUnit) {
        NoAndNameScoreDto dto = new NoAndNameScoreDto();
        dto.setStaffNo(teacherNo);
        dto.setScore(score);
        dto.setScoreDetail(scoreDetail);
        dto.setTeacherType(PaikeTeacherType.master.getValue());
        dto.setName(teacherName);
        dto.setMobile(mobile);
        dto.setTeacherUnit(teacherUnit);
        return dto;
    }
}
