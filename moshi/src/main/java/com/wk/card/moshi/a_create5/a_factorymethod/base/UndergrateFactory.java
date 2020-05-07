package com.wk.card.moshi.a_create5.a_factorymethod.base;

public class UndergrateFactory implements ILeiFengFactory{

	@Override
	public LeiFeng createLeiFeng() {
		// TODO Auto-generated method stub
		return new Undergrate();
	}

}
