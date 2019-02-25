package com.huatu.paike.dal.permission.dto;

import java.util.List;

import com.huatu.common.sqlbuilder.dto.PageDto;

import lombok.Data;

@Data
public class RoleQueryParams {

	private String query;

	private PageDto pageDto;

	private List<Long> ids;

}
