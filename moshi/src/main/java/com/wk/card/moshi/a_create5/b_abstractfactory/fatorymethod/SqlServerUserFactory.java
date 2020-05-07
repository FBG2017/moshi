package com.wk.card.moshi.a_create5.b_abstractfactory.fatorymethod;

import com.wk.card.moshi.a_create5.b_abstractfactory.base.IDepartment;
import com.wk.card.moshi.a_create5.b_abstractfactory.base.SqlserverDepartment;

public class SqlServerUserFactory  implements IFactory{
		
	public IUser createUser() {
		return new SqlServerUser();
		
	}

	@Override
	public IDepartment createDepartment() {
		// TODO Auto-generated method stub
		return new SqlserverDepartment();
	}
}
