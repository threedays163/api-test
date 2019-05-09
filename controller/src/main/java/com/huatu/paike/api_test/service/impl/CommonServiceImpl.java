
package com.huatu.paike.api_test.service.impl;

import com.huatu.common.errorcode.CommonErrorCode;
import com.huatu.common.service.*;
import com.huatu.common.service.dto.resp.*;
import com.huatu.ehr.service.StaffService;
import com.huatu.ehr.service.dto.resp.StaffBasicRespDto;
import com.huatu.order.service.paike.OrderGoodsService;
import com.huatu.order.service.paike.OrderService;
import com.huatu.paike.api_test.service.CommonService;
import com.huatu.paike.api_test.service.NodeService;
import com.huatu.shizi.service.teacher.TeacherQueryService;
import com.huatu.sku.service.GoodsService;
import com.huatu.sku.service.RecruitmentPositionService;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class CommonServiceImpl implements CommonService {

    @Autowired
    OrderGoodsService orderGoodsService;

    @Autowired
    RecruitmentPositionService recruitmentPositionService;

    @Autowired
    OrderService orderService;

    @Autowired
    ExamTypeService examTypeService;

    @Autowired
    ExamWayService examWayService;

    @Autowired
    ProductTypeService productTypeService;

    @Autowired
    StageService stageService;

    @Autowired
    SubjectService subjectService;

    @Autowired
    GoodsService goodsService;

    @Autowired
    StaffService staffService;

    @Autowired
    NodeService nodeService;

    @Autowired
    BusinessUnitService businessUnitService;

    @Autowired
    TeacherQueryService teacherQueryService;

    @Autowired
    private SubjectGroupService subjectGroupService;

    @Override
    public Map<Long, ProductTypeDto> getAllProductId2DtoMap() {
        List<ProductTypeDto> productType2Dtos = productTypeService.getAll();
        Map<Long, ProductTypeDto> productType2Name =
            productType2Dtos.stream().collect(Collectors.toMap(ProductTypeDto::getId, a -> a));
        return productType2Name;
    }

    /**
     * 获取产品类型 ID->name
     * 
     * @return
     */
    @Override
    public Map<Long, String> getAllProductID2NameMap() {
        List<ProductTypeDto> productType2Dtos = productTypeService.getAll();
        Map<Long, String> productType2Name =
            productType2Dtos.stream().collect(Collectors.toMap(ProductTypeDto::getId, ProductTypeDto::getName));
        return productType2Name;
    }

    /**
     * 获取笔面试类型 Code->name
     * 
     * @return
     */
    @Override
    public Map<String, String> getAllExamWay() {
        List<ExamWayDto> examWayDtos = examWayService.getAll();
        Map<String, String> examWay2Name =
            examWayDtos.stream().collect(Collectors.toMap(ExamWayDto::getCode, ExamWayDto::getName));
        return examWay2Name;
    }

    /**
     * 获取考试类型 type->name
     * 
     * @return
     */
    @Override
    public Map<String, String> getAllExamType2NameMap() {
        // 获取考试类型列表
        List<ExamTypeDto> examTypeDtos = examTypeService.getAllWithDel();
        Map<String, String> examType2Name =
            examTypeDtos.stream().collect(Collectors.toMap(ExamTypeDto::getCode, ExamTypeDto::getName));
        return examType2Name;
    }

    /**
     * 获取事业部信息
     * 
     * @param unitIds
     * @return
     */
    @Override
    public Map<Long, BusinessUnitRespDto> getAllUnitMap() {
        List<BusinessUnitRespDto> list = businessUnitService.getAll();
        // 按照id排序,采用默认方式,出现重复的key抛异常,使用linkHashMap排序
        return list.stream().sorted(Comparator.comparing(BusinessUnitRespDto::getId))
                .collect(Collectors.toMap(a -> a.getId(), Function.identity(),
                        (u,v) -> { throw new IllegalStateException(String.format("Duplicate key %s", u)); },
                        LinkedHashMap::new));
    }

    /**
     * 获取ehr员工信息
     * 
     * @param staffIds
     * @return
     */
    @Override
    public Map<Long, StaffBasicRespDto> queryStaffMap(List<Long> staffIds) {
        if (CollectionUtils.isEmpty(staffIds)) {
            return Maps.newHashMap();
        }
        return staffService.getStaffDetailByIds(staffIds).stream()
            .collect(Collectors.toMap(a -> a.getId(), Function.identity()));
    }

    @Override
    public Map<String, String> queryTeacherNameByNos(List<String> teacherNos) {
        if (CollectionUtils.isEmpty(teacherNos)) {
            return Maps.newHashMap();
        }
        return teacherQueryService.listIdAndNoByStaffNos(teacherNos);
    }

    /**
     * 获取阶段ID->name的map
     * 
     * @param stageIds
     * @return
     */
    @Override
    public Map<Long, String> queryStageID2NameMap(Collection<Long> stageIds) {
        List<StageDto> stageDtos = stageService.getStageListByIds(stageIds);
        Preconditions.checkNotNull(stageDtos, "从阶段公共服务查询结果为null");
        return stageDtos.stream().collect(Collectors.toMap(a -> a.getId(), a -> a.getName()));
    }

    /**
     * 获取科目ID->name的map
     * 
     * @param subjectIds
     * @return
     */
    @Override
    public Map<Long, String> querySubjectID2NameMap(Collection<Long> subjectIds) {
        List<SubjectDto> subjectDtos = subjectService.getSubjectListByIds(subjectIds);
        Preconditions.checkNotNull(subjectDtos, "从科目公共服务查询结果为null");
        return subjectDtos.stream().collect(Collectors.toMap(a -> a.getId(), a -> a.getName()));
    }

    @Override
    public Map<Long, String> getStageID2NameAllMap() {
        return stageService.getAll().stream().collect(Collectors.toMap(a -> a.getId(), a -> a.getName()));
    }

    @Override
    public Map<Long, String> getSubjectID2NameAllMap() {
        return subjectService.getAllIncludeDeleted().stream()
            .collect(Collectors.toMap(a -> a.getId(), a -> a.getName()));
    }

    @Override
    public Map<Long, StageDto> getStageID2EntityAllMap() {
        return stageService.getAll().stream().collect(Collectors.toMap(StageDto::getId, a -> a));
    }

    @Override
    public Map<Long, SubjectDto> getSubjectID2EntityAllMap() {
        return subjectService.getAllIncludeDeleted().stream().collect(Collectors.toMap(SubjectDto::getId, a -> a));
    }

    @Override
    public String getStageNameById(Long stageId) {
        if (stageId != null) {
            Set set = Sets.newHashSet();
            set.add(stageId);
            // 获取阶段名称
            Map<Long, String> stageID2NameMap = queryStageID2NameMap(set);
            if (stageID2NameMap != null) {
                return stageID2NameMap.get(stageId);
            }

        }
        return null;
    }

    @Override
    public String getSubjectNameById(Long subjectId) {
        if (subjectId != null) {
            Set set = Sets.newHashSet();
            set.add(subjectId);
            // 获取科目名称
            Map<Long, String> subjectID2NameMap = querySubjectID2NameMap(set);
            if (subjectID2NameMap != null) {
                return subjectID2NameMap.get(subjectId);
            }
        }
        return null;
    }

    @Override
    public Map<Long, Long> getSubjectGroupIdMap(Collection<Long> subjectIds) {
        if (CollectionUtils.isEmpty(subjectIds)) {
            return Maps.newHashMap();
        }
        List<SubjectDto> subjectList = subjectService.getSubjectListByIds(subjectIds);
        return subjectList.stream().collect(Collectors.toMap(p -> p.getId(), p -> p.getSubjectGroupId()));
    }

    @Override
    public Map<Long, String> getSubjectGroupNameMap(Collection<Long> subjectGroupIds) {
        List<SubjectGroupDto> subjectGroupDtoList;
        if (CollectionUtils.isEmpty(subjectGroupIds)) {
            subjectGroupDtoList = subjectGroupService.getAll();
        } else {
            subjectGroupDtoList = subjectGroupService.getByIds(subjectGroupIds);
        }
        return subjectGroupDtoList.stream().collect(Collectors.toMap(p -> p.getId(), p -> p.getName()));
    }

    @Override
    public Map<Long, BusinessUnitRespDto> getUnitMap(Collection<Long> businessUnitIds) {
        if (CollectionUtils.isEmpty(businessUnitIds)) {
            return Maps.newHashMap();
        }
        List<BusinessUnitRespDto> busUnitList = businessUnitService.getAll();
        return busUnitList.stream().filter(respDto -> businessUnitIds.contains(respDto.getId()))
                .collect(Collectors.toMap(p -> p.getId(), Function.identity()));
    }

    @Override
    public Map<Long, BusinessUnitRespDto> getUnitMapBySubjectIds(Collection<Long> subjectIds) {
        Map<Long, BusinessUnitRespDto> result = Maps.newHashMap();
        if (CollectionUtils.isEmpty(subjectIds)) {
            return result;
        }
        List<SubjectDto> subjectDtoList = subjectService.getSubjectListByIds(subjectIds);
        Map<Long, Long> subjectUnitMap = Maps.newHashMap();
        List<Long> unitIdList = Lists.newArrayList();
        for (SubjectDto dto : subjectDtoList) {
            subjectUnitMap.put(dto.getId(), dto.getBusinessUnitId());
            unitIdList.add(dto.getBusinessUnitId());
        }
        List<BusinessUnitRespDto> busUnitList = businessUnitService.getAll();
        Map<Long, BusinessUnitRespDto> busUnitMap = busUnitList.stream().collect(Collectors.toMap(p -> p.getId(), Function.identity()));
        subjectIds.forEach(subjectId -> {
            Optional.of(subjectUnitMap.get(subjectId)).map(unitId -> busUnitMap.get(unitId)).ifPresent(dto -> result.put(subjectId, dto));
        });
        return result;
    }

    @Override
    public ExamTypeDto getExamTypeByCode(String code) {
        if (StringUtils.isBlank(code)) {
            return null;
        }
        return examTypeService.getExamTypeByCode(code);
    }
}
