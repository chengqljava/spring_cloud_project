package com.chengql.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 配置中心客户端
 * 
 * @author chengql
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SimpleEureakRabbitMqClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleEureakRabbitMqClientApplication.class, args);
	}


}