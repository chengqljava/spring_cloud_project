package com.chengql.cloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chengql.cloud.entity.User;
import com.chengql.cloud.service.IndexService;

@RestController
public class InextController {
	private Logger LOGGER = LoggerFactory.getLogger(InextController.class);
    @Autowired
    private IndexService indexService;
	@RequestMapping(value = "/index")
	public String index() {
		return indexService.index();
	}
	@RequestMapping(value = "/user")
	public String user() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(indexService.name("A")).append("\n");
		stringBuilder.append(indexService.nameAge("2",2)).append("\n");
		User user  = new User();
		user.setName("3");
		user.setAge(3);
		stringBuilder.append(indexService.user(user)).append("\n");
		return stringBuilder.toString();
	}

}
