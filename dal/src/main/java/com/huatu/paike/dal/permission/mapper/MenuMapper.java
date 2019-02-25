package com.huatu.paike.dal.permission.mapper;

import com.huatu.paike.dal.permission.entity.Menu;
import com.huatu.paike.dal.permission.entity.MenuCriteria;
import tk.mybatis.mapper.common.Mapper;

public interface MenuMapper extends Mapper<Menu> {
    int deleteByFilter(MenuCriteria filter);
}