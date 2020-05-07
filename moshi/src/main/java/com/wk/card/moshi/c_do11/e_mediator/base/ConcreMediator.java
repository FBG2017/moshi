package com.wk.card.moshi.c_do11.e_mediator.base;

public class ConcreMediator extends Mediator {
		private ConcreColleague1 concreColleague1;
		private ConcreColleague2 concreColleague2;
	@Override
	public void send(String msg, Colleague collague) {
		// TODO Auto-generated method stub
		if (collague==concreColleague1) {
			concreColleague2.noti(msg);
		}else {
			concreColleague1.noti(msg);
		}
	}
	public ConcreColleague1 getConcreColleague1() {
		return concreColleague1;
	}
	public void setConcreColleague1(ConcreColleague1 concreColleague1) {
		this.concreColleague1 = concreColleague1;
	}
	public ConcreColleague2 getConcreColleague2() {
		return concreColleague2;
	}
	public void setConcreColleague2(ConcreColleague2 concreColleague2) {
		this.concreColleague2 = concreColleague2;
	}

}
