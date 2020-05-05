package com.chengql.cloud.filter;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.chengql.cloud.enums.ZuulFilterTypeEnum;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
//@Component
public class ErrorZuulFilter  extends ZuulFilter{
	 private static final Logger LOGGER = LoggerFactory.getLogger(ErrorZuulFilter.class);
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		RequestContext ctx = RequestContext.getCurrentContext();
		Throwable throwable = ctx.getThrowable();
		LOGGER.info("this is a ErrorZuulFilter:{}",throwable.getMessage());
		ctx.set("error.status_code", HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		ctx.set("error.exception", throwable.getCause());
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return ZuulFilterTypeEnum.ERROR_TYPE.getCode();
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 10;
	}

}
