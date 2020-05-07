package com.wk.card.moshi.a_create5.b_abstractfactory.fatorymethod;

public class AccessUser implements IUser {

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("AccessUser.insert()");
	}

	@Override
	public User getUser(String id) {
		// TODO Auto-generated method stub
		System.out.println("AccessUser.getUser()");
		return null;
	}

}
