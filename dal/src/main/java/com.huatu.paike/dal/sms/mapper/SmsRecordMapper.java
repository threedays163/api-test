package com.huatu.paike.dal.sms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.huatu.paike.dal.sms.entity.SmsRecord;
import com.huatu.paike.dal.sms.entity.SmsRecordCriteria;

import tk.mybatis.mapper.common.Mapper;

public interface SmsRecordMapper extends Mapper<SmsRecord> {
    int deleteByFilter(SmsRecordCriteria filter);

    List<SmsRecord> queryRecordList(@Param("id") Long id, @Param("templateId") Long templateId,
        @Param("objectId") Long objectId, @Param("objectNo") String objectNo);
}