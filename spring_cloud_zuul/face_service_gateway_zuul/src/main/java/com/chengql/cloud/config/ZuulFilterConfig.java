package com.chengql.cloud.config;

import org.springframework.context.annotation.Bean;

import com.chengql.cloud.filter.PreZuulThrowExceptionFilter;
//@Configuration
public class ZuulFilterConfig {
	@Bean
    public PreZuulThrowExceptionFilter throwExceptionFilter() {
        return new PreZuulThrowExceptionFilter();
    }
}
