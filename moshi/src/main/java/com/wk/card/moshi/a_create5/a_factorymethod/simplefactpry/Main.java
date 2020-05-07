package com.wk.card.moshi.a_create5.a_factorymethod.simplefactpry;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入数字A");
		double numberA = sc.nextDouble();
		System.out.println("请输入符号+-*/");
		String ope = sc.next();
		Operate op = getOpe(ope);
					op.setNumberA(numberA);
		System.out.println("请输入数字B");
		double numberB = sc.nextDouble();
		            op.setNumberB(numberB);
		            
		System.out.println("最后的结果"+op.getResult());
		
	}
	
    private static Operate getOpe(String ope) {
    	Operate op=null;
    	switch (ope) {
		case "+":op=Operatefactory.createOperate("+");break;
		case "-":op=Operatefactory.createOperate("-");break;
		case "*":op=Operatefactory.createOperate("*");break;
		case "/":op=Operatefactory.createOperate("/");break;
		}
    	return op;
    }
}
