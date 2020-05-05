package com.chengql.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

//集群@EnableTurbine注解包含了@EnableDiscoveryClient注解
@EnableTurbine
@SpringBootApplication
@EnableHystrixDashboard
// @SpringCloudApplication 此注解包含上面三种注解 包含 服务 发现 与断路
public class HystrixDashboardTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboardTurbineApplication.class, args);
	}

}