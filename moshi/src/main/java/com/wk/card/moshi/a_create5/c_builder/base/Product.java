package com.wk.card.moshi.a_create5.c_builder.base;

import java.util.ArrayList;
import java.util.List;

public class Product {
	List<String> parts=new ArrayList<String>();
	
	public void add(String part) {
		parts.add(part);
	}
	
	public void show() {
		for (String p : parts) {
			System.out.println(p);
		}
	}
 }
