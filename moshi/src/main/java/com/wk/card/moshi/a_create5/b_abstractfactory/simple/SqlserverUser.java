package com.wk.card.moshi.a_create5.b_abstractfactory.simple;

public class SqlserverUser {
		
	public void insert(User u) {
		System.out.println("插入一条数据");
	}
	
	public User getUser(String uid) {
		System.out.println("获取一条数据");
		return null;
	}
}
