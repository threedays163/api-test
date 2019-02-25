package com.huatu.paike.dal.paike.mapper;

import com.huatu.paike.dal.paike.entity.ClassStageSubjectKnowledgePoint;

import org.apache.ibatis.annotations.Param;

import java.util.List;

import tk.mybatis.mapper.common.Mapper;

/**
 * 班级关联知识点数据访问接口
 * 
 * @title ClassStageSubjectKnowledgePointMapper
 * @author yanmaoyuan
 * @date 2018年11月13日
 * @version 1.0
 */
public interface ClassStageSubjectKnowledgePointMapper extends Mapper<ClassStageSubjectKnowledgePoint> {

    /**
     * 批量保存班级关联知识点
     * 
     * @param list
     */
    void insertBatch(@Param("list") List<ClassStageSubjectKnowledgePoint> list);
}