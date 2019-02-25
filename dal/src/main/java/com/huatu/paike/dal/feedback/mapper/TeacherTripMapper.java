package com.huatu.paike.dal.feedback.mapper;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

import com.huatu.paike.StageBatchDto;
import com.huatu.paike.dal.feedback.entity.TeacherTrip;
import com.huatu.paike.dal.feedback.entity.TeacherTripCriteria;

import tk.mybatis.mapper.common.Mapper;

public interface TeacherTripMapper extends Mapper<TeacherTrip> {
    int deleteByFilter(TeacherTripCriteria filter);

    int deleteByClassStageBatchNum(@Param("classId") Long classId,
        @Param("stageBatchDtos") Set<StageBatchDto> stageBatchDtos);

    /**
     * 查询给定班级阶段的老师行程
     * 
     * @param classID
     * @param stageID
     * @return
     */
    List<TeacherTrip> queryByClassStage(@Param("classID") long classID, @Param("stageID") long stageID);

    /**
     * 查询给定班级阶段的老师行程,按stageID,batchNum ASC排序
     * 
     * @param classID
     * @param stageBatchs
     * @return
     */
    List<TeacherTrip> queryByClassStages(@Param("classID") long classID,
        @Param("stageBatchs") Collection<StageBatchDto> stageBatchs);

    /**
     * 插入或更新老师行程
     * 
     * @return
     */
    int insertOrUpdate(TeacherTrip m);

    /**
     * 批量插入老师行程
     * 
     * @param trips
     */
    void batchInsert(List<TeacherTrip> trips);
}