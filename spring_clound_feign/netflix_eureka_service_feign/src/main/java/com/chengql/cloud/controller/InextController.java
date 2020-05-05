package com.chengql.cloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient
public class InextController {
	private Logger LOGGER = LoggerFactory.getLogger(InextController.class);
	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping(value = "/index")
	public String index() {
		LOGGER.info(discoveryClient.description());
		return "index";
	}

}
