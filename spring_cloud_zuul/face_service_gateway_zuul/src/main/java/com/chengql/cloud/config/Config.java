package com.chengql.cloud.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	//service-v1 服务 访问路径变为/v1/service 路由匹配规则
	/*@Bean
	public PatternServiceRouteMapper serviceRouteMapper(){
		return new PatternServiceRouteMapper("(?<name>^.+)-(?<version>^.+$)","${version}/${name}");
	}*/

}
