
package com.huatu.paike.dal.paike.dto;

import com.huatu.paike.dal.paike.entity.AccidentLessonStudent;
import com.huatu.paike.dal.paike.entity.LessonStudent;

public class AccidentLessonStudentConvert {
    public static AccidentLessonStudent convert(LessonStudent ls, Long accidentId) {
        AccidentLessonStudent als = new AccidentLessonStudent();
        als.setAccidentId(accidentId);
        als.setBatchNum(ls.getBatchNum());
        als.setClassId(ls.getClassId());
        als.setCost(ls.getCost());
        als.setCreateTime(ls.getCreateTime());
        als.setCreatorId(ls.getCreatorId());
        als.setIsRecomplete(ls.getIsRecomplete() == 1 ? true : false);
        als.setLessonId(ls.getLessonId());
        als.setGoodsNo(ls.getGoodsNo());
        als.setId(ls.getId());
        als.setNodeId(ls.getNodeId());
        als.setOrderNo(ls.getOrderNo());
        als.setPrice(ls.getPrice());
        als.setStageId(ls.getStageId());
        als.setStudentId(ls.getStudentId());
        als.setSubjectId(ls.getSubjectId());
        als.setUpdateTime(ls.getUpdateTime());
        return als;
    }
}
