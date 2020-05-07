package com.wk.card.moshi.c_do11.c_interpreter.base;

import java.util.ArrayList;
import java.util.List;

public class Main {
 public static void main(String[] args) {
	Context context=new Context();
	List<AbstractExpression> list=new ArrayList<AbstractExpression>();
	
	list.add(new TerminalExpression());
	list.add(new NonTerminalExpression());
	list.add(new TerminalExpression());
	list.add(new TerminalExpression());
	
	for (AbstractExpression ab : list) {
		ab.interpret(context);
		
	}
}
}
