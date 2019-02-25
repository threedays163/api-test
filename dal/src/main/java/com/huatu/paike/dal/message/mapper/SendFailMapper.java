package com.huatu.paike.dal.message.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.huatu.paike.dal.message.entity.SendFail;
import com.huatu.paike.dal.message.entity.SendFailCriteria;

import tk.mybatis.mapper.common.Mapper;

public interface SendFailMapper extends Mapper<SendFail> {
    int deleteByFilter(SendFailCriteria filter);

    /**
     * 更新未发送成功消息的状态
     * 
     * @param id
     * @param status
     * @param successTime
     * @return
     */
    int updateSendFailMessage(@Param("id") Long id, @Param("status") int status,
        @Param("successTime") Date successTime);

    /**
     * 查询
     * 
     * @param receiveOrSend
     * @param messageSendStatus
     * @return
     */
    List<SendFail> querySendFailMessage(@Param("type") int receiveOrSend, @Param("status") int messageSendStatus,
        @Param("size") int size);
}