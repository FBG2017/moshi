package com.wk.card.moshi.a_create5.b_abstractfactory.fatorymethod;

import com.wk.card.moshi.a_create5.b_abstractfactory.base.AccessDepartment;
import com.wk.card.moshi.a_create5.b_abstractfactory.base.IDepartment;

public class AccessUserFactory  implements IFactory{
	
	public IUser createUser() {
		return new AccessUser();
		
	}

	
	@Override
	public IDepartment createDepartment() {
		// TODO Auto-generated method stub
		return new AccessDepartment();
	}
}
