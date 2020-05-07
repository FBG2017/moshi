package com.wk.card.moshi.c_do11.k_visitor.base;

import java.util.ArrayList;
import java.util.List;

public class ObjectStruct {

	private List<Element>elements=new ArrayList<Element>();
	
	public void attach(Element e) {
		elements.add(e);
	}
	
	public void detach(Element e) {
		elements.remove(e);
	}
	
	public void  accept(Visitor visitor) {
		for (Element el : elements) {
			el.accept(visitor);
			
		}
	}
}
