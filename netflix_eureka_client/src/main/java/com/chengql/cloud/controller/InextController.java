package com.chengql.cloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chengql.cloud.entity.User;

@RestController
public class InextController {
	private Logger LOGGER = LoggerFactory.getLogger(InextController.class);
	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping(value = "/index")
	public String index() {
		LOGGER.info(discoveryClient.description());
		return "index"+System.currentTimeMillis();
	}
	/**
	 * Request 参数请求
	 * @param name
	 * @return
	 */
	@RequestMapping(value = "/name")
	public String name(@RequestParam("name") String name) {
		LOGGER.info(discoveryClient.description());
		return "name "+name+System.currentTimeMillis();
	}
	/**
	 * 带header请求
	 * @param name
	 * @param age
	 * @return
	 */
	@RequestMapping(value = "/name/age")
	public User nameAge(@RequestHeader String name,@RequestHeader int age) {
		LOGGER.info(discoveryClient.description());
		User user = new User();
		user.setAge(age);
		user.setName(name);
		return user;
	}
	/**
	 * 带header请求
	 * @param name
	 * @param age
	 * @return
	 */
	@RequestMapping(value = "/user")
	public String user(@RequestBody User user) {
		LOGGER.info(discoveryClient.description());
		return "user name "+user.getName()+" age: "+user.getAge()+System.currentTimeMillis();
	}


}
