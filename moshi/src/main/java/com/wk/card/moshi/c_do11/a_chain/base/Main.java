package com.wk.card.moshi.c_do11.a_chain.base;

public class Main {
	public static void main(String[] args) {
		Handler h1 = new ConHandler1();
		Handler h2 = new ConHandler1();
		Handler h3 = new ConHandler1();
		
		h1.setSucessHandler(h2);
		h2.setSucessHandler(h3);
		
		int[] requests= {2,5,14,22,18,3,27,20};
		for (int i : requests) {
			h1.handleRequest(i);
		}
	}
}
