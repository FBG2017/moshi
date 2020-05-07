package com.wk.card.moshi.a_create5.b_abstractfactory.simple;

public class Main {
	public static void main(String[] args) {
		
		SqlserverUser sqlserverUser = new SqlserverUser();
		sqlserverUser.insert(new User());
		sqlserverUser.getUser("1");
	}
}
