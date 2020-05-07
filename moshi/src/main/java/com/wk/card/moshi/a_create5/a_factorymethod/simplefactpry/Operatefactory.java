package com.wk.card.moshi.a_create5.a_factorymethod.simplefactpry;

public class Operatefactory {

	public static Operate createOperate(String operate) {
		Operate oper = null ;
		switch (operate) {
		case "+": oper=new OperateAdd();break;
		case "-":oper=new OperateSub();break;
		case "*":oper=new OperateMul();break;
		case "/":oper=new OperateDiv();break;
		}
		return oper;
	}
}
