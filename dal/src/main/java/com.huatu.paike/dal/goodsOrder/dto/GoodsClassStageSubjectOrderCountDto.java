
package com.huatu.paike.dal.goodsOrder.dto;

import lombok.Data;

@Data
public class GoodsClassStageSubjectOrderCountDto {

    Long classId;

    Long stageId;

    String stageName;

    Long subjectId;

    String subjectName;

    Integer classHour;

    Integer batchNum;

    String goodsNo;

    Integer orderCount;
}
