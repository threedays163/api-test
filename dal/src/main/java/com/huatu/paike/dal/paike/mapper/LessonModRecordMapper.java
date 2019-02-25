package com.huatu.paike.dal.paike.mapper;

import com.huatu.common.sqlbuilder.dto.PageDto;
import com.huatu.paike.dal.paike.entity.LessonModRecord;
import com.huatu.paike.dal.paike.entity.LessonModRecordCriteria;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;
import java.util.List;

public interface LessonModRecordMapper extends Mapper<LessonModRecord> {
    int deleteByFilter(LessonModRecordCriteria filter);

    /**
     * 班级维度 查询课节修改记录
     * @param classId
     * @param pageDto
     * @return
     */
    List<LessonModRecord> queryListByClassId(@Param("classId") Long classId, @Param("pageDto") PageDto pageDto);

    /**
     * 班级维度 统计课节修改记录
     * @param classId
     * @return
     */
    int countByClassId(@Param("classId") Long classId);
}