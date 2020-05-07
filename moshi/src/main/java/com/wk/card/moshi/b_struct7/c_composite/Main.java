package com.wk.card.moshi.b_struct7.c_composite;

public class Main {
	public static void main(String[] args) {
		Composite root = new Composite("root");
		
		root.add(new Leaf("leafA"));
		root.add(new Leaf("leafB"));
		
Composite comp = new Composite("composite X");
		
  comp.add(new Leaf("leafXA"));
   comp.add(new Leaf("leafXB"));
		
     root.add(comp);
     
     Composite compp = new Composite("Composite XY");
     compp.add(new Leaf("leafXYA"));
     compp.add(new Leaf("leafXYB"));
     
     comp.add(compp);
     
     Leaf leafC = new Leaf("Leaf C");
     root.add(leafC);
     
     Leaf leafD = new Leaf("Leaf D");
     root.add(leafD);
     root.remove(leafD);
     
     root.display(1);
	}
}
