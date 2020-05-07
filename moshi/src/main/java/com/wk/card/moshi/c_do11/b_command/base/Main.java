package com.wk.card.moshi.c_do11.b_command.base;

public class Main {
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		
		ConcreteCommand c = new  ConcreteCommand(receiver);
		
		Invoker invoker = new  Invoker();
		
		invoker.setCommand(c);
		invoker.executeCommand();
		
	}
}
