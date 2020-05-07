package com.wk.card.moshi.a_create5.b_abstractfactory.fatorymethod;

import com.wk.card.moshi.a_create5.b_abstractfactory.base.IDepartment;

public interface IFactory {
	IUser createUser();
	
	//提供给base
	IDepartment createDepartment();
}
