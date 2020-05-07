package com.wk.card.moshi.a_create5.b_abstractfactory.base;

import com.wk.card.moshi.a_create5.b_abstractfactory.fatorymethod.AccessUserFactory;
import com.wk.card.moshi.a_create5.b_abstractfactory.fatorymethod.IFactory;
import com.wk.card.moshi.a_create5.b_abstractfactory.fatorymethod.SqlServerUserFactory;

public class Main {

	public static void main(String[] args) {
		 IFactory sqlserver = new SqlServerUserFactory();
		 			IDepartment createDepartment = sqlserver.createDepartment();
		 					createDepartment.insertd(new Department());
		 					createDepartment.getDepartment("");
		 IFactory access = new AccessUserFactory();
		 			IDepartment createDepartment2 = access.createDepartment();
		 				createDepartment2.insertd(new Department());
		 				createDepartment2.getDepartment("");
	}
}
