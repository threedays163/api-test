
package com.huatu.paike.dal.goodsOrder.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ClassGoodDto {
    String classNo;
    List<String> goodsNos;

}
