package com.chengql.cloud.enums;

public enum ZuulFilterTypeEnum {
	PRE_TYPE("pre","在请求被路由之前调用"),ROUTING_TYPE("routing","在路由请求时调用"),POST_TYPE("post","在routing和error之后调用"),ERROR_TYPE("error","处理请求时发生错误时被调用");
	private String code;
	private String desc;
	private ZuulFilterTypeEnum(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}
	public String getCode() {
		return code;
	}
	public String getDesc() {
		return desc;
	}

}
