package com.chengql.cloud;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//生产者
@Component
public class ProducerSender {
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	public void send(){
		//线程不安全
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//线程安全
		LocalDateTime rightNow=LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss");
		String context = "hello"+ dateTimeFormatter.format(rightNow);
		this.amqpTemplate.convertAndSend("hello",context);
	}

}
