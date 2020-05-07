package com.wk.card.moshi.a_create5.a_factorymethod.simplefactpry;

public class OperateDiv  extends Operate{

	@Override
	public double getResult() {
		double result=0;
		if (getNumberB()!=0) {
			result=getNumberA()/getNumberB();
		}
		if (getNumberB()==0) {
			try {
				throw new Exception("除数不能为0");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result; 
	}
}
