package com.wk.card.moshi.c_do11.b_command.base;

public class Invoker {

	protected Command command;
	public void setCommand(Command command) {
		this.command = command;
	}
	
   public void executeCommand() {
	   command.execute();
   }
}
