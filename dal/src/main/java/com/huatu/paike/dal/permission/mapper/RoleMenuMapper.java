package com.huatu.paike.dal.permission.mapper;

import java.util.List;

import com.huatu.paike.dal.permission.entity.RoleMenu;
import com.huatu.paike.dal.permission.entity.RoleMenuCriteria;
import tk.mybatis.mapper.common.Mapper;

public interface RoleMenuMapper extends Mapper<RoleMenu> {
    int deleteByFilter(RoleMenuCriteria filter);
    
    void insertBatch(List<RoleMenu> roleMenus);
}