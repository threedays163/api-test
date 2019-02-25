package com.huatu.paike.dal.goodsOrder.dto;

import com.huatu.common.sqlbuilder.dto.PageDto;
import lombok.Data;

import java.util.List;

@Data
public class OrderQueryParam {

    private List<String> goodsNos;//商品编号集合

    private String query;//学员姓名或学员手机号

    private Integer orderState;//订单的状态

    private PageDto pageDto;// 分页
}
