package com.chengql.cloud.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.chengql.cloud.filter.SpringOncePerRequestFilter;
import com.chengql.cloud.filter.WebServletFilter;

//@Configuration   //相当于spring中的<beans>标签
public class WebConfiguration {
	@Bean   //相当于spring中<bean>标签
	public FilterRegistrationBean<WebServletFilter> webServletFilter() {
		FilterRegistrationBean<WebServletFilter> registration = new FilterRegistrationBean<>();
		registration.setFilter(new WebServletFilter());
		registration.addUrlPatterns("/*");//配置过滤路径
		//registration.addInitParameter("paramName", "paramValue");//添加初始值
	
		registration.setName("WebServletFilter");//设置filter名称
		registration.setOrder(1);//请求中过滤器执行的先后顺序，值越小越先执行
		return registration;
	}
	@Bean   //相当于spring中<bean>标签
	public FilterRegistrationBean<SpringOncePerRequestFilter> SpringOncePerRequestFilter() {
		FilterRegistrationBean<SpringOncePerRequestFilter> registration = new FilterRegistrationBean<>();
		registration.setFilter(new SpringOncePerRequestFilter());
		registration.addUrlPatterns("/*");//配置过滤路径
		//registration.addInitParameter("paramName", "paramValue");//添加初始值
		registration.setName("SpringOncePerRequestFilter");//设置filter名称
		registration.setOrder(1);//请求中过滤器执行的先后顺序，值越小越先执行
		return registration;
	}
}
