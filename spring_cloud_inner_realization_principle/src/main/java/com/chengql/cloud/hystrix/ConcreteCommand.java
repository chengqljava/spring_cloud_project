package com.chengql.cloud.hystrix;

public class ConcreteCommand implements Command {
	private Recevier recevier;

	public ConcreteCommand(Recevier recevier) {
		super();
		this.recevier = recevier;
	}

	@Override
	public void execute() {
		this.recevier.action();
	}

}
