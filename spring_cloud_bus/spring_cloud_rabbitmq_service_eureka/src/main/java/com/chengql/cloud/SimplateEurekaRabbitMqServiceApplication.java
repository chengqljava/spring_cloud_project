package com.chengql.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 分布式配置中心服务端
 * 
 * @author chengql
 *
 */
@EnableDiscoveryClient //将服务注册到注册中心
@EnableConfigServer
@SpringBootApplication
public class SimplateEurekaRabbitMqServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplateEurekaRabbitMqServiceApplication.class, args);
	}


}