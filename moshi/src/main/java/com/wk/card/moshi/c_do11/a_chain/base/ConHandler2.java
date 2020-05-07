package com.wk.card.moshi.c_do11.a_chain.base;

public class ConHandler2  extends Handler{

	@Override
	public void handleRequest(int request) {
		// TODO Auto-generated method stub
		if (request>=10 &&request<20) {
			System.out.println("ConHandler2.handleRequest()");
		}else  if (sucessHandler!=null) {
			sucessHandler.handleRequest(request);
		}
	}

}
