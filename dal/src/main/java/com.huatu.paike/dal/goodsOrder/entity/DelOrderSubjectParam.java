package com.huatu.paike.dal.goodsOrder.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class DelOrderSubjectParam implements Serializable {
    private static final long serialVersionUID = -2353704666635506260L;

    private Long classId;

    private String orderNo;

    private List<StageSubjectBatchNum> stageSubjectList;
}
