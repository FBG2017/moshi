package com.wk.card.moshi.c_do11.g_observer.base;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	 List<Observer> obs=new ArrayList<Observer>();
	 
	 public void attach(Observer o) {
		 obs.add(o);
	 }
	 public void detach(Observer o) {
		 obs.remove(o);
	 }
	 
	 public void noti() {
		for (Observer o : obs) {
			o.update();
		}
	}
}
