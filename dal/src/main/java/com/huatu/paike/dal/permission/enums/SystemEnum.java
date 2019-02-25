package com.huatu.paike.dal.permission.enums;

public enum SystemEnum {

	SYSTEM(1, "系统内置"),

	NOT_SYSTEM(0, "非系统内置"),

	;
	private int status;

	private String desc;

	public int getStatus() {
		return status;
	}

	public String getDesc() {
		return desc;
	}

	private SystemEnum(int status, String desc) {
		this.status = status;
		this.desc = desc;
	}

}
