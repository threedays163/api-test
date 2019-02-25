
package com.huatu.paike.dal.paike.dto;

import com.huatu.paike.dal.paike.entity.AccidentClassLesson;
import com.huatu.paike.dal.paike.entity.ClassLesson;

public class AccidentClassLessonConvert {

    public static AccidentClassLesson convert(ClassLesson cl, Long accidentId) {
        AccidentClassLesson acl = new AccidentClassLesson();
        acl.setAccidentId(accidentId);
        acl.setBatchNum(cl.getBatchNum());
        acl.setClassId(cl.getClassId());
        acl.setCreateTime(cl.getCreateTime());
        acl.setCreatorId(cl.getCreatorId());
        acl.setCsstId(cl.getCsstId());
        acl.setEndTime(cl.getEndTime());
        acl.setHasCost(cl.getHasCost());
        acl.setHasReward(cl.getHasCost());
        acl.setId(cl.getId());
        acl.setIsAdditional(cl.getIsAdditional());
        acl.setIsDiscard(cl.getIsDiscard());
        acl.setIsLocal(cl.getIsLocal());
        acl.setLessonDate(cl.getLessonDate());
        acl.setLessonDuration(cl.getLessonDuration());
        acl.setNodeId(cl.getNodeId());
        acl.setRoomId(cl.getRoomId());
        acl.setStageId(cl.getStageId());
        acl.setStartTime(cl.getStartTime());
        acl.setStatus(cl.getStatus());
        acl.setSubjectId(cl.getSubjectId());
        acl.setTeacherStaffNo(cl.getTeacherStaffNo());
        acl.setUpdateTime(cl.getUpdateTime());
        acl.setLessonTableDetailId(cl.getLessonTableDetailId());
        acl.setTeachWay(cl.getTeachWay());
        return acl;
    }

    public static ClassLesson revert(AccidentClassLesson acl) {
        ClassLesson cl = new ClassLesson();
        cl.setBatchNum(acl.getBatchNum());
        cl.setClassId(acl.getClassId());
        cl.setCreateTime(acl.getCreateTime());
        cl.setCreatorId(acl.getCreatorId());
        cl.setCsstId(acl.getCsstId());
        cl.setEndTime(acl.getEndTime());
        cl.setHasCost(acl.getHasCost());
        cl.setHasReward(acl.getHasCost());
        cl.setId(acl.getId());
        cl.setIsAdditional(acl.getIsAdditional());
        cl.setIsDiscard(acl.getIsDiscard());
        cl.setIsLocal(acl.getIsLocal());
        cl.setLessonDate(acl.getLessonDate());
        cl.setLessonDuration(acl.getLessonDuration());
        cl.setNodeId(acl.getNodeId());
        cl.setRoomId(acl.getRoomId());
        cl.setStageId(acl.getStageId());
        cl.setStartTime(acl.getStartTime());
        cl.setStatus(acl.getStatus());
        cl.setSubjectId(acl.getSubjectId());
        cl.setTeacherStaffNo(acl.getTeacherStaffNo());
        cl.setUpdateTime(acl.getUpdateTime());
        cl.setLessonTableDetailId(acl.getLessonTableDetailId());
        cl.setTeachWay(acl.getTeachWay());
        return cl;
    }
}
