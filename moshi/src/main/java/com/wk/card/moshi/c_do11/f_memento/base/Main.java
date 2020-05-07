package com.wk.card.moshi.c_do11.f_memento.base;

public class Main {

	public static void main(String[] args) {
		  Originator originator = new  Originator();
		     originator.setState("ON");
		     originator.show();
		  Caretaker caretaker = new  Caretaker();
		  	   Memento memento = originator.createMemento();
		  	   caretaker.setMemento(memento);
		  	   
		  	   originator.setState("OFF");
		  	   originator.show();
		  	   
		  	   originator.setMemeto(caretaker.getMemento());
		  	   originator.show();
	}
}
