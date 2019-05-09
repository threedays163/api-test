package com.huatu.paike.api_test.service.impl;

import com.huatu.common.dto.resp.Node;
import com.huatu.paike.dal.permission.entity.Organization;
import com.huatu.paike.dal.permission.mapper.OrganizationMapper;

import com.google.common.collect.Lists;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NodeServiceImpl extends AbstractNodeService {

    @Autowired
    private OrganizationMapper organizationMapper;

    @Override
    protected List<Node> getAllNodeFromDb() {
        List<Node> result = Lists.newArrayList();
        List<Organization> orgList = organizationMapper.findAll();
        for (Organization org : orgList) {
            result.add(from(org));
        }
        return result;
    }

    private Node from(Organization org) {
        Node node = new Node();
        node.setId(org.getId());
        node.setCode(org.getCode());
        node.setName(org.getName());
        node.setPid(org.getPid());
        node.setType(org.getNodeType());
        node.setIsDel(org.getIsDel());
        return node;
    }

}
