package com.huatu.paike.dal.sms.mapper;

import com.huatu.paike.dal.sms.entity.SmsTemplate;
import com.huatu.paike.dal.sms.entity.SmsTemplateCriteria;
import tk.mybatis.mapper.common.Mapper;

public interface SmsTemplateMapper extends Mapper<SmsTemplate> {
    int deleteByFilter(SmsTemplateCriteria filter);
}