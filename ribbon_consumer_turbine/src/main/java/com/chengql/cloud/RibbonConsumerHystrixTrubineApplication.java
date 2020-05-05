package com.chengql.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//开启断路器功能
@EnableCircuitBreaker
// 注册中心能够发现
@EnableDiscoveryClient
@SpringBootApplication
// @SpringCloudApplication 此注解包含上面三种注解 包含 服务 发现 与断路
public class RibbonConsumerHystrixTrubineApplication {
	/**
	 * 开启客户端负载均衡
	 * 
	 * @return
	 */
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(RibbonConsumerHystrixTrubineApplication.class, args);
	}

}