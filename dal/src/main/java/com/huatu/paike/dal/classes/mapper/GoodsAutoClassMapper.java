package com.huatu.paike.dal.classes.mapper;

import org.apache.ibatis.annotations.Param;

import com.huatu.paike.dal.classes.entity.GoodsAutoClass;
import com.huatu.paike.dal.classes.entity.GoodsAutoClassCriteria;

import tk.mybatis.mapper.common.Mapper;

public interface GoodsAutoClassMapper extends Mapper<GoodsAutoClass> {
    int deleteByFilter(GoodsAutoClassCriteria filter);

    /**
     * 查询商品是否有没有满的班级
     * 
     * @param goodsNo
     * @return
     */
    int ifHaveNotFullClass(@Param("goodsNo") String goodsNo);

}