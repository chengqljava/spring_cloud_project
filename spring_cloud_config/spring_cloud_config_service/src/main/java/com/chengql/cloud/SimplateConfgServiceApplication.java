package com.chengql.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 简单配置中心服务端
 * 
 * @author chengql
 *
 */
@EnableConfigServer
@SpringBootApplication
public class SimplateConfgServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplateConfgServiceApplication.class, args);
	}


}