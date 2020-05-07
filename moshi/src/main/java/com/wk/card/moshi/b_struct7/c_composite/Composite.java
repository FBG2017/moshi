package com.wk.card.moshi.b_struct7.c_composite;

import java.util.ArrayList;
import java.util.List;

public class Composite  extends Component{

	public Composite(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	private List<Component> children=new ArrayList<Component>();

	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		children.add(c);
	}

	@Override
	public void remove(Component c) {
		// TODO Auto-generated method stub
		children.remove(c);
	}

	@Override
	public void display(int depth) {
		// TODO Auto-generated method stub
		for (Component component : children) {
			component.display(depth+2);
		}
	}
	

}
