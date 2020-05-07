package com.wk.card.moshi.c_do11.g_observer.base;

public class Main {
public static void main(String[] args) {
	ConcreSubject c = new ConcreSubject();
	
	c.attach(new ConcreObserver("X", c));
	c.attach(new ConcreObserver("Y", c));
	c.attach(new ConcreObserver("Z", c));
	c.attach(new ConcreObserver("K", c));
	c.attach(new ConcreObserver("L", c));
	
	c.setSubjectState("ABC");
	
	c.noti();
}
}
