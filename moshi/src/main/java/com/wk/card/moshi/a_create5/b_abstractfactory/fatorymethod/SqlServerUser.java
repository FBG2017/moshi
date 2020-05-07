package com.wk.card.moshi.a_create5.b_abstractfactory.fatorymethod;

public class SqlServerUser implements IUser{

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("SqlServerUser.insert()");
	}

	@Override
	public User getUser(String id) {
		// TODO Auto-generated method stub
		System.out.println("SqlServerUser.getUser()");
		return null;
	}

}
