package com.wk.card.moshi.c_do11.g_observer.base;

public class ConcreObserver extends Observer {
	private String observerState;
	private String name;
	private ConcreSubject concresubject;

	@Override
	public void update() {
		// TODO Auto-generated method stub
		 observerState = concresubject.getSubjectState();
		System.out.println("观察的的新状态，"+name+observerState);
	}
	
	
	



	public ConcreObserver(String name, ConcreSubject concresubject) {
		this.name = name;
		this.concresubject = concresubject;
	}






	public void setConcresubject(ConcreSubject concresubject) {
		this.concresubject = concresubject;
	}
	
	public ConcreSubject getConcresubject() {
		return concresubject;
	}
}
