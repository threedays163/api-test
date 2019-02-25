package com.huatu.paike.dal.classes.mapper;

import java.security.cert.TrustAnchor;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.huatu.paike.dal.annotations.MapF2A;
import com.huatu.paike.dal.annotations.MapF2F;
import com.huatu.paike.dal.annotations.MapF2L;
import com.huatu.paike.dal.annotations.MapF2ML;
import com.huatu.paike.dal.classes.entity.ClassStudentRecord;
import com.huatu.paike.dal.classes.entity.ClassStudentRecordCriteria;

import tk.mybatis.mapper.common.Mapper;

public interface ClassStudentRecordMapper extends Mapper<ClassStudentRecord> {
    int deleteByFilter(ClassStudentRecordCriteria filter);

    /**
     * 根据订单号和对应的班级id查询订单出入班记录
     *
     * @param orderNoList
     * @return
     */
    List<ClassStudentRecord> queryStudentRecord(List<String> orderNoList);

    /**
     * 根据班级查询出班订单人数
     * 
     * @param classID
     * @return
     */
    @MapF2ML
    Map<String, Map<String,List<Integer>>> queryStuCountByOutClass(@Param("classId") long classId);

    /**
     * 批量插入数据
     * 
     * @param csrList
     */
    void batchInsert(List<ClassStudentRecord> csrList);

    /**
     * 查询订单在班级里的进出班时间
     * 
     * @param classId
     * @param orderNos
     * @return
     */
    @MapF2A
    Map<String, List<Date>> queryInAndOutTime(@Param("classId") Long classId, @Param("orderNos") List<String> orderNos);

    /**
     * 查询订单在班级里的退单记录
     * @param orderNos
     * @param classId
     * @return
     */
    List<ClassStudentRecord> queryOrderValidateTime(@Param("orderNos")Collection<String> orderNos, @Param("classId") Long classId);
}