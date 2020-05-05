package com.chengql.cloud.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;
//@WebFilter(filterName = "SpringOncePerRequestFilter", urlPatterns = "/*")
public class SpringOncePerRequestFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.err.println("原始Springfilter SpringOncePerRequestFilter");
		chain.doFilter(request, response);
	}

}
