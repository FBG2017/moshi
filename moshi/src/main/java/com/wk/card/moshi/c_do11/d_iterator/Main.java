package com.wk.card.moshi.c_do11.d_iterator;


public class Main {
	public static void main(String[] args) {
		ConcreteAggregate a = new ConcreteAggregate();
		
		a.addItem(0, "大鸟");
		a.addItem(1, "小鸟");
		a.addItem(2, "行李");
		a.addItem(3, "老外");
		a.addItem(4, "公交内部人员");
		a.addItem(5, "小偷");
		
		Iterator concreteIterator = new ConcreteIterator(a);
		Object first = concreteIterator.first();
		
		while (!concreteIterator.isDone()) {
			System.out.println("清迈车票"+concreteIterator.currentItem());
			concreteIterator.next();
		}
	}
}
