package com.wk.card.moshi.c_do11.a_chain.base;

public abstract class Handler {

	protected Handler sucessHandler;
	
	public void setSucessHandler(Handler sucessHandler) {
		this.sucessHandler = sucessHandler;
	}
	
	public abstract void handleRequest(int request);
}
