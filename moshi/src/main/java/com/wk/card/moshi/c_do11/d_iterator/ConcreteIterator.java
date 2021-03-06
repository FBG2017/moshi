package com.wk.card.moshi.c_do11.d_iterator;

public class ConcreteIterator extends Iterator {

	private ConcreteAggregate aggregate;
	private int current =0 ;
	
	public  ConcreteIterator(ConcreteAggregate aggregate) {
		// TODO Auto-generated constructor stub
		this.aggregate=aggregate;
	}
	
	@Override
	public Object first() {
		// TODO Auto-generated method stub
		return aggregate.getItemOne(0);
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Object ret=null;
		current++;
		if (current<aggregate.count()) {
			ret=aggregate.getItemOne(current);
		}
		return ret;
	}

	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		return current>=aggregate.count()?true:false;
	}

	@Override
	public Object currentItem() {
		// TODO Auto-generated method stub
		return aggregate.getItemOne(current);
	}

}
