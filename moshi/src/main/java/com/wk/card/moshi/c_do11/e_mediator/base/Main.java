package com.wk.card.moshi.c_do11.e_mediator.base;

public class Main {
	public static void main(String[] args) {
		ConcreMediator m = new ConcreMediator();
		
		ConcreColleague1 c1 = new ConcreColleague1(m);
		ConcreColleague2 c2 = new ConcreColleague2(m);
		
		m.setConcreColleague1(c1);
		m.setConcreColleague2(c2);
		
		c1.send("吃饭了吗");
		c2.send("没有呢？你请客");
		
	}
}
