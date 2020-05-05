package com.chengql.cloud;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component

//@RabbitListeners(value={@RabbitListener(queues="")})
public class ConsumeReceiver {
	@RabbitListener(queues="hello")
	public void process(String hello){
		System.out.println(hello);
	}

}
