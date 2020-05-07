package com.wk.card.moshi.c_do11.b_command.base;

public class ConcreteCommand  extends Command{

	public ConcreteCommand(Receiver receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		receiver.action();
	}

}
