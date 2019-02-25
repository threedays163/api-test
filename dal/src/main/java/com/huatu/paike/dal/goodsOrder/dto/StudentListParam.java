package com.huatu.paike.dal.goodsOrder.dto;

import com.huatu.common.sqlbuilder.dto.PageDto;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Data
public class StudentListParam implements Serializable {

    private static final long serialVersionUID = 2393211295224906512L;

    private Set<Long> nodeIds;//节点id集合

    private String query;//学员姓名或学员手机号

    private String orderNo;//订单编号

    private PageDto pageDto;//分页
}
