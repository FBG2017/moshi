package com.wk.card.moshi.c_do11.a_chain.base;

public class ConHandler3  extends Handler{

	@Override
	public void handleRequest(int request) {
		// TODO Auto-generated method stub
		if (request>=20 &&request<30) {
			System.out.println("ConHandler3.handleRequest()");
		}else  if (sucessHandler!=null) {
			sucessHandler.handleRequest(request);
		}
	}

}
