package com.wk.card.moshi.b_struct7.d_decorator.base;

public class ConcreDecoratorB extends Decorator{
 
	
	
	@Override
	public void operation() {
		super.operation();
		addbehavi();
		System.out.println("装扮B的操作");
	}
	
	private void addbehavi() {//区别为装扮A
		System.out.println("装扮B添加行为");
	}
	
}
