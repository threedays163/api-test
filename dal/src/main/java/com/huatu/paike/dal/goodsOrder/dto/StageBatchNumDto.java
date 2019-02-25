package com.huatu.paike.dal.goodsOrder.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class StageBatchNumDto implements Serializable {

    private Long stageId;

    private Integer batchNum;
}
