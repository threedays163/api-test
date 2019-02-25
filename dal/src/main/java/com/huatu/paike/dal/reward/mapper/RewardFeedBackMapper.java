package com.huatu.paike.dal.reward.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.huatu.common.sqlbuilder.dto.PageDto;
import com.huatu.paike.dal.reward.entity.RewardFeedBack;
import com.huatu.paike.dal.reward.entity.RewardFeedBackCriteria;

import tk.mybatis.mapper.common.Mapper;

public interface RewardFeedBackMapper extends Mapper<RewardFeedBack> {
    int deleteByFilter(RewardFeedBackCriteria filter);

    /**
     * 获取未处理反馈 TODO 待实现
     * 
     * @param startDate
     * @param endDate
     * @param pageDto
     * @return
     */
    List<Long> queryUndealFeedBackIds(@Param("startDate") Date startDate, @Param("endDate") Date endDate,
        @Param("pageDto") PageDto pageDto);

    /**
     * 更新状态 TODO 待实现
     * 
     * @param feedBackIds
     */
    void updateStatus(List<Long> feedBackIds);
}