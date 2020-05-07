package com.wk.card.moshi.a_create5.b_abstractfactory.fatorymethod;

public class Main {
	public static void main(String[] args) {
		
		IFactory sqlServerUserFactory = new SqlServerUserFactory();
		  IUser createUser = sqlServerUserFactory.createUser();
		    createUser.insert(new User());
		    createUser.getUser("1");
		    
		    IFactory accessUserFactory = new AccessUserFactory();
		    IUser createUser2 = accessUserFactory.createUser();
		    createUser2.insert(new User());
		    createUser2.getUser("1");
	}
}
