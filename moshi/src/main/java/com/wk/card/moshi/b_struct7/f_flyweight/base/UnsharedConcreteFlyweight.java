package com.wk.card.moshi.b_struct7.f_flyweight.base;

public class UnsharedConcreteFlyweight  extends Flyweight{

	@Override
	public void operate(int exit) {
		// TODO Auto-generated method stub
		System.out.println("不共享的"+exit);
	}
	

}
