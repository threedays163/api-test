
package com.huatu.paike.dal.place.dto;

import com.huatu.common.sqlbuilder.dto.PageDto;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class PlaceQueryParam {

    // private Long id;

    private Set<Long> nodeIds;// 数据权限控制
    private Long areaId;// 城市
    private Integer type;// 场地类型

    private String classRoomName;// 教室
    private Integer minSeating;// 最小座位数
    private Integer maxSeating;// 最大座位数
    private String classroomQuery;// 模糊查询教室信息

    private String hotelName;// 酒店名称
    private Integer hotelRoomType;// 房间类型

    private Integer isEffective;// 是否有效
    private List<Integer> multipleEffectiveStatus;// 多种有效状态

    private Long deviceId;//设备码
    private String query;//模糊条件

    private PageDto pageDto;// 分页

}
