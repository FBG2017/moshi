package com.wk.card.moshi.c_do11.f_memento.base;

public class Originator {
	private String state;
	
	public Memento createMemento() {
	
		return new Memento(state);
	}
	
   public void setMemeto(Memento memento) {
	   state=memento.getState();
   }
	
	
   public void show() {
	System.out.println("状态"+state);
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}
   
}
