package com.wk.card.moshi.c_do11.e_mediator.base;

public class ConcreColleague2  extends Colleague{

	public ConcreColleague2(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	

	public void send(String msg) {
		mediator.send(msg, this);
	}
	
	public void noti(String msg) {
		System.out.println("同事2得到消息"+msg);
	}
}
