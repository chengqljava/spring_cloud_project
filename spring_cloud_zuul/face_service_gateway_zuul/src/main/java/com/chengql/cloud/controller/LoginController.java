package com.chengql.cloud.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	@RequestMapping("/login")
	public String login() {
		return "login" + System.currentTimeMillis();
	}
	@RequestMapping("/login/{param}")
	public String loginParam(@PathVariable String param) {
		return "login" +param+ System.currentTimeMillis();
	}
}
