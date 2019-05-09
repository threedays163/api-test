
/**
 * Huatu.com Inc. Copyright (c) 2014-2018 All Rights Reserved.
 */

package com.huatu.paike.api_test.service.impl;

import com.huatu.common.dto.resp.IdAndNameDto;
import com.huatu.common.service.StageService;
import com.huatu.common.service.SubjectService;
import com.huatu.paike.api_test.dto.NoAndNameScoreDto;
import com.huatu.paike.api_test.dto.PreparedInfo;
import com.huatu.paike.api_test.dto.TimeSliceDto;
import com.huatu.paike.api_test.service.ClassroomCommonService;
import com.huatu.paike.api_test.service.PaikeTeacherType;
import com.huatu.paike.api_test.service.PreparedService;
import com.huatu.paike.api_test.service.TimeTableService;
import com.huatu.paike.dal.classes.entity.ClassInfo;
import com.huatu.paike.dal.classes.mapper.ClassInfoMapper;
import com.huatu.paike.dal.paike.entity.*;
import com.huatu.paike.dal.paike.mapper.*;
import com.huatu.paike.dal.place.entity.ClassRoom;
import com.huatu.paike.dal.teachingaffairs.dto.LessonTableId2StaffNoDto;
import com.huatu.paike.dal.teachingaffairs.mapper.LessonTableMapper;
import com.huatu.paike.dal.util.ListSplitUtil;
import com.huatu.shizi.service.dto.response.TeacherListResp;
import com.huatu.shizi.service.dto.response.TeacherListRespDto;
import com.huatu.shizi.service.teacher.TeacherQueryService;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @title PreparedServiceImpl
 * @desc TODO
 * @author shanyu
 * @date 2018年7月30日
 * @version 1.0
 */
@Service
public class PreparedServiceImpl implements PreparedService {

    @Autowired
    private StageService stageService;

    @Autowired
    private SubjectService subjectService;

    /**
     * 这是shizi系统提供的接口，用于根据查询老师的姓名。
     */
    @Autowired
    private TeacherQueryService teacherQueryService;

    @Autowired
    private LessonTimeDetailMapper lessonTimeDetailMapper;

    @Autowired
    private ClassStageSubjectTeacherMapper csstMapper;

    @Autowired
    private ClassLessonMapper classLessonMapper;

    @Autowired
    LessonTableMapper lessonTableMapper;

    @Autowired
    private ClassroomCommonService classroomCommonService;

    @Autowired
    private LessonTeacherMapper lessonTeacherMapper;

    @Autowired
    private ClassInfoMapper classInfoMapper;

    @Autowired
    TimeTableService timeTableService;

    @Autowired
    ClassStageSubjectMapper cssMapper;

    @Override
    public void buildSomPareparedInfo(PreparedInfo info) {
        if (info == null) {
            return;
        }
        buildRoomInfo(info);
        buildStageInfo(info);
        buildSubjectInfo(info);
        buildLessonTimeArrInfo(info);
        buildClassInfo(info);

    }

    /**
     * 构建老师信息
     */
    /*
     * @Override public void buildTeacherInfo(PreparedInfo info) { if (info.isNeedTeacherInfo()) { if
     * (CollectionUtils.isNotEmpty(info.getTeacherNos())) { // 调用shizi接口，根据工号批量查询老师姓名。 List<String> staffNos =
     * Lists.newArrayList(info.getTeacherNos()); Map<String, String> teacherNameMap =
     * teacherQueryService.listIdAndNoByStaffNos(staffNos);
     * 
     * info.setTeacherNameMap(teacherNameMap); } else { info.setTeacherNameMap(Maps.newHashMap()); } } }
     */

    /**
     * 构建老师信息
     */
    @Override
    public void buildTeacherInfo2(PreparedInfo info) {
        if (info.isNeedTeacherInfo()) {
            if (CollectionUtils.isNotEmpty(info.getTeacherNos())) {
                // 调用shizi接口，根据工号批量查询老师姓名。
                TeacherListRespDto teacherListDto =
                    teacherQueryService.listStaffNos(Lists.newArrayList(info.getTeacherNos()));
                if (teacherListDto == null || CollectionUtils.isEmpty(teacherListDto.getList())) {
                    info.setTeacherMap(Maps.newHashMap());
                    info.setTeacherNameMap(Maps.newHashMap());
                    return;
                }
                Map<String, TeacherListResp> teacherMap =
                    teacherListDto.getList().stream().collect(Collectors.toMap(a -> a.getStaffNo(), a -> a));

                Map<String, String> teacherNameMap = teacherListDto.getList().stream()
                    .collect(Collectors.toMap(TeacherListResp::getStaffNo, a -> a.getChineseName()));
                info.setTeacherMap(teacherMap);
                info.setTeacherNameMap(teacherNameMap);
            } else {
                info.setTeacherMap(Maps.newHashMap());
                info.setTeacherNameMap(Maps.newHashMap());
            }
        }
    }

    /**
     * 阶段科目主讲信息
     * 
     * @param info
     */
    @Override
    public void buildCsstInfo(PreparedInfo info) {
        if (info.isNeedCsstInfo()) {
            info.setCsstMap(Maps.newHashMap());
            if (CollectionUtils.isNotEmpty(info.getCsstIds())) {
                ClassStageSubjectTeacherCriteria c = new ClassStageSubjectTeacherCriteria();
                c.createCriteria().andIdIn(info.getCsstIds());
                List<ClassStageSubjectTeacher> csstList = csstMapper.selectByExample(c);

                Map<String, TeacherListResp> teacherMap = info.getTeacherMap();
                if (teacherMap == null) {
                    teacherMap = Maps.newHashMap();
                }
                for (ClassStageSubjectTeacher csst : csstList) {
                    if (info.getTeacherNos() != null) {
                        info.getTeacherNos().add(csst.getTeacherStaffNo());
                    }
                    if (csst.getTeacherType().intValue() == PaikeTeacherType.master.getValue()) {
                        NoAndNameScoreDto dto = new NoAndNameScoreDto();
                        dto.setStaffNo(csst.getTeacherStaffNo());
                        dto.setScore(csst.getScore());
                        dto.setTeacherType(csst.getTeacherType());
                        TeacherListResp teacherRsp = teacherMap.get(csst.getTeacherStaffNo());
                        dto.setMobile(teacherRsp == null ? "" : teacherRsp.getMobile());
                        dto.setTeacherUnit(teacherRsp == null ? null : teacherRsp.getTeacherUnit());
                        info.getCsstMap().put(csst.getClassId(), dto);
                    }
                }
            }
        }
    }

    /**
     * 课节时间安排信息
     * 
     * @param info
     */
    @Override
    public void buildLessonTimeArrInfo(PreparedInfo info) {
        if (info.isNeedLessonTimeArrInfo()) {
            if (CollectionUtils.isNotEmpty(info.getLessonIds())
                || CollectionUtils.isNotEmpty(info.getAccidentLessonIds())) {
                List<LessonTimeDetail> lessonDetails = Lists.newArrayList();
                if (CollectionUtils.isNotEmpty(info.getLessonIds())) {
                    lessonDetails
                        .addAll(this.lessonTimeDetailMapper.queryByLessonIds(ListSplitUtil.split(info.getLessonIds())));
                }
                info.setLessonTimeArrMap(
                    lessonDetails.stream().collect(Collectors.groupingBy(a -> a.getLessonId(), Collectors.mapping(a -> {
                        String[] dateArr = new String[2];
                        dateArr[0] = TimeSliceDto.format(a.getStartTime());
                        dateArr[1] = TimeSliceDto.format(a.getEndTime());
                        return dateArr;
                    }, Collectors.toList()))));
            } else {
                info.setLessonTimeArrMap(Maps.newHashMap());
            }
        }
    }

    /**
     * 科目信息
     * 
     * @param info
     */
    private void buildSubjectInfo(PreparedInfo info) {
        if (info.isNeedSubjectInfo()) {
            if (CollectionUtils.isNotEmpty(info.getSubjectIds())) {
                info.setSubjectMap(subjectService.getSubjectListByIds(info.getSubjectIds()).stream()
                    .collect(Collectors.toMap(a -> a.getId(), Function.identity())));
            } else {
                info.setStageMap(Maps.newHashMap());
            }
        }
    }

    /**
     * 阶段信息
     * 
     * @param info
     */
    private void buildStageInfo(PreparedInfo info) {
        if (info.isNeedStageInfo()) {
            if (CollectionUtils.isNotEmpty(info.getStageIds())) {
                info.setStageMap(stageService.getStageListByIds(info.getStageIds()).stream()
                    .collect(Collectors.toMap(a -> a.getId(), Function.identity())));
            } else {
                info.setStageMap(Maps.newHashMap());
            }
        }
    }

    /**
     * 教室信息
     * 
     * @param info
     */
    @Override
    public void buildRoomInfo(PreparedInfo info) {
        if (info.isNeedRoomInfo()) {
            if (CollectionUtils.isEmpty(info.getRoomIds())) {
                info.setRoomMap(Maps.newHashMap());
            } else {
                List<ClassRoom> rooms=Lists.newArrayList();
                Iterator<Long> it=info.getRoomIds().iterator();
                List<Long> temList=Lists.newArrayList();
                while(it.hasNext()){
                    temList.add(it.next());
                    if(temList.size()==100){
                        List<ClassRoom> tem= classroomCommonService.queryList(temList);
                        rooms.addAll(tem);
                        temList.clear();
                    }
                }
                if(temList.size()>0){
                    List<ClassRoom> tem= classroomCommonService.queryList(temList);
                    rooms.addAll(tem);
                }
                info.setRoomMap(rooms.stream().map(a -> new IdAndNameDto(a.getPlaceId(), a.getLocation()))
                    .collect(Collectors.toMap(IdAndNameDto::getId, Function.identity())));
            }
        }
    }

    @Override
    public void buildCsstDaysInfo(PreparedInfo info) {
        if (CollectionUtils.isEmpty(info.getCsstIds())) {
            info.setCsstDaysMap(Maps.newHashMap());
        } else {
            info.setCsstDaysMap(classLessonMapper.queryCsstDaysMap(info.getCsstIds()));
            if (CollectionUtils.isEmpty(info.getDoubleTeacherLtId_staffNoList())) {
                return;
            }
            List<LessonTableId2StaffNoDto> list = Lists.newArrayList();
            info.getDoubleTeacherLtId_staffNoList().stream().forEach(a -> {
                String[] arr = a.split("_");
                list.add(new LessonTableId2StaffNoDto(new Long(arr[0]), arr[1]));
            });
            info.setDoubleTeacherLtId_staffNoList2DaysMap(lessonTableMapper.queryDaysInLessonTableTeacher(list));
        }
    }

    @Override
    public void buildCsstDurationInfo(PreparedInfo info) {
        if (CollectionUtils.isEmpty(info.getCsstIds())) {
            info.setCsstDurationMap(Maps.newHashMap());
        } else {
            info.setCsstDurationMap(classLessonMapper.queryCsstDurationMap(info.getCsstIds()));
        }
    }

    @Override
    public void buildFinishedDurationInfo(PreparedInfo info, Long studentId) {
        if (CollectionUtils.isEmpty(info.getCsstIds())) {
            info.setFinishedDurationMap(Maps.newHashMap());
        } else {
            info.setFinishedDurationMap(
                classLessonMapper.queryFinishedDurationByCSST(info.getCsstIds(), new Date(), studentId));
        }
    }

    @Override
    public void buildLessonTeacherInfo(PreparedInfo info) {
        info.setLessonTeacherMap(Maps.newHashMap());
        if (CollectionUtils.isNotEmpty(info.getLessonIds())
            || CollectionUtils.isNotEmpty(info.getAccidentLessonIds())) {
            List<LessonTeacher> lessonTeachers = Lists.newArrayList();
            if (CollectionUtils.isNotEmpty(info.getLessonIds())) {
                lessonTeachers
                    .addAll(lessonTeacherMapper.queryLessonTacher(ListSplitUtil.split(info.getLessonIds()), null));
            }

            for (LessonTeacher lessonTeacher : lessonTeachers) {
                if (info.getTeacherNos() != null) {
                    info.getTeacherNos().add(lessonTeacher.getTeacherStaffNo());
                }
                NoAndNameScoreDto dto = new NoAndNameScoreDto();
                dto.setStaffNo(lessonTeacher.getTeacherStaffNo());
                dto.setTeacherType(lessonTeacher.getTeacherType());
                Map<String, NoAndNameScoreDto> tmpMap =
                    info.getLessonTeacherMap().getOrDefault(lessonTeacher.getLessonId(), Maps.newHashMap());
                tmpMap.put(lessonTeacher.getTeacherStaffNo(), dto);
                info.getLessonTeacherMap().put(lessonTeacher.getLessonId(), tmpMap);
            }
        }
    }

    @Override
    public void buildClassNameInfo(PreparedInfo info) {
        if (CollectionUtils.isNotEmpty(info.getClassIds())) {
            info.setClassNameMap(classInfoMapper.queryNameById(info.getClassIds()));
        } else {
            info.setClassNameMap(Maps.newHashMap());
        }
    }

    @Override
    public void buildClassInfo(PreparedInfo info) {
        if (CollectionUtils.isNotEmpty(info.getClassIds())) {
            List<ClassInfo> list=classInfoMapper.queryListByIds(info.getClassIds());

            Map<Long,String> id2NameMap=Maps.newHashMap();
            Map<Long,String> id2NoMap=Maps.newHashMap();
            Map<Long,String> id2ExamTypeMap=Maps.newHashMap();
            Map<Long,Long> id2SubSchoolMap=Maps.newHashMap();

            list.stream().forEach(a->{
                id2NameMap.put(a.getId(),a.getClassName() );
                id2NoMap.put(a.getId(),a.getClassNo() );
                id2ExamTypeMap.put(a.getId(),a.getExamType() );
                id2SubSchoolMap.put(a.getId(), a.getBranchId());
            });

            info.setClassNameMap(id2NameMap);
            info.setClassNoMap(id2NoMap);
            info.setExamTypeMap(id2ExamTypeMap);
            info.setSubSchoolMap(id2SubSchoolMap);
        } else {
            info.setClassNameMap(Maps.newHashMap());
            info.setClassNoMap(Maps.newHashMap());
            info.setExamTypeMap(Maps.newHashMap());
            info.setSubSchoolMap(Maps.newHashMap());
        }
    }

    @Override
    public void buildCssaInfo(PreparedInfo info) {
        info.setCssaMap(Maps.newHashMap());
        if (CollectionUtils.isNotEmpty(info.getCsstIds())) {
            Map<Long, List<Long>> cssaMap = lessonTeacherMapper.queryCsstAssitant(info.getCsstIds());

            if (!cssaMap.isEmpty()) {
                List<Long> cssaIds = Lists.newArrayList();
                for (List<Long> tmpList : cssaMap.values()) {
                    cssaIds.addAll(tmpList);
                }
                if (CollectionUtils.isEmpty(cssaIds)) {
                    return;
                }
                ClassStageSubjectTeacherCriteria c = new ClassStageSubjectTeacherCriteria();
                c.createCriteria().andIdIn(cssaIds);
                Map<Long, ClassStageSubjectTeacher> teacherMap = csstMapper.selectByExample(c).stream()
                    .collect(Collectors.toMap(a -> a.getId(), Function.identity()));
                for (Long csstId : cssaMap.keySet()) {
                    List<Long> tmpList = cssaMap.get(csstId);
                    if (CollectionUtils.isNotEmpty(tmpList)) {
                        for (Long cssaId : tmpList) {
                            ClassStageSubjectTeacher teacher = teacherMap.get(cssaId);
                            if (teacher != null) {
                                Map<String, NoAndNameScoreDto> tmpMap =
                                    info.getCssaMap().getOrDefault(csstId, Maps.newHashMap());
                                info.getCssaMap().put(csstId, tmpMap);
                                if (info.getTeacherNos() != null) {
                                    info.getTeacherNos().add(teacher.getTeacherStaffNo());
                                }
                                if (teacher.getTeacherType().intValue() == PaikeTeacherType.assitant.getValue()) {
                                    NoAndNameScoreDto dto = new NoAndNameScoreDto();
                                    dto.setStaffNo(teacher.getTeacherStaffNo());
                                    dto.setScore(teacher.getScore());
                                    dto.setTeacherType(teacher.getTeacherType());
                                    dto.setIsLocal(teacher.getIsLocal() ? 1 : 0);
                                    tmpMap.put(teacher.getTeacherStaffNo(), dto);
                                    //info.getCssaMap().put(csstId, tmpMap);
                                }
                            }
                        }
                    }
                }
            }

        }
    }

    @Override
    public void buildStudentCount(PreparedInfo info) {
        List<Long> csstIds = info.getCsstIds();
        if (CollectionUtils.isEmpty(csstIds)) {
            return;
        }
        info.setCsstId2StuCountMap(csstMapper.countStuCountByCsstIds(csstIds));
    }

    @Override
    public void buildCsstDaysInfo(PreparedInfo info, Long studentId) {
        if (CollectionUtils.isEmpty(info.getCsstIds())) {
            info.setCsstDaysMap(Maps.newHashMap());
        } else {
            info.setCsstDaysMap(classLessonMapper.queryStudentCsstDaysMap(info.getCsstIds(), studentId));
        }
    }

    @Override
    public void buildCsstDurationInfo(PreparedInfo info, Long studentId) {
        if (CollectionUtils.isEmpty(info.getCsstIds())) {
            info.setCsstDurationMap(Maps.newHashMap());
        } else {
            info.setCsstDurationMap(classLessonMapper.queryStudentCsstDurationMap(info.getCsstIds(), studentId));
        }
    }

    @Override
    public void buildLessonTableNo(PreparedInfo info) {
        if (CollectionUtils.isEmpty(info.getLessonTableIds())) {
            info.setLessonTableId2NoMap(Maps.newHashMap());
        } else {
            info.setLessonTableId2NoMap(lessonTableMapper.queryLessonTableNo(info.getLessonTableIds()));
        }
    }

    @Override
    public void buildBusinessAndTeachWay(PreparedInfo info,List<ClassStageSubjectTeacher> cssts) {
        if(CollectionUtils.isEmpty(cssts)){
            info.setCssBuIdMap(Maps.newHashMap());
            info.setCssTeachWayMap(Maps.newHashMap());
        }else {
            List<ClassStageSubject> cssList=cssts.stream().map(a-> {
                ClassStageSubject css=new ClassStageSubject();
                css.setClassId(a.getClassId());
                css.setStageId(a.getStageId());
                css.setSubjectId(a.getSubjectId());
                css.setBatchNum(a.getBatchNum());
                return css;
            }).collect(Collectors.toList());
            List<ClassStageSubject> csses=cssMapper.queryByClassStageBatchSubjects(cssList);

            Map<String,Long> buMap=Maps.newHashMap();

            Map<String,Byte> teachWayMap=Maps.newHashMap();

            Map<String,String> examWayMap=Maps.newHashMap();

            csses.stream().forEach(a->{
                String key=getKey(a.getClassId(),a.getStageId(),a.getSubjectId(),a.getBatchNum());
                buMap.put(key, a.getBuId());
                teachWayMap.put(key,a.getTeachWay() );
                examWayMap.put(key,a.getExamWay() );
            });
            info.setCssBuIdMap(buMap);
            info.setCssTeachWayMap(teachWayMap);
            info.setExamWayMap(examWayMap);
        }


    }

    private String getKey(Long classId,Long stageId,Long subjectId,Integer batchNum){
        return String.format("%d#%d#%d#%d",classId,stageId,subjectId,batchNum);
    }
}
