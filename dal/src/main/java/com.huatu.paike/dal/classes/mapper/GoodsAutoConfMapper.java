package com.huatu.paike.dal.classes.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.huatu.paike.dal.classes.entity.GoodsAutoConf;
import com.huatu.paike.dal.classes.entity.GoodsAutoConfCriteria;

import tk.mybatis.mapper.common.Mapper;

public interface GoodsAutoConfMapper extends Mapper<GoodsAutoConf> {
    int deleteByFilter(GoodsAutoConfCriteria filter);

    // int insertConf(GoodsAutoConf goodsAutoConf);

    /**
     * 根据商品编码查询配置信息
     * 
     * @param goodsNo
     * @return
     */
    GoodsAutoConf queryByGoodsNo(String goodsNo);

    // List<GoodsAutoConf> queryByGoodsNo1(int arg1, int arg2);

    /**
     * 根据是自动建班还是自动入班以及状态来查询商品及其配置信息
     * 
     * @param isActive
     * @param autoBuild
     * @return
     */
    List<GoodsAutoConf> queryByActiveAndAutoBuild(@Param("isActive") int isActive, @Param("autoBuild") int autoBuild);
}