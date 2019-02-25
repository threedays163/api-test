package com.huatu.paike.dal.permission.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.huatu.paike.dal.annotations.MapF2F;
import com.huatu.paike.dal.permission.dto.RoleQueryParams;
import com.huatu.paike.dal.permission.entity.Role;
import com.huatu.paike.dal.permission.entity.RoleCriteria;

import tk.mybatis.mapper.common.Mapper;

public interface RoleMapper extends Mapper<Role> {
    int deleteByFilter(RoleCriteria filter);

    List<Role> queryList(RoleQueryParams queryParam);

    int queryCount(RoleQueryParams queryParam);

    @MapF2F
    Map<Long, Integer> queryRoleMap(@Param("ids") List<Long> ids);
}