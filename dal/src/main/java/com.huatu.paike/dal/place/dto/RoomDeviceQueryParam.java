package com.huatu.paike.dal.place.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomDeviceQueryParam {

    private String cloudRoomId;

    private Integer placeType;

}
