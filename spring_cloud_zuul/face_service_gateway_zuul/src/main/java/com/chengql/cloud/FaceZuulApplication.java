package com.chengql.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 简单路由
 * 
 * @author chengql
 *
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringCloudApplication
public class FaceZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(FaceZuulApplication.class, args);
	}


}