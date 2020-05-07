package com.wk.card.moshi.b_struct7.b_bridge.base;

public class Main {

	public static void main(String[] args) {
		
		Abstraction ab = new RefinedAbstraction();
		
		Implementor a = new  ConImplementorA();
		ab.setImplementor(a);
		ab.operate();
		
		Implementor b=new ConImplementorB();
		ab.setImplementor(b);
		ab.operate();
		
		Implementor v=new ConImplementorA();
		
	}
}
