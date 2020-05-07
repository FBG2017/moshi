package com.wk.card.moshi.a_create5.c_builder.base;

public class ConcreBuilderA extends Builder{

	private Product product=new Product();
	
	@Override
	public void builderpartA() {
		// TODO Auto-generated method stub
		product.add("组件A");
	}

	@Override
	public void builderpartB() {
		// TODO Auto-generated method stub
		product.add("组件B");
	}

	@Override
	public Product getResult() {
		// TODO Auto-generated method stub
		return product;
	}

}
