package com.huatu.paike.dal.classes.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.huatu.common.sqlbuilder.dto.PageDto;
import com.huatu.paike.dal.annotations.MapF2F;
import com.huatu.paike.dal.classes.entity.ClassGood;
import com.huatu.paike.dal.classes.entity.ClassGoodCriteria;

import tk.mybatis.mapper.common.Mapper;

public interface ClassGoodMapper extends Mapper<ClassGood> {
    int deleteByFilter(ClassGoodCriteria filter);

    /**
     * 根据班级编号查询关联商品
     * 
     * @param classNo
     * @return
     */
    List<String> queryGoodsNoByClassNo(@Param("classNo") String classNo, @Param("pageDto") PageDto pageDto);

    /**
     * 查询班级关联的商品信息
     * 
     * @param classNo
     * @param classId
     * @param pageDto
     * @return
     */
    List<ClassGood> queryGoodsByClassNo(@Param("classNo") String classNo, @Param("classId") Long classId,
        @Param("pageDto") PageDto pageDto);

    /**
     * 根据商品编号查询商品的名称
     *
     * @param goodsNoList
     * @return
     */
    @MapF2F
    Map<String, String> queryGoodsNoAndName(List<String> goodsNoList);
}