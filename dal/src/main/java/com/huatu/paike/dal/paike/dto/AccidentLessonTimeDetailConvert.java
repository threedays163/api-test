
package com.huatu.paike.dal.paike.dto;

import com.huatu.paike.dal.paike.entity.AccidentLessonTimeDetail;
import com.huatu.paike.dal.paike.entity.LessonTimeDetail;

public class AccidentLessonTimeDetailConvert {
    public static AccidentLessonTimeDetail convert(LessonTimeDetail ltd, Long accidentId) {
        AccidentLessonTimeDetail altd = new AccidentLessonTimeDetail();
        altd.setAccidentId(accidentId);
        altd.setClassId(ltd.getClassId());
        altd.setCreateTime(ltd.getCreateTime());
        altd.setCreatorId(ltd.getCreatorId());
        altd.setDuration(ltd.getDuration());
        altd.setEndTime(ltd.getEndTime());
        altd.setId(ltd.getId());
        altd.setLessonDate(ltd.getLessonDate());
        altd.setLessonId(ltd.getLessonId());
        altd.setNodeId(ltd.getNodeId());
        altd.setStartTime(ltd.getStartTime());
        altd.setUpdateTime(ltd.getUpdateTime());
        return altd;
    }

    public static LessonTimeDetail revert(AccidentLessonTimeDetail altd) {
        LessonTimeDetail ltd = new LessonTimeDetail();
        ltd.setClassId(altd.getClassId());
        ltd.setCreateTime(altd.getCreateTime());
        ltd.setCreatorId(altd.getCreatorId());
        ltd.setDuration(altd.getDuration());
        ltd.setEndTime(altd.getEndTime());
        ltd.setId(altd.getId());
        ltd.setLessonDate(altd.getLessonDate());
        ltd.setLessonId(altd.getLessonId());
        ltd.setNodeId(altd.getNodeId());
        ltd.setStartTime(altd.getStartTime());
        ltd.setUpdateTime(altd.getUpdateTime());
        return ltd;
    }
}
