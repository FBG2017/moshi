package com.wk.card.moshi.b_struct7.f_flyweight.base;

import java.util.Hashtable;

public class FlyweightFactory {
 
	private Hashtable<String,ConcreFlyweight> flys = new Hashtable();
	public FlyweightFactory() {
	 flys.put("X", new ConcreFlyweight());
	 flys.put("Y", new ConcreFlyweight());
	 flys.put("Z", new ConcreFlyweight());
	}
	
	public Flyweight getFlyweight(String key) {
		return flys.get(key);
	}
}
