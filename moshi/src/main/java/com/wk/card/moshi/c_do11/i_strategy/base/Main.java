package com.wk.card.moshi.c_do11.i_strategy.base;

public class Main {

	public static void main(String[] args) {
		Context context;
		context=new Context(new StrategyA());
		context.contextInterface();
		context=new Context(new StrategyB());
		context.contextInterface();
		context=new Context(new StrategyC());
		context.contextInterface();
		context=new Context(new StrategyD());
		context.contextInterface();
	}
}
