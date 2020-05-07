package com.wk.card.moshi.b_struct7.g_proxy.base;

public class ProxySubject extends Subject{

	RealSubject realSubject;
	@Override
	public void request() {
		if (realSubject==null) {
			realSubject=new RealSubject();
		}
		realSubject.request();//真实
	}

}
