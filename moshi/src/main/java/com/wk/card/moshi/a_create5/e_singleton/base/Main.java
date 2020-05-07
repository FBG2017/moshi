package com.wk.card.moshi.a_create5.e_singleton.base;

public class Main {

	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();

		System.out.println(instance==instance2);
	
	}
}
