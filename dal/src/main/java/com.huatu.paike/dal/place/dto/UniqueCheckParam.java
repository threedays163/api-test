
package com.huatu.paike.dal.place.dto;

import lombok.Data;

import java.util.List;

/**
 * 
 * @title UniqueCheckParam
 * @desc 场地唯一性校验需要的条件
 * @author kerwin
 * @date 2018年8月5日
 * @version 1.0
 */
@Data
public class UniqueCheckParam {

    private String addressEqualsTo;// 地址

    private String classRoomNameEqualsTo;// 教室

    private String floorEqualsTo;// 楼层

    private String unitNameEqualsTo;// 单位名称（其它类型）
    
    private String hotelNameEqualsTo;// 酒店名称

    private String hotelRoomNameEqualsTo;// 酒店房间名称

    private Integer isEffective;// 是否有效,单个状态

    private List<Integer> multipleEffectiveStatus;// 多种有效状态
    
    private Long selfId;//场地ID

    public UniqueCheckParam addressEqualsTo(String addressEqualsTo){
        this.addressEqualsTo = addressEqualsTo;
        return this;
    }

    public UniqueCheckParam classRoomNameEqualsTo(String classRoomNameEqualsTo){
        this.classRoomNameEqualsTo = classRoomNameEqualsTo;
        return this;
    }

    public UniqueCheckParam floorEqualsTo(String floorEqualsTo){
        this.floorEqualsTo = floorEqualsTo;
        return this;
    }

    public UniqueCheckParam unitNameEqualsTo(String unitNameEqualsTo){
        this.unitNameEqualsTo = unitNameEqualsTo;
        return this;
    }

    public UniqueCheckParam hotelNameEqualsTo(String hotelNameEqualsTo){
        this.hotelNameEqualsTo = hotelNameEqualsTo;
        return this;
    }

    public UniqueCheckParam hotelRoomNameEqualsTo(String hotelRoomNameEqualsTo){
        this.hotelRoomNameEqualsTo = hotelRoomNameEqualsTo;
        return this;
    }

    public UniqueCheckParam isEffective(Integer isEffective){
        this.isEffective = isEffective;
        return this;
    }

    public UniqueCheckParam selfId(Long selfId){
        this.selfId = selfId;
        return this;
    }

    public UniqueCheckParam multipleEffectiveStatus(List<Integer> multipleEffectiveStatus){
        this.multipleEffectiveStatus = multipleEffectiveStatus;
        return this;
    }
}
