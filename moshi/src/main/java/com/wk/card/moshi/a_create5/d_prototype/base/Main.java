package com.wk.card.moshi.a_create5.d_prototype.base;

public class Main {

	public static void main(String[] args) {
		ConcrePrototype c = new ConcrePrototype("5");
		ConcrePrototype b = (ConcrePrototype) c.clone1();
		System.out.println(b.getId());
	}
}
