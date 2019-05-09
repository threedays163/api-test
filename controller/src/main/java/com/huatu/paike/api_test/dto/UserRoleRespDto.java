package com.huatu.paike.api_test.dto;

import com.huatu.common.dto.resp.Node;
import com.huatu.paike.dal.permission.entity.Role;

import com.google.common.collect.Lists;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class UserRoleRespDto implements Serializable {

    private static final long serialVersionUID = -9101248080250579968L;

    private Long roleId;

    private String roleName;

    /**
     * 有权限的事业部ID集合，当存在0或者buIds为null或空时表示全部事业部权限
     */
    private Long businessUnitId;
    /**
     * 事业部名称
     */
    private String businessUnitName;

    private Node node;

    private Long nodeId;

    private List<Long> nodeIds;

    private List<Node> nodes;


    public static UserRoleRespDto from(Role role, Long orgId, Long buId) {
        UserRoleRespDto dto = new UserRoleRespDto();
        if (role != null) {
            dto.setRoleId(role.getId());
            dto.setRoleName(role.getName());
        }
        // dto.setNodeId(orgId);
        dto.setNodeIds(Lists.newArrayList(orgId));
        dto.setBusinessUnitId(buId);
        return dto;
    }

    public static UserRoleRespDto builder(Long roleId,String roleName,Long nodeId,Node node1,List<Long> nodeIds,List<Node> nodes,Long buId,String buName){
        UserRoleRespDto dto = new UserRoleRespDto();
        dto.setRoleId(roleId);
        dto.setRoleName(roleName);
        dto.setNode(node1);
        dto.setNodeId(nodeId);
        dto.setNodes(Lists.newArrayList(nodes));
        dto.setNodeIds(Lists.newArrayList(nodeIds));
        dto.setBusinessUnitId(buId);
        dto.setBusinessUnitName(buName);
        return dto;
    }

}
