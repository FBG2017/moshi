package com.wk.card.moshi.b_struct7.d_decorator.base;

public class Main {

	public static void main(String[] args) {
		ConcreComponent c = new ConcreComponent();
		ConcreDecoratorA A = new ConcreDecoratorA();
		ConcreDecoratorB B = new ConcreDecoratorB();
		
		A.setComponet(c);
		B.setComponet(A);
		B.operation();
	}
}
