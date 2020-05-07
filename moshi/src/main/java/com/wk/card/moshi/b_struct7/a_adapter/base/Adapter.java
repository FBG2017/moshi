package com.wk.card.moshi.b_struct7.a_adapter.base;

public class Adapter  extends Target{

	private Adaptee adaptee= new Adaptee();
	@Override
	public void request() {
		// TODO Auto-generated method stub
		adaptee.specificRequest();
	}
}
