/**
 * Huatu.com Inc.
 * Copyright (c) 2014-2019 All Rights Reserved.
 */
package com.huatu.paike.api_test.service.impl;

import com.huatu.paike.api_test.dto.*;

import java.util.Collection;

/**
 * @title PlaceApiService
 * @desc 场地管理API服务接口
 * @author yanmaoyuan
 * @date 2019年2月27日
 * @version 1.0
 */
public interface PlaceApiService {

    /**
     * 根据条件查询场地信息
     * 
     * @param params 查询参数
     * @return 返回场地信息列表
     */
    PlaceListRespDto queryList(PlaceListReqDto params);

    /**
     * 根据ID批量查询场地信息
     * 
     * @param ids 场地ID的集合
     * @return 返回场地信息列表
     */
    PlaceListRespDto getByIds(Collection<Long> ids);
    
    /**
     * 根据ID查询场地详细信息
     * 
     * @param id 场地ID
     * @return 返回场地详细信息
     */
    PlaceInfo getById(Long id);

    /**
     * 模糊查询场地信息
     * 
     * @param params 模糊查询参数
     * @return 返回场地的ID、名称等基本信息
     */
    FuzzyQueryRespDto fuzzyQuery(FuzzyQueryReqDto params);

}