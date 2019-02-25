package com.huatu.paike.dal.sms.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.huatu.paike.dal.annotations.MapF2F;
import com.huatu.paike.dal.sms.entity.SmsRecordDetail;
import com.huatu.paike.dal.sms.entity.SmsRecordDetailCriteria;

import tk.mybatis.mapper.common.Mapper;

public interface SmsRecordDetailMapper extends Mapper<SmsRecordDetail> {
    int deleteByFilter(SmsRecordDetailCriteria filter);

    void insertBatch(List<SmsRecordDetail> details);

    /**
     * 统计订单短信数量
     * 
     * @param templateId
     * @param classNo
     * @param orderNos
     * @return
     */
    @MapF2F
    Map<String, Integer> querySmsCount(@Param("templateId") Long templateId, @Param("classNo") String classNo,
        @Param("orderNos") List<String> orderNos);

    List<SmsRecordDetail> queryList(@Param("templateId") Long templateId, @Param("classNo") String classNo,
        @Param("orderNos") List<String> orderNos);

}