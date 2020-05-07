package com.wk.card.moshi.c_do11.a_chain.base;

public class ConHandler1  extends Handler{

	@Override
	public void handleRequest(int request) {
		// TODO Auto-generated method stub
		if (request>=0 &&request<10) {
			System.out.println("ConHandler1.handleRequest()");
		}else  if (sucessHandler!=null) {
			sucessHandler.handleRequest(request);
		}
	}

}
