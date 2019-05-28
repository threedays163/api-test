package com.huatu.paike.dal.goodsOrder.mapper;

import com.huatu.common.sqlbuilder.dto.PageDto;
import com.huatu.paike.dal.annotations.MapF2F;
import com.huatu.paike.dal.goodsOrder.dto.OrderQueryParam;
import com.huatu.paike.dal.goodsOrder.dto.StudentListParam;
import com.huatu.paike.dal.goodsOrder.dto.StudentListResp;
import com.huatu.paike.dal.goodsOrder.dto.StudentOrder;
import com.huatu.paike.dal.goodsOrder.entity.OrderInfo;
import com.huatu.paike.dal.goodsOrder.entity.OrderInfoCriteria;
import com.huatu.paike.dal.goodsOrder.entity.UpdateOrderStatusAndDurationParam;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.*;

public interface OrderInfoMapper extends Mapper<OrderInfo> {
    int deleteByFilter(OrderInfoCriteria filter);

    /**
     * 根据订单编号查询订单详情
     *
     * @param orderNo
     * @return
     */
    OrderInfo queryOrderInfoByOrderNo(@Param("orderNo") String orderNo);

    /**
     * 根据商品编号,订单id和订单状态查询对应订单
     *
     * @param param
     * @return
     */
    List<OrderInfo> queryOrderInfoList(OrderQueryParam param);

    /**
     * 查询总数
     *
     * @param param
     * @return
     */
    Integer queryCount(OrderQueryParam param);

    /**
     * 根据商品编码查询商品下的某种状态下的订单个数
     *
     * @param goodsNo
     * @param status 参照OrderStateEnum，0：代表查询所有状态订单
     * @return
     */
    int queryOrderCount(@Param("goodsNo") String goodsNo, @Param("status") int status);

    /**
     * 用订单编号列表，查询学员ID
     *
     * @param orderNos
     * @return
     */
    @MapKey("orderNo")
    Map<String, OrderInfo> queryStuIDByOrderNo(List<String> orderNos);

    /**
     * 根据订单编号查询订单信息
     *
     * @param orderNos
     * @return
     */
    @MapKey("orderNo")
    Map<String, OrderInfo> queryListByOrderNos(@Param("orderNos") Collection<String> orderNos);

    /**
     * 批量修改订单状态
     *
     * @param orderNos
     * @param status
     * @return
     */
    int updateOrderStatusInBatch(@Param("orderNos") List<String> orderNos, @Param("status") int status);

    /**
     * 根据班级编号查询在班订单列表
     *
     * @param classNo
     * @param pageDto
     * @return
     */
    List<OrderInfo> queryOrdersByClassNo(@Param("classNo") String classNo, @Param("pageDto") PageDto pageDto);

    /**
     * 通过(学生姓名,订单编号,手机号)模糊查询订单列表
     * 
     * @param classNo
     * @param orderQueryStr
     * @param pageDto
     * @return
     */
    List<OrderInfo> queryOrderByClassNoAndOrderQuery(@Param("classNo") String classNo,
        @Param("orderQueryStr") String orderQueryStr, @Param("pageDto") PageDto pageDto);

    /**
     * 通过(学生姓名,订单编号,手机号)模糊查询订单个数
     * 
     * @param classNo
     * @param orderQueryStr
     * @return
     */
    int queryOrderCountByClassNoAndOrderQuery(@Param("classNo") String classNo,
        @Param("orderQueryStr") String orderQueryStr);

    /**
     * 查询学员的订单总数
     *
     * @param studentIds
     * @return
     */
    @MapF2F
    Map<Long, Integer> queryStudentOrderNum(@Param("studentIds") List<Long> studentIds,
        @Param("nodeIds") Set<Long> nodeIds);

    /**
     * 查询学员的已关闭订单数
     *
     * @param studentIds
     * @return
     */
    @MapF2F
    Map<Long, Integer> queryStudentClosedOrderNum(@Param("studentIds") List<Long> studentIds,
        @Param("nodeIds") Set<Long> nodeIds);

    /**
     * 查询学员的所有订单信息
     *
     * @param studentId
     * @param pageDto
     * @return
     */
    List<StudentOrder> queryStudentOrderListById(@Param("studentId") Long studentId, @Param("pageDto") PageDto pageDto,
        @Param("nodeIds") Set<Long> nodeIds);

    /**
     * 查询学员所有订单的出入班记录总数
     *
     * @param studentId
     * @return
     */
    Integer queryStudentOrderCount(@Param("studentId") Long studentId, @Param("nodeIds") Set<Long> nodeIds);

    /**
     * 逻辑删除订单
     *
     * @param orderNo
     * @return
     */
    int deleteOrderInfo(@Param("orderNo") String orderNo);

    /**
     * 根据oldOrderNo和goodsNo查询订单详情
     *
     * @param oldOrderNo
     * @param goodsNo
     * @return
     */
    OrderInfo queryByOldOrderNoAndGoodsNo(@Param("oldOrderNo") String oldOrderNo, @Param("goodsNo") String goodsNo);

    /**
     * 查询商品某一状态订单数
     *
     * @param goodsNos
     * @return
     */
    @MapF2F
    Map<String, Integer> queryOrderCountByGoodsNos(@Param("goodsNos") Collection<String> goodsNos,
        @Param("orderState") Integer orderState);

    /**
     * 根据搜索条件查询学员
     *
     * @param param
     * @return
     */
    List<StudentListResp> queryStudentListByQuery(StudentListParam param);

    /**
     * 根据搜索条件查询学员的总数
     *
     * @param param
     * @return
     */
    int queryStudentCountByQuery(StudentListParam param);

    /**
     * 将已经不在班的订单状态更新为待入班
     *
     * @param orderNos
     * @return
     */
    int updateOrderStatus2WaitIncome(List<String> orderNos);

    /**
     * 将已经入班的班级状态更改为待入班状态更改为待排课
     *
     * @param orderNos
     * @return
     */
    int updateOrderStatus2WaitAssign(List<String> orderNos);

    List<OrderInfo> selectOrderStatusNotInClass(@Param("date") Date date);

    /**
     * 查询出所有待上课的订单
     *
     * @return
     */
    int updateOrderStatusToInClass(Date date);

    int queryNeedFixCount();

    List<OrderInfo> queryNeedFixOrderInfo(@Param("start") int start, @Param("limit") int limit);

    List<OrderInfo> queryDepartmentEq0(@Param("start") int start, @Param("limit") int limit);

    List<OrderInfo> queryAllByBatch(@Param("start") int start, @Param("limit") int limit);

    int updateOrderInfoBuyTimeAndPositionId(@Param("buyTime") Date buyTime, @Param("positionId") Long positionId,
        @Param("Id") Long Id);

    int update(@Param("studentId") Long studentId, @Param("mobile") String mobile,
        @Param("studentName") String studentName, @Param("Id") Long Id);

    Long updateOrderStatusAndDuration(UpdateOrderStatusAndDurationParam param);

    // Long updateOrderStatusAndDuration(@Param("duration") Integer duration,@Param("finishedDuration") Integer
    // finishedDuration, @Param("status")Integer status, @Param("orderNo")String orderNo);

    /**
     * 更新排课时长
     * 
     * @param orderNo
     * @param doration
     */
    void updatePaikeDuration(@Param("orderNo") String orderNo, @Param("duration") Integer duration);

    /**
     * 更新结课时长
     * 
     * @param orderNo
     * @param doration
     */
    void updateFinishDuration(@Param("orderNo") String orderNo, @Param("duration") Integer duration);

    /**
     * 修改订单信息
     * 
     * @param orderNo
     * @param newMobile
     * @param oldName
     * @param nameName
     */
    void updateStudentInfo(@Param("oldMobile") String oldMobile, @Param("newMobile") String newMobile,
        @Param("newName") String newName);

    List<Long> queryAllIds();

}