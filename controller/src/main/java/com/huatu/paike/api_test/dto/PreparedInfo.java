
/**
 * Huatu.com Inc. Copyright (c) 2014-2018 All Rights Reserved.
 */

package com.huatu.paike.api_test.dto;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.huatu.common.dto.resp.IdAndNameDto;
import com.huatu.common.service.dto.resp.StageDto;
import com.huatu.common.service.dto.resp.SubjectDto;
import com.huatu.shizi.service.dto.response.TeacherListResp;
import lombok.Data;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @title PrepareInfo
 * @desc 备用信息
 * @author shanyu
 * @date 2018年7月30日
 * @version 1.0
 */
@Data
public class PreparedInfo {

    /**
     * 班级类型2分校
     */
    Map<Long,Long> subSchoolMap;

    public Long getSubSchool(Long classId){
        if(subSchoolMap==null||subSchoolMap.isEmpty()){
            return -1L;
        }
        return subSchoolMap.get(classId);
    }

    /**
     * 班级ID2考试类型
     */
    Map<Long,String> examTypeMap;

    public String getExamType(Long classId){
        if(examTypeMap==null||examTypeMap.isEmpty()){
            return "";
        }
        return examTypeMap.get(classId);
    }

    /**
     * 笔面试类型
     */
    Map<String,String> examWayMap;

    public String getExamWay(String cssKey){
        if(examWayMap==null||examWayMap.isEmpty()){
            return "";
        }
        return examWayMap.get(cssKey);
    }

    /**
     * 每个csst对应的科目的事业部ID
     */
    Map<String,Long> cssBuIdMap;

    public Long getBuId(String cssStr){
        if(cssBuIdMap==null){
            return -1L;
        }
        return cssBuIdMap.get(cssStr);
    }

    /**
     * 每个css对应的授课方式
     */
    Map<String,Byte> cssTeachWayMap;

    public Byte getTeachWay(String cssStr){
        if(cssTeachWayMap==null){
            return -1;
        }
        return cssTeachWayMap.get(cssStr);
    }

    /**
     * 每个csst对应的科目上课学生人数
     */
    Map<Long, Integer> csstId2StuCountMap;

    public int getStuCount(Long csstId) {
        if (csstId2StuCountMap == null) {
            return 0;
        }
        return csstId2StuCountMap.getOrDefault(csstId, 0);
    }

    /**
     * 教室信息
     */
    private Set<Long> roomIds;
    private Map<Long, IdAndNameDto> roomMap;
    private boolean needRoomInfo;

    /**
     * 获取教室信息
     * 
     * @param roomId
     * @return
     */
    public IdAndNameDto getRoom(Long roomId) {
        if (roomMap == null) {
            return null;
        } else {
            return roomMap.getOrDefault(roomId, new IdAndNameDto(-1L, ""));
        }
    }

    /**
     * 获取教室信息
     * 
     * @param roomIds
     * @return
     */
    public Set<IdAndNameDto> getRoom(List<Long> roomIds) {
        if (roomMap == null || CollectionUtils.isEmpty(roomIds)) {
            return Sets.newHashSet();
        } else {
            Set<IdAndNameDto> result = Sets.newHashSet();
            for (Long roomId : roomIds) {
                IdAndNameDto room = roomMap.getOrDefault(roomId, new IdAndNameDto(-1L, ""));
                result.add(room);
            }
            return result;
        }
    }

    public static void main(String[] args) {
        List<String> names = Lists.newArrayList("1", "3");
        System.out.println(StringUtils.join(names, ","));
    }

    /**
     * 阶段信息
     */
    private Set<Long> stageIds;
    private Map<Long, StageDto> stageMap;
    private boolean needStageInfo;

    /**
     * 获取阶段
     * 
     * @param stageId
     * @return
     */
    public StageDto getStage(Long stageId) {
        if (stageMap == null) {
            return null;
        } else {
            return stageMap.get(stageId);
        }
    }

    /**
     * 科目信息
     */
    private Set<Long> subjectIds;
    private Map<Long, SubjectDto> subjectMap;
    private boolean needSubjectInfo;

    /**
     * 获取科目
     * 
     * @param subjectId
     * @return
     */
    public SubjectDto getSubject(Long subjectId) {
        if (subjectMap == null) {
            return null;
        } else {
            return subjectMap.get(subjectId);
        }
    }

    private List<Long> lessonIds;

    private List<Long> accidentLessonIds;
    /**
     * 时间安排信息
     */
    private Map<Long, List<String[]>> lessonTimeArrMap;
    private boolean needLessonTimeArrInfo;

    /**
     * 获取课节时间安排
     * 
     * @param lessonId
     * @return
     */
    public List<String[]> getLessonTimeArr(Long lessonId) {
        if (lessonTimeArrMap == null) {
            return Lists.newArrayList();
        } else {
            return lessonTimeArrMap.getOrDefault(lessonId, Lists.newArrayList());
        }
    }

    private Set<Long> lessonTableIds = Sets.newHashSet();
    private Map<Long, String> lessonTableId2NoMap = Maps.newHashMap();

    public String getLessonTableNo(Long lessonId) {
        if (lessonTableId2NoMap == null) {
            return StringUtils.EMPTY;
        } else {
            return lessonTableId2NoMap.getOrDefault(lessonId, StringUtils.EMPTY);
        }
    }

    List<String> doubleTeacherLtId_staffNoList;

    private List<Long> csstIds;// 阶段科目老师课节id
    private Map<Long, NoAndNameScoreDto> csstMap;// 主讲信息（班级阶段科目）
    private boolean needCsstInfo;

    private Map<Long, Map<String, NoAndNameScoreDto>> cssaMap;// 助教信息
    private boolean needCssaInfo;

    /**
     * 课节老师
     */
    private Map<Long, Map<String, NoAndNameScoreDto>> lessonTeacherMap;// 课节老师信息

    /**
     * 老师信息
     */
    private Set<String> teacherNos;
    private Map<String, String> teacherNameMap;
    private Map<String, TeacherListResp> teacherMap;
    private boolean needTeacherInfo;

    public String getTeacherName(String teacherNo) {
        if (teacherNameMap == null) {
            return null;
        }
        return teacherNameMap.get(teacherNo);
    }

    /**
     * csst天数
     */
    public Map<Long, Integer> csstDaysMap;
    /**
     * 双师课次老师维度->时长: key:lessonTableId_staffNo value: days
     */
    public Map<String, Integer> doubleTeacherLtId_staffNoList2DaysMap;

    public int getCsstDays(Long csstId) {
        if (csstDaysMap == null) {
            return 0;
        } else {
            return csstDaysMap.getOrDefault(csstId, 0);
        }
    }

    public void setDoubleTeacherDays(String key, int day) {
        if (doubleTeacherLtId_staffNoList2DaysMap == null) {
            doubleTeacherLtId_staffNoList2DaysMap = Maps.newHashMap();
        }
        doubleTeacherLtId_staffNoList2DaysMap.put(key, day);
    }

    public int getDoubleTeacherDays(String key) {
        if (doubleTeacherLtId_staffNoList2DaysMap == null) {
            return 0;
        } else {
            return doubleTeacherLtId_staffNoList2DaysMap.getOrDefault(key, 0);
        }
    }

    /**
     * csst时长
     */
    public Map<Long, Integer> csstDurationMap;
    /**
     * 双师课次老师维度->时长: key:lessonTableId_staffNo value: duration
     */
    public Map<String, Integer> doubleTeacherLtId_staffNoList2DurationMap;

    public int getCsstDuration(Long csstId) {
        if (csstDurationMap == null) {
            return 0;
        } else {
            return csstDurationMap.getOrDefault(csstId, 0);
        }
    }

    public void setDoubleTeacherDuration(String key, Integer duration) {
        if (doubleTeacherLtId_staffNoList2DurationMap == null) {
            doubleTeacherLtId_staffNoList2DurationMap = Maps.newHashMap();
        }
        doubleTeacherLtId_staffNoList2DurationMap.put(key, duration);
    }

    public int getDoubleTeacherDuration(String key) {
        if (doubleTeacherLtId_staffNoList2DurationMap == null) {
            return 0;
        } else {
            return doubleTeacherLtId_staffNoList2DurationMap.getOrDefault(key, 0);
        }
    }

    /**
     * csst已结束时长
     */
    public Map<Long, Integer> finishedDurationMap;

    public int getFinishedDuration(Long csstId) {
        if (finishedDurationMap == null) {
            return 0;
        } else {
            return finishedDurationMap.getOrDefault(csstId, 0);
        }
    }

    /**
     * 班级信息
     */
    private Set<Long> classIds;
    private Map<Long, String> classNameMap;
    private Map<Long,String> classNoMap;

    public String getClassName(Long classId) {
        if (classNameMap == null) {
            return null;
        } else {
            return classNameMap.get(classId);
        }
    }

    public String getClassNo(Long classId){
        if(classNoMap==null){
            return null;
        }else{
            return classNoMap.get(classId);
        }
    }

    public PreparedInfo(boolean needRoomInfo, boolean needStageInfo, boolean needSubjectInfo,
                        boolean needLessonTimeArrInfo, boolean needCsstInfo, boolean needTeacherInfo) {
        this.needRoomInfo = needRoomInfo;
        this.needStageInfo = needStageInfo;
        this.needSubjectInfo = needSubjectInfo;
        this.needLessonTimeArrInfo = needLessonTimeArrInfo;// ********
        this.needCsstInfo = needCsstInfo;// ********
        this.needTeacherInfo = needTeacherInfo;// ************
        if (needRoomInfo) {
            this.roomIds = Sets.newHashSet();
        }
        if (needStageInfo) {
            this.stageIds = Sets.newHashSet();
        }
        if (needSubjectInfo) {
            this.subjectIds = Sets.newHashSet();
        }
        if (needLessonTimeArrInfo) {
            this.lessonIds = Lists.newArrayList();
            this.accidentLessonIds = Lists.newArrayList();
        }
        if (needCsstInfo) {
            this.csstIds = Lists.newArrayList();
            this.csstId2StuCountMap = Maps.newHashMap();
            this.doubleTeacherLtId_staffNoList = Lists.newArrayList();
        }
        if (needTeacherInfo) {
            this.teacherNos = Sets.newHashSet();
        }
    }

    public PreparedInfo(boolean needRoomInfo, boolean needStageInfo, boolean needSubjectInfo,
                        boolean needLessonTimeArrInfo, boolean needCsstInfo, boolean needTeacherInfo, boolean needClassInfo,boolean needBusiness) {
        this(needRoomInfo, needStageInfo, needSubjectInfo, needLessonTimeArrInfo, needCsstInfo, needTeacherInfo);
        if (needClassInfo) {
            this.classIds = Sets.newHashSet();
        }
        if(needBusiness){
            this.cssBuIdMap= Maps.newHashMap();
        }
    }

}
