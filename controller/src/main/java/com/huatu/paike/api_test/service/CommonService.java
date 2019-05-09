
package com.huatu.paike.api_test.service;

import com.huatu.common.service.dto.resp.*;
import com.huatu.ehr.service.dto.resp.StaffBasicRespDto;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface CommonService {

    public Map<Long, String> getAllProductID2NameMap();

    public Map<Long, ProductTypeDto> getAllProductId2DtoMap();

    public Map<String, String> getAllExamWay();

    public Map<String, String> getAllExamType2NameMap();

    public Map<Long, BusinessUnitRespDto> getAllUnitMap();

    public Map<Long, StaffBasicRespDto> queryStaffMap(List<Long> staffIds);

    public Map<String, String> queryTeacherNameByNos(List<String> teacherNos);

    public Map<Long, String> queryStageID2NameMap(Collection<Long> stageIds);

    public Map<Long, String> getStageID2NameAllMap();

    public Map<Long, String> querySubjectID2NameMap(Collection<Long> subjectIds);

    public Map<Long, String> getSubjectID2NameAllMap();

    public Map<Long, StageDto> getStageID2EntityAllMap();

    public Map<Long, SubjectDto> getSubjectID2EntityAllMap();

    /**
     * 根据阶段Id查询阶段名称
     *
     * @param stageId
     * @return
     */
    public String getStageNameById(Long stageId);

    /**
     * 根据科目Id查询科目名称
     *
     * @param subjectId
     * @return
     */
    public String getSubjectNameById(Long subjectId);

    /**
     * 查询科目所属科目组
     *
     * @param subjectIds
     * @return key:subjectId value:subjectGroupId
     */
    Map<Long, Long> getSubjectGroupIdMap(Collection<Long> subjectIds);

    /**
     * 查询科目组名称
     *
     * @param subjectGroupIds
     * @return key:subjectGroupId value:subjectGroupName
     */
    Map<Long, String> getSubjectGroupNameMap(Collection<Long> subjectGroupIds);

    /**
     * 查询事业部
     *
     * @param businessUnitIds
     * @return
     */
    Map<Long, BusinessUnitRespDto> getUnitMap(Collection<Long> businessUnitIds);

    /**
     * 查询科目对应的事业部信息
     *
     * @param subjectIds
     * @return
     */
    Map<Long, BusinessUnitRespDto> getUnitMapBySubjectIds(Collection<Long> subjectIds);

    /**
     * 根据考试类型编码查询详情
     *
     * @param code
     * @return
     */
    ExamTypeDto getExamTypeByCode(String code);

}
