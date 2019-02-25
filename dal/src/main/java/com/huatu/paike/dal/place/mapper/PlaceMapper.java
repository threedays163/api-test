package com.huatu.paike.dal.place.mapper;

import com.huatu.paike.dal.place.dto.PlaceQueryParam;
import com.huatu.paike.dal.place.dto.UniqueCheckParam;
import com.huatu.paike.dal.place.dto.UpdateParams;
import com.huatu.paike.dal.place.entity.Place;
import com.huatu.paike.dal.place.entity.PlaceCriteria;

import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

import tk.mybatis.mapper.common.Mapper;

public interface PlaceMapper extends Mapper<Place> {
    int deleteByFilter(PlaceCriteria filter);

    /**
     * 查询场地列表
     * 
     * @param queryParam
     * @return
     */
    List<Place> queryList(PlaceQueryParam queryParam);

    /**
     * 查询场地列表分页信息
     * 
     * @param queryParam
     * @return
     */
    int countQuery(PlaceQueryParam queryParam);

    /**
     * 保存场地
     * 
     * @param places
     */
    void saveAll(List<Place> places);

    /**
     * 通过ID查询场地
     * 
     * @param id
     * @return
     */
    Place getById(Long id);
    
    /**
     * 通过ID批量查询场地
     * 
     * @param ids
     * @return
     */
    List<Place> getByIds(@Param("ids") Collection<Long> ids);

    /**
     * 编辑场地
     * 
     * @param place
     */
    void update(Place place);

    /**
     * 删除场地
     * 
     * @param id
     */
    void delById(Long id);

    /**
     * 根据条件更新场地状态
     * 
     * @param updateParams
     */
    void changeEffStatus(UpdateParams updateParams);

    /**
     * 根据条件查询场地数目，用于唯一性校验
     * 
     * @param queryParam
     * @return
     */
    long queryExistsPlace(UniqueCheckParam queryParam);

}