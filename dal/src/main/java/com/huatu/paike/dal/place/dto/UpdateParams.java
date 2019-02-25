
package com.huatu.paike.dal.place.dto;

import java.util.Collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateParams {

    private Collection<Long> placeIds;

    private Integer isEffective;
}
