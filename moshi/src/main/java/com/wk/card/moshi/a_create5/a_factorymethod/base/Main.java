package com.wk.card.moshi.a_create5.a_factorymethod.base;

public class Main {

	public static void main(String[] args) {
		ILeiFengFactory factory = new  UndergrateFactory();//
//		new VolunteerFactory()
		LeiFeng leifeng = factory.createLeiFeng();
		leifeng.sweep();
		leifeng.wash();
		leifeng.buyrice();
		
	}
}
