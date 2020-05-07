package com.wk.card.moshi.b_struct7.e_facade.base;

public class Facade {

	SubSystemOne one;
	SubSystemTwo two;
	SubSystemThree three;
	SubSystemFour four;
	public Facade() {
		one = new SubSystemOne();
		two = new SubSystemTwo();
		three = new SubSystemThree();
		four = new SubSystemFour();
	}
	
	public void methodA() {
		one.methodOne();
		three.methodThree();
	}
	
	public void methodB() {
		two.methodTwo();
		four.methodFour();
	}
}
