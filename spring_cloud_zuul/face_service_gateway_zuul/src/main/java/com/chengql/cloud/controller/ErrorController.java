package com.chengql.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
//@RestController
public class ErrorController {
	@RequestMapping("/error")
	public String error() {
		return "login" + System.currentTimeMillis();
	}
}
