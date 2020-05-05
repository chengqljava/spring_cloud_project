package com.chengql.cloud;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class RabbitMqConfig {
	@Bean
	public Queue helloQueue(){
		// 是否持久化
	    boolean durable = true;
	    // 仅创建者可以使用的私有队列，断开后自动删除
	    boolean exclusive = false;
	    // 当所有消费客户端连接断开后，是否自动删除队列
	    boolean autoDelete = false;
	    return new Queue("hello");
	}

}
