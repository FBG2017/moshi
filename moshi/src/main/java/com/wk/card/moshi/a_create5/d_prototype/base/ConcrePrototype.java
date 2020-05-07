package com.wk.card.moshi.a_create5.d_prototype.base;

public class ConcrePrototype extends Prototype  {

	public ConcrePrototype(String id) {
		super(id);
	}

	@Override
	public Prototype clone1() {
		// TODO Auto-generated method stub
		try {
			return (Prototype) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
