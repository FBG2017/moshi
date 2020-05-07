package com.wk.card.moshi.c_do11.h_state.base;

public class Context {
	private State state;

	public Context(State state) {
		this.state = state;
	}
	

		public State getState() {
			return state;
		}
		public void setState(State state) {
			System.out.println("当前状态"+state.getClass());
			this.state = state;
		}
		
		public void request() {
			state.handle(this);
		}
}
