package com.huatu.paike.dal.classes.mapper;

import com.huatu.common.sqlbuilder.dto.PageDto;
import com.huatu.paike.dal.annotations.MapF2F;
import com.huatu.paike.dal.classes.dto.ClassListReqDto;
import com.huatu.paike.dal.classes.entity.ClassInfo;
import com.huatu.paike.dal.classes.entity.ClassInfoCriteria;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.*;

public interface ClassInfoMapper extends Mapper<ClassInfo> {
    int deleteByFilter(ClassInfoCriteria filter);

    /**
     * 根据班级id获取班级名称
     *
     * @param classIds
     * @return
     */
    @MapF2F
    public Map<Long, String> queryNameById(@Param("classIds") Set<Long> classIds);

    /**
     * 根据班级编码查询班级名称
     *
     * @param classNos
     * @return
     */
    @MapF2F
    Map<String, String> queryNameByNos(@Param("classNos") Collection<String> classNos);

    /**
     * 根据班级编号获取班级id
     *
     * @param classNos
     * @return
     */
    @MapF2F
    public Map<String, Long> queryNoAndIdMap(@Param("classNos") List<String> classNos);

    /**
     * 根据班级编号查询班级ID
     *
     * @param classNo
     * @return
     */
    public Long queryClassIDByClassNo(String classNo);

    /**
     * 根据班级编号查询班级名称
     *
     * @param classNo
     * @return
     */
    public String queryClassNameByClassNo(String classNo);

    /**
     * 根据班级编号查询班级
     *
     * @param classNo
     * @return
     */
    public ClassInfo queryByClassNo(String classNo);

    /**
     * 根据班级编号更新班级状态
     *
     * @param status
     * @param classNo
     * @return
     */
    public int updateClassStatus(@Param("status") int status, @Param("classNo") String classNo);

    /**
     * 根据条件列表查询符合条件的班级
     * 
     * @param startTime
     * @param endTime
     * @param goodsQuery
     * @param classQuery
     * @param status
     * @param buID
     * @param nodeID
     * @param nodeIds
     * @param interviewType
     * @param examType
     * @param productType
     * @param possibieMasterTeacherID
     * @return
     */
    public List<ClassInfo> queryListByComplexCondition(ClassListReqDto req);

    /**
     * 根据条件列表查询符合条件的班级
     * 
     * @param startTime
     * @param endTime
     * @param goodsQuery
     * @param classQuery
     * @param status
     * @param buID
     * @param nodeID
     * @param nodeIds
     * @param interviewType
     * @param examType
     * @param productType
     * @param possibieMasterTeacherID
     * @return
     */
    int countByComplexCondition(ClassListReqDto req);

    /**
     * 根据订单编号查询学员当前所在班级信息
     * 
     * @param orderNo
     * @return
     */
    public List<ClassInfo> queryClassInfoByOrderNo(@Param("orderNo") String orderNo);

    /**
     * 班级搜索列表
     * 
     * @param classQuery
     * @param nodeIds
     * @param statuses
     * @param pageDto
     * @param teachWay
     * @return
     */
    public List<ClassInfo> simpleList(@Param("classQuery") String classQuery, @Param("nodeIds") List<Long> nodeIds,
        @Param("statuses") List<Integer> statuses, @Param("pageDto") PageDto pageDto,
        @Param("teachWay") Integer teachWay);

    /**
     * 班级搜索列表
     * 
     * @param classQuery
     * @param nodeIds
     * @param statuses
     * @return
     */
    public int simpleCount(@Param("classQuery") String classQuery, @Param("nodeIds") List<Long> nodeIds,
        @Param("statuses") List<Integer> statuses);

    /**
     * 根据场地和班级状态查询班级
     * 
     * @param placeId
     * @param statuses
     * @return
     */
    public int countByRoomAndStatus(@Param("placeId") Long placeId, @Param("statuses") List<Integer> statuses);

    /**
     * 根据班级状态获取场地
     * 
     * @param statuses
     * @return
     */
    public Set<Long> getRoomIdsByStatus(@Param("statuses") List<Integer> statuses);

    /**
     * 根据商品编号获取未开班班级
     *
     * @param goodsNo
     * @return
     */
    public List<ClassInfo> getNotOpenClassByGoodsNo(@Param("goodsNo") String goodsNo);

    /**
     * 根据班级id获取班级编号
     *
     * @param classIds
     * @return
     */

    @MapF2F
    public Map<Long, String> queryNoById(@Param("classIds") Collection<Long> classIds);

    /**
     * 根据ids查询班级信息
     * 
     * @param ids
     * @return
     */
    List<ClassInfo> queryListByIds(@Param("ids") Collection<Long> ids);

    /*
     * 根据课次id获取班级信息
     *
     * @param lessonTableId
     * 
     * @return
     */
    public List<ClassInfo> queryClassInfoByLessonTableId(@Param("lessonTableId") Long lessonTableId,
        @Param("pageDto") PageDto pageDto);

    /**
     * 根据课次id统计班级信息
     *
     * @param lessonTableId
     * @return
     */
    public int countClassInfoByLessonTableId(@Param("lessonTableId") Long lessonTableId);

    /**
     * 根据商品编号获取未开始上课的班级
     * 
     * @param goodsNo
     * @param now
     * @return
     */
    public List<ClassInfo> getNotStartClassByGoodsNo(@Param("goodsNo") String goodsNo, @Param("orderNo") String orderNo,
        @Param("now") Date now);

    /**
     * 更新排课时长
     * 
     * @param classId
     * @param stageId
     * @param batchNum
     * @param doration
     */
    void updatePaikeDuration(@Param("classId") Long classId, @Param("duration") Integer duration);

    /**
     * 更新结课时长
     * 
     * @param classId
     * @param stageId
     * @param batchNum
     * @param doration
     */
    void updateFinishDuration(@Param("classId") Long classId, @Param("duration") Integer duration);
}