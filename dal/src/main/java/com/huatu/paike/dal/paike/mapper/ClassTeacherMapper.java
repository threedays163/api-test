package com.huatu.paike.dal.paike.mapper;

import com.huatu.paike.dal.paike.entity.ClassTeacher;
import com.huatu.paike.dal.paike.entity.ClassTeacherCriteria;

import tk.mybatis.mapper.common.Mapper;

public interface ClassTeacherMapper extends Mapper<ClassTeacher> {
    int deleteByFilter(ClassTeacherCriteria filter);
}