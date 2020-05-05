package com.chengql.cloud.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author chengql
 * 原始filter
 *
 */

//@WebFilter(filterName = "WebServletFilter", urlPatterns = "/*")
public class WebServletFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.err.println("原始filter WebServletFilter");
		chain.doFilter(request, response);
	}

}
