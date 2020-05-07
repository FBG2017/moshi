package com.wk.card.moshi.b_struct7.c_composite;

public class Leaf  extends Component{

	public Leaf(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		System.out.println("Leaf.add()");
	}

	@Override
	public void remove(Component c) {
		// TODO Auto-generated method stub
		System.out.println("Leaf.remove()");
	}

	@Override
	public void display(int depth) {
		// TODO Auto-generated method stub
		System.out.println("-"+depth+name);
	}

}
