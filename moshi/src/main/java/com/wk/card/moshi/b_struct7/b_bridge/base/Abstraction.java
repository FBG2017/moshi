package com.wk.card.moshi.b_struct7.b_bridge.base;

public class Abstraction {

	public Implementor implementor;
	
	public void setImplementor(Implementor implementor) {
		this.implementor = implementor;
	}
	
	public void operate() {
		implementor.operation();
	}
}
