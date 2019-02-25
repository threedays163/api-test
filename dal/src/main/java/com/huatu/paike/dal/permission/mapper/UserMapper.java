package com.huatu.paike.dal.permission.mapper;

import java.util.List;

import com.huatu.paike.dal.permission.dto.UserQueryParams;
import com.huatu.paike.dal.permission.entity.User;
import com.huatu.paike.dal.permission.entity.UserCriteria;

import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User> {
    int deleteByFilter(UserCriteria filter);

    List<User> queryList(UserQueryParams params);

    int queryCount(UserQueryParams params);
}