
package com.huatu.paike.dal.place.dto;

import com.huatu.common.sqlbuilder.dto.PageDto;
import lombok.Data;

import java.util.Collection;
import java.util.List;
import java.util.Set;

@Data
public class ClassRoomQueryParam {

    private Long id;

    private Integer type;// 教室类型，0校区教室，1酒店会议室，3其它

    private List<Integer> types;// 教室类型集合

    private String classroomQuery;// 教室查询条件

    private Collection<Long> ids;// 教室ids

    private Long placeId;// 场地id

    private Collection<Long> placeIds;// 根据场地id批量查询

    private Long areaId;// 城市id

    private Set<Long> nodeIds;// 分校分部ids

    private Integer isEffective;// 是否有效

    private List<Integer> multipleEffectiveStatus;// 多种状态

    private PageDto pageDto;// 分页信息

}
