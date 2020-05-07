package com.wk.card.moshi.c_do11.h_state.base;

public class ConcreStateA extends State {

	@Override
	public void handle(Context context) {
		// TODO Auto-generated method stub
		context.setState(new ConcreStateB());
	}

}
