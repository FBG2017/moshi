package com.wk.card.moshi.c_do11.b_command.base;

public  abstract class Command {

	protected Receiver receiver;
	
	public Command(Receiver receiver) {
		this.receiver=receiver;
	}
	
	public abstract void execute();
}
