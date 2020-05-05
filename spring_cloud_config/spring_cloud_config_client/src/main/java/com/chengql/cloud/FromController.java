package com.chengql.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RefreshScope
@RestController
public class FromController {
	@Value("${from:}")
	private String  from;
	@RequestMapping(value="/from")
	public String from(){
		return this.from+System.currentTimeMillis();
		
	}

}
