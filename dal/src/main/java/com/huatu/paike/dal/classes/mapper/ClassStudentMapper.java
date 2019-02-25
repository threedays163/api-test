package com.huatu.paike.dal.classes.mapper;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import com.huatu.common.sqlbuilder.dto.PageDto;
import com.huatu.paike.dal.annotations.MapF2F;
import com.huatu.paike.dal.classes.entity.ClassStudent;
import com.huatu.paike.dal.classes.entity.ClassStudentCriteria;
import com.huatu.paike.dal.goodsOrder.dto.OrderLessonTime;

import tk.mybatis.mapper.common.Mapper;

public interface ClassStudentMapper extends Mapper<ClassStudent> {
    int deleteByFilter(ClassStudentCriteria filter);

    /**
     * 根据班级编号查询在班人数
     *
     * @param classNo
     * @return
     */
    Integer queryStuCountByClassNo(@Param("classNo") String classNo);

    /**
     * 查询班级人数
     *
     * @param classIds
     * @return
     */
    @MapF2F
    Map<Long, Integer> queryStuCountByClassIds(@Param("classIds") Set<Long> classIds);

    /**
     * 判断订单是否在班级里
     *
     * @param classNo
     * @param orderNo
     * @return
     */
    Integer queryIfExistOrder(@Param("classNo") String classNo, @Param("classId") Long classId,
        @Param("orderNo") String orderNo);

    /**
     * 根据班级编号查询在班学员信息
     *
     * @param classNo
     * @return
     */
    @MapKey("orderNo")
    Map<String, ClassStudent> queryStuByClasssNo(@Param("classNo") String classNo, @Param("pageDto") PageDto pageDto);

    List<String> queryOrderNoByClassNo(@Param("classNo") String classNo);

    /**
     * 通过班级编号和商品编号查询有哪些订单
     *
     * @param classNo
     * @param goodsNo
     * @return
     */
    List<String> queryStuCountByClassNoAndGoodsNo(@Param("classNo") String classNo, @Param("goodsNo") String goodsNo);

    /**
     * 通过班级编号和商品编号查询每个商品编号的订单数
     *
     * @param classNo
     * @param goodsNos
     * @return
     */
    @MapF2F
    Map<String, Integer> queryGoodsStuCountByClassNoAndGoodsNo(@Param("classNo") String classNo);

    /**
     * 根据订单编号查询在班记录
     *
     * @param orderNo
     * @return
     */
    List<ClassStudent> queryByOrderNo(@Param("orderNo") String orderNo);

    /**
     * 查询订单编号关联的学生ID
     *
     * @param orderNos
     * @param classId
     * @return
     */
    List<ClassStudent> queryStuIdByOrderList(@Param("orderNos") List<String> orderNos, @Param("classId") Long classId);

    /**
     * 班级和商品下的订单编号
     *
     * @param classId
     * @param goodsNos
     * @return
     */
    List<String> queryOrderNosByClassAndGoods(@Param("classId") Long classId, @Param("goodsNos") List<String> goodsNos);

    /**
     * 根据订单号查询订单当前班级的最早上课时间和最晚下课时间
     *
     * @param orderNoList
     * @return
     */
    List<OrderLessonTime> queryOrderLessionTimeByOrderNo(List<String> orderNoList);

    /**
     * 根据订单编号查询该订单所在的班级个数
     * 
     * @param orderNos
     * @return
     */
    @MapF2F
    Map<String, Integer> queryClassCountByOrderNos(Collection<String> orderNos);

    /**
     * 查询订单的入班时间
     *
     * @param orderNoList
     * @param classId
     * @return
     */
    @MapF2F
    Map<String, Date> queryOrderIncomeClassTime(@Param("orderNoList") List<String> orderNoList, @Param("classId")Long classId);

    /**
     * 查询所有
     *
     * @param classStudent
     * @return
     */
    List<ClassStudent> findList(ClassStudent classStudent);
}