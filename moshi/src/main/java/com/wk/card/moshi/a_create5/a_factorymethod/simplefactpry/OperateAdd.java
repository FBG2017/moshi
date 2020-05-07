package com.wk.card.moshi.a_create5.a_factorymethod.simplefactpry;

public class OperateAdd  extends Operate{

	@Override
	public double getResult() {
		double result=0;
		 result=getNumberA()+getNumberB();
		return result; 
	}
}
