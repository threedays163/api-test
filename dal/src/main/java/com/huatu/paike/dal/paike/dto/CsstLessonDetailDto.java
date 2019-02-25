package com.huatu.paike.dal.paike.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CsstLessonDetailDto implements Serializable {

    private static final long serialVersionUID = 6767997733123685491L;

    private Long csstId;

    private Long lessonId;//课节id

    private Date lessonDate;// 上课日期

    private Date startTime;// 开始上课时间

    private Date endTime;// 结束时间

    private Integer duration;// 课时

    private Byte status;// 课节状态

    private Long roomId;// 教室id


}
