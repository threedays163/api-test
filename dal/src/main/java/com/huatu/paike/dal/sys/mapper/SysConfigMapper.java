package com.huatu.paike.dal.sys.mapper;

import java.util.List;

import com.huatu.paike.dal.sys.entity.QuerySysConfigParam;
import com.huatu.paike.dal.sys.entity.SysConfigEntity;
import org.springframework.cache.annotation.Cacheable;
import tk.mybatis.mapper.common.Mapper;

/**
 * 
 * 系统配置表Dao
 * 
 * @version 
 * <pre>
 * Author	Version		Date		Changes
 * songzhou 	1.0  		2018年12月12日 	Created
 *
 * </pre>
 * @since 1.
 */
public interface SysConfigMapper extends Mapper<SysConfigEntity>{
    
    /**
     * 查询列表
     * 
     * @param param
     * @return
     */
    List<SysConfigEntity> findList(QuerySysConfigParam param);

    /**
     * 分页查询查询总数
     *
     * @param param
     * @return
     */
    Integer countQuery(QuerySysConfigParam param);
    
    /**
     * 根据id查询
     * 
     * @param entity
     * @return
     */
    SysConfigEntity get(SysConfigEntity entity);

    /**
     * 单个新增
     *
     * @param entity
     * @return
     */
    long insertSingle(SysConfigEntity entity);

    /**
     * 物理单个删除
     *
     * @param entity
     * @return
     */
    long deleteSingle(SysConfigEntity entity);
}