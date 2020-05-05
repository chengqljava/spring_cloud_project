package com.chengql.cloud.controller;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InextController {

	private Logger LOGGER = LoggerFactory.getLogger(InextController.class);
	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping(value = "/index")
	public String index() throws InterruptedException {
		// 因为Hystrix 默认超时是2000毫秒
		int sleepTime = new Random().nextInt(3000);
		LOGGER.info("sleepTime" + sleepTime);
		LOGGER.info(discoveryClient.description());
		Thread.sleep(sleepTime);
		return "index";
	}

}
