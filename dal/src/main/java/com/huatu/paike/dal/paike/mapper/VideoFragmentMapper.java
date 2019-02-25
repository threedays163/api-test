package com.huatu.paike.dal.paike.mapper;

import com.huatu.paike.dal.paike.entity.VideoFragment;
import com.huatu.paike.dal.paike.entity.VideoFragmentCriteria;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.Collection;
import java.util.List;

public interface VideoFragmentMapper extends Mapper<VideoFragment> {
    int deleteByFilter(VideoFragmentCriteria filter);

    /**
     * 根据ID批量查询
     * 
     * @param ids
     * @return
     */
    List<VideoFragment> getByIds(@Param("ids") Collection<Long> ids);

    /**
     * 根据vedio_id查询唯一记录
     * 
     * @param videoId
     * @return
     */
    VideoFragment getByVideoId(@Param("videoId") Long videoId);
}