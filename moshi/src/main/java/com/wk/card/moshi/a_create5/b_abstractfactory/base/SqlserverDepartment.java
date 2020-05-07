package com.wk.card.moshi.a_create5.b_abstractfactory.base;

public class SqlserverDepartment implements IDepartment{

	@Override
	public void insertd(Department department) {
		// TODO Auto-generated method stub
		System.out.println("SqlserverDepartment.insertd()");
	}

	@Override
	public Department getDepartment(String name) {
		// TODO Auto-generated method stub
		System.out.println("SqlserverDepartment.getDepartment()");
		return null;
	}

}
