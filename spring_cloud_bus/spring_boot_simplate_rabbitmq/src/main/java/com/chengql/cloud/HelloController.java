package com.chengql.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@Autowired
	private  ProducerSender producerSender;
	@RequestMapping(value="/send")
	@ResponseBody
	public String send(){
		producerSender.send();
		return "success";
	}
}
