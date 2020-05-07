package com.wk.card.moshi.b_struct7.f_flyweight.base;

public class Main {
 public static void main(String[] args) {
	int exist=22;
	FlyweightFactory f = new FlyweightFactory();
	Flyweight fx = f.getFlyweight("X");
	  fx.operate(--exist);
	  Flyweight fy = f.getFlyweight("Y");
	  fy.operate(--exist);
	  Flyweight fz = f.getFlyweight("Z");
	  fz.operate(--exist);
	  
	  UnsharedConcreteFlyweight uf = new UnsharedConcreteFlyweight();
	  uf.operate(--exist);
	
}
}
