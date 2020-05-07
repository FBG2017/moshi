package com.wk.card.moshi.b_struct7.d_decorator.base;

public class ConcreDecoratorA extends Decorator{
 
	private String stateAdd;//区别于方法B
	
	
	@Override
	public void operation() {
		super.operation();
		stateAdd="装扮A";
		System.out.println("装扮A的操作");
	}
	
	
}
