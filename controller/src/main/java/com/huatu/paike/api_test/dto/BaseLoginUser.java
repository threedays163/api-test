
package com.huatu.paike.api_test.dto;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.huatu.cas.dto.AccountDto;
import com.huatu.common.dto.resp.Node;
import com.huatu.common.enums.EnumDto;
import com.huatu.common.enums.GenderEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
public class BaseLoginUser implements Serializable {

    private static final long serialVersionUID = 9096530828509388431L;

    // 员工id
    private Long id;
    // 中文名称
    private String name;
    // 工号
    private String staffNo;
    // 手机号
    private String mobile;
    // 头像
    private String avatar;
    // 性别
    private EnumDto genderEnum;
    // 入职日期
    private Date entryDate;

    private List<UserRoleRespDto> roles;// 所有角色

    /**
     * 当前角色
     */
    private UserRoleRespDto curRole;// 当前角色

    private List<Long> nodeIds;

    private List<Node> nodes;

    /**
     * 当前权限
     */
    private Map<Integer, Long> permissions;

    public static BaseLoginUser from(AccountDto accountDto) {
        if (accountDto == null) {
            return null;
        }
        BaseLoginUser loginUser = new BaseLoginUser();
        loginUser.setId(accountDto.getId());
        loginUser.setName(accountDto.getName());
        loginUser.setStaffNo(accountDto.getStaffNo());
        loginUser.setMobile(accountDto.getMobile());
        loginUser.setAvatar(accountDto.getAvatar());
        loginUser.setGenderEnum(EnumDto.from(GenderEnum.getByType(accountDto.getSex())));
        loginUser.setEntryDate(accountDto.getEntryDate());
        loginUser.setRoles(Lists.newArrayList());
        loginUser.setNodeIds(Lists.newArrayList());
        loginUser.setNodes(Lists.newArrayList());
        loginUser.setPermissions(Maps.newHashMap());
        return loginUser;
    }

}
