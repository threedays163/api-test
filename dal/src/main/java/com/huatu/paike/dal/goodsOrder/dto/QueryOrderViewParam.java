package com.huatu.paike.dal.goodsOrder.dto;

import com.huatu.common.sqlbuilder.dto.PageDto;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class QueryOrderViewParam implements Serializable {
    private static final long serialVersionUID = 1486948236199777467L;

    private Long classId;

    private List<String> orderNos;

    private String stuQueryStr;

    private PageDto pageDto;
}
