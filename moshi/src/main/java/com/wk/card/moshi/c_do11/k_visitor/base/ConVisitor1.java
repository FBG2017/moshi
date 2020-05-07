package com.wk.card.moshi.c_do11.k_visitor.base;

public class ConVisitor1  extends Visitor{

	@Override
	public void visitConElemA(ConElemA conElemA) {
		// TODO Auto-generated method stub
		System.out.println(conElemA.getClass()+"被"+this.getClass()+"访问");
	}

	@Override
	public void visitConElemB(ConElemB conElemB) {
		// TODO Auto-generated method stub
		System.out.println(conElemB.getClass()+"被"+this.getClass()+"访问");
	}

}
