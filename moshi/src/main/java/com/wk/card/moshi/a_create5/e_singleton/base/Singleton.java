package com.wk.card.moshi.a_create5.e_singleton.base;

public class Singleton {

	private static Singleton singleton;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if (singleton==null) {
			System.out.println("新建");
			singleton=new Singleton();
		}
		return singleton;
	}
}
