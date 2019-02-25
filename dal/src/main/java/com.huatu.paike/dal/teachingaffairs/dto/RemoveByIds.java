package com.huatu.paike.dal.teachingaffairs.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class RemoveByIds implements Serializable {
    private static final long serialVersionUID = -6664930343777630884L;

    private Date updateTime;

    private Long updatorId;

    private List<Long> ids;
}
