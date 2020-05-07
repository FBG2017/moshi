package com.wk.card.moshi.a_create5.d_prototype.base;

public abstract class Prototype implements Cloneable {

	private String id;
	
	public Prototype(String id) {
		this.id=id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public abstract Prototype clone1();
	
}
