package com.wk.card.moshi.c_do11.k_visitor.base;

public class Main {
 public static void main(String[] args) {
	ObjectStruct o = new ObjectStruct();
	o.attach(new ConElemA());
	o.attach(new ConElemB());
	
	ConVisitor1 conVisitor1 = new ConVisitor1();
	ConVisitor2 conVisitor2 = new ConVisitor2();
	
	o.accept(conVisitor1);
	o.accept(conVisitor2);
}
}
