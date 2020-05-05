package com.chengql.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chengql.cloud.entity.User;

/**
 * 
 * @author chengql 服务名不区分大小写
 */
@FeignClient("index-service")
public interface IndexService {
	@RequestMapping("/index")
	public String index();
	
	/**
	 * Request 参数请求
	 * @param name
	 * @return
	 */
	@RequestMapping(value = "/name")
	public String name(@RequestParam(value="name",required = false) String name);
	/**
	 * 带header请求
	 * @param name
	 * @param age
	 * @return
	 */
	@RequestMapping(value = "/name/age")
	public User nameAge(@RequestHeader(value="name",required = false) String name,@RequestHeader(value="age",required = false) int age);
	/**
	 * 带RequestBody请求
	 * @param name
	 * @param age
	 * @return
	 */
	@RequestMapping(value = "/user")
	public String user(@RequestBody User user);
}
