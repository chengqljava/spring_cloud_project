package com.chengql.cloud.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class IndexService {
	@Autowired
	private RestTemplate restTemplate;
	private Logger LOGGER = LoggerFactory.getLogger(IndexService.class);

	@HystrixCommand(fallbackMethod = "error")
	public String index() {
		LOGGER.info("@Service ribbon/index");
		return restTemplate.getForEntity("http://INDEX-SERVICE/index", String.class).getBody()
				+ System.currentTimeMillis();
	}

	public String error() {
		return "error" + System.currentTimeMillis();
	}
}
