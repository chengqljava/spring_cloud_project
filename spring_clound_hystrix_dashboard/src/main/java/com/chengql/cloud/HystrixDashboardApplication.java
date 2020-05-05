package com.chengql.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

//仪表盘
@EnableHystrixDashboard
// 开启断路器功能
// @EnableCircuitBreaker
// 注册中心能够发现
// @EnableDiscoveryClient
@SpringBootApplication
// @SpringCloudApplication 此注解包含上面三种注解 包含 服务 发现 与断路
public class HystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboardApplication.class, args);
	}

}