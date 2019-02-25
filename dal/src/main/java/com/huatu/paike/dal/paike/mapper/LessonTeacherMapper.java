package com.huatu.paike.dal.paike.mapper;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.huatu.paike.dal.annotations.MapF2F;
import org.apache.ibatis.annotations.Param;

import com.huatu.paike.dal.annotations.MapF2L;
import com.huatu.paike.dal.paike.dto.DateTeacher;
import com.huatu.paike.dal.paike.dto.TeacherFeedbackInfoDto;
import com.huatu.paike.dal.paike.entity.LessonTeacher;
import com.huatu.paike.dal.paike.entity.LessonTeacherCriteria;

import tk.mybatis.mapper.common.Mapper;

public interface LessonTeacherMapper extends Mapper<LessonTeacher> {

    int deleteByFilter(LessonTeacherCriteria filter);

    /**
     * 批量插入
     *
     * @param lessonTeacher
     */
    void insertBatch(List<LessonTeacher> lessonTeacher);

    /**
     * 根据课节id查询出所有的助教老师
     *
     * @param lessonIds
     * @return
     */
    List<DateTeacher> queryListByLessonId(List<Long> lessonIds);

    /**
     * 根据课节id查询课节老师
     *
     * @param lessonIdLists 课节id
     * @param teacherType 老师类型
     * @return
     */
    List<LessonTeacher> queryLessonTacher(@Param("lessonIdLists") List<List<Long>> lessonIdLists,
        @Param("teacherType") Byte teacherType);

    /**
     * 查询属于给定lessonIds里的老师上课记录
     *
     * @param lessonIds
     * @return
     */
    List<TeacherFeedbackInfoDto> queryTeacherFeedbackInfo(@Param("lessonIds") List<Long> lessonIds);

    /**
     * 查询助教
     *
     * @param csstIds
     * @return
     */
    @MapF2L
    Map<Long, List<Long>> queryCsstAssitant(@Param("csstIds") List<Long> csstIds);

    /**
     * 查询需要跟随csst一起更新的lessonTeacher
     * @param classId
     * @param stageId
     * @param subjectId
     * @param batchNum
     * @return
     */
    public List<LessonTeacher> selectNeedUpdateLessonTeacher(@Param("classId") Long classId, @Param("stageId") Long stageId,
                                                             @Param("subjectId") Long subjectId, @Param("batchNum") Integer batchNum);
    /**
     * 更新课节老师的csstId
     *
     * @param classId
     * @param stageId
     * @param subjectId
     */
    void updateLessonTeacherCsstId(@Param("classId") Long classId, @Param("stageId") Long stageId,
        @Param("subjectId") Long subjectId, @Param("batchNum") Integer batchNum);

    /**
     * 更新课节老师的csstId
     *
     * @param classId
     * @param stageId
     * @param subjectId
     */
    void updateLessonTeacherCsstId_accident(@Param("classId") Long classId, @Param("stageId") Long stageId,
        @Param("subjectId") Long subjectId, @Param("batchNum") Integer batchNum);

    /**
     * 获取老师对应的csstId
     *
     * @param teacherNo
     * @return
     */
    List<Long> queryCsstIds(@Param("teacherNo") String teacherNo);

    /**
     * 根据lessonIds获取课节老师信息
     *
     * @param lessonIds
     * @return
     */
    List<LessonTeacher> queryListByLessonIds(@Param("lessonIds") List<Long> lessonIds);

    /**
     *
     * @param lessonIds
     * @param teacherType
     * @return
     */
    @MapF2L
    Map<Long, List<String>> queryAssitantsByClassIds(@Param("classIds") Collection<Long> classIds, @Param("teacherType") Integer teacherType);
}