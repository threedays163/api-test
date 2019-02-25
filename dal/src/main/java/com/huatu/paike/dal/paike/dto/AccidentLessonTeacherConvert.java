
package com.huatu.paike.dal.paike.dto;

import com.huatu.paike.dal.paike.entity.AccidentLessonTeacher;
import com.huatu.paike.dal.paike.entity.LessonTeacher;

public class AccidentLessonTeacherConvert {

    public static AccidentLessonTeacher convert(LessonTeacher lt, Long accidentId) {
        AccidentLessonTeacher alt = new AccidentLessonTeacher();
        alt.setAccidentId(accidentId);
        alt.setBatchNum(lt.getBatchNum());
        alt.setClassId(lt.getClassId());
        alt.setCreateTime(lt.getCreateTime());
        alt.setCreatorId(lt.getCreatorId());
        alt.setCsstId(lt.getCsstId());
        alt.setId(lt.getId());
        alt.setIfFeedback(lt.getIfFeedback());
        alt.setIfPushReward(lt.getIfPushReward());
        alt.setLessonId(lt.getLessonId());
        alt.setNodeId(lt.getNodeId());
        alt.setStageId(lt.getStageId());
        alt.setSubjectId(lt.getSubjectId());
        alt.setTeacherStaffNo(lt.getTeacherStaffNo());
        alt.setTeacherType(lt.getTeacherType());
        alt.setUpdateTime(lt.getUpdateTime());
        alt.setIsLocal(lt.getIsLocal());
        return alt;
    }

    public static LessonTeacher revert(AccidentLessonTeacher alt) {
        LessonTeacher lt = new LessonTeacher();
        lt.setBatchNum(alt.getBatchNum());
        lt.setClassId(alt.getClassId());
        lt.setCreateTime(alt.getCreateTime());
        lt.setCreatorId(alt.getCreatorId());
        lt.setCsstId(alt.getCsstId());
        lt.setId(alt.getId());
        lt.setIfFeedback(alt.getIfFeedback());
        lt.setIfPushReward(alt.getIfPushReward());
        lt.setLessonId(alt.getLessonId());
        lt.setNodeId(alt.getLessonId());
        lt.setStageId(alt.getStageId());
        lt.setSubjectId(alt.getSubjectId());
        lt.setTeacherStaffNo(alt.getTeacherStaffNo());
        lt.setTeacherType(alt.getTeacherType());
        lt.setUpdateTime(alt.getUpdateTime());
        lt.setIsLocal(alt.getIsLocal());
        return lt;
    }
}
