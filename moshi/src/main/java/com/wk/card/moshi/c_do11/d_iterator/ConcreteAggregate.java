package com.wk.card.moshi.c_do11.d_iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate {

	private List<Object> items=new ArrayList<Object>();
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator(this);
	}
	
	public int count() {
		return items.size();
	}

	public Object getItemOne(int index) {
		return items.get(index);
	}
	
	public void addItem(int index,String value) {
		items.add(index, value);
	}
	public List<Object> getItems() {
		return items;
	}

	public void setItems(List<Object> items) {
		this.items = items;
	}

	
}
