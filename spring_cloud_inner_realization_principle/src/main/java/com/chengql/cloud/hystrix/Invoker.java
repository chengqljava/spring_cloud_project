package com.chengql.cloud.hystrix;

/*
 * 客户端调用者
 */
public class Invoker {
	private Command command;

	public void action() {
		command.execute();
	}
}
