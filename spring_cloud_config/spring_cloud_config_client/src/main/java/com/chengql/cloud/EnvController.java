package com.chengql.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.config.environment.Environment;
import org.springframework.web.bind.annotation.RequestMapping;

//@RefreshScope
//@RestController
public class EnvController {
	@Autowired
	private Environment env;
	
	@RequestMapping(value="/env/from")
	public String envFrom(){
		return env.getProfiles().toString();
	}


}
