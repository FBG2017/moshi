package com.wk.card.moshi.b_struct7.d_decorator.base;

public class Decorator  extends Component{

	private Component componet;
	public void setComponet(Component componet) {
		this.componet = componet;
	}
	
	@Override
	public void operation() {
		if (componet!=null) {
			componet.operation();
		}
	}
    
}
