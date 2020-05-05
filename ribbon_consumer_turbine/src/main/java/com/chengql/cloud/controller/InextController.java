package com.chengql.cloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chengql.cloud.service.IndexService;

@RestController
public class InextController {
	private Logger LOGGER = LoggerFactory.getLogger(InextController.class);
	@Autowired
	private IndexService indexService;

	@RequestMapping(value = "/ribbon/index")
	public String index() {
		LOGGER.info("ribbon/index");
		return indexService.index();
	}

	public String error() {
		return "error" + System.currentTimeMillis();
	}
}
