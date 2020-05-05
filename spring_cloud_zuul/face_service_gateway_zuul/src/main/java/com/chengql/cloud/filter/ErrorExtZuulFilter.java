package com.chengql.cloud.filter;

import org.springframework.cloud.netflix.zuul.filters.post.SendErrorFilter;

import com.chengql.cloud.enums.ZuulFilterTypeEnum;
//@Component
public class ErrorExtZuulFilter extends SendErrorFilter{
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}



	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return ZuulFilterTypeEnum.ERROR_TYPE.getCode();
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 30;
	}
}
