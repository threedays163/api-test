package com.huatu.paike.dal.permission.mapper;

import java.util.List;

import com.huatu.paike.dal.permission.entity.UserRole;
import com.huatu.paike.dal.permission.entity.UserRoleCriteria;
import tk.mybatis.mapper.common.Mapper;

public interface UserRoleMapper extends Mapper<UserRole> {
    int deleteByFilter(UserRoleCriteria filter);

    void insertBatch(List<UserRole> userRoles);
}