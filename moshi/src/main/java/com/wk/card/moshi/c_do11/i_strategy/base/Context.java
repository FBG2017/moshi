package com.wk.card.moshi.c_do11.i_strategy.base;

public class Context {

	Strategy strategy;
	public Context(Strategy strategy) {
		this.strategy=strategy;
	}
	public void contextInterface() {
		strategy.AlgoInterFace();
	}
}
