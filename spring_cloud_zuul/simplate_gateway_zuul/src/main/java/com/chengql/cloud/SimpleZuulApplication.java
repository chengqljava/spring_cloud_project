package com.chengql.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 简单路由
 * 
 * @author chengql
 *
 */

@EnableZuulProxy
@SpringCloudApplication
public class SimpleZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleZuulApplication.class, args);
	}


}