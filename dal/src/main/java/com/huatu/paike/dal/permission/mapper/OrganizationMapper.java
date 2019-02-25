package com.huatu.paike.dal.permission.mapper;

import com.huatu.paike.dal.permission.entity.Organization;
import com.huatu.paike.dal.permission.entity.OrganizationCriteria;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface OrganizationMapper extends Mapper<Organization> {
    int deleteByFilter(OrganizationCriteria filter);

    List<Organization> findAll();
}