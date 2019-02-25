package com.huatu.paike.dal.paike.mapper;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import com.huatu.paike.StageBatchDto;
import com.huatu.paike.dal.annotations.MapF2F;
import com.huatu.paike.dal.annotations.MapF2M;
import com.huatu.paike.dal.paike.entity.ClassStage;
import com.huatu.paike.dal.paike.entity.ClassStageCriteria;

import tk.mybatis.mapper.common.Mapper;

public interface ClassStageMapper extends Mapper<ClassStage> {
    int deleteByFilter(ClassStageCriteria filter);

    /**
     * TODO 批量插入
     * 
     * @param classStageList
     */
    void insertBatch(List<ClassStage> classStageList);

    /**
     * 查询班级阶段状态**
     * 
     * @param classID
     * @return
     */
    @MapF2F
    Map<Long, Integer> queryStageStatusByClass(@Param("classID") long classID);

    /**
     * 查询班级里可操作的阶段
     * 
     * @param classID
     * @return
     */
    List<ClassStage> queryCanDealStageByClass(@Param("classID") long classID);

    /**
     * 查询给定班级和阶段的信息
     * 
     * @param classID
     * @param stageIDs
     * @return
     */
    @MapKey("stageId")
    Map<Long, ClassStage> queryStageByClass(@Param("classID") long classID, @Param("stageIDs") List<Long> stageIDs);

    /**
     * 查询给定班级和(阶段批次)查询实体
     * 
     * @param classId
     * @param stageBatchNums
     * @return
     */
    List<ClassStage> queryStageBatchNumByClass(@Param("classId") Long classId,
        @Param("stageBatchs") List<StageBatchDto> stageBatchs);

    @MapF2M
    Map<Long, Map<Integer, Integer>> queryStageBatchStatus(@Param("classId") Long classId,
        @Param("stageBatchs") Set<StageBatchDto> stageBatchs);

    /**
     * 
     * @param classId
     * @param stageBatchs
     * @return
     */
    List<ClassStage> queryByClassStageBatch(@Param("classId") long classId,
        @Param("stageBatchs") Set<StageBatchDto> stageBatchs);

    /**
     * 批量更新班级阶段信息
     * 
     * @param classStageList
     * @return
     */
    int updateByClassStage(ClassStage classStage);

    /**
     * 查询班级当前的最大批次数
     * 
     * @param classId
     * @return
     */
    int queryMaxBatchNumInClass(Long classId);

    /**
     * 更新班级阶段状态
     * 
     * @param classId
     * @param stageBatchs
     * @param status
     * @return
     */
    int updateStatus(@Param("classId") Long classId, @Param("stageBatchs") Set<StageBatchDto> stageBatchs,
        @Param("status") int status);

    /**
     * 查询
     * @param list
     * @return
     */
    List<ClassStage> querySubjectStatusFeedback(@Param("list")Collection<ClassStage> list,@Param("status") int status);
    
    /**
    * 更新排课时长
     * 
     * @param classId
     * @param stageId
     * @param batchNum
     * @param doration
     */
    void updatePaikeDuration(@Param("classId") Long classId, @Param("stageId") Long stageId,
        @Param("batchNum") Integer batchNum, @Param("duration") Integer duration);

    /**
     * 更新结课时长
     * 
     * @param classId
     * @param stageId
     * @param batchNum
     * @param doration
     */
    void updateFinishDuration(@Param("classId") Long classId, @Param("stageId") Long stageId,
        @Param("batchNum") Integer batchNum, @Param("duration") Integer duration);

    int update(ClassStage cs);
}