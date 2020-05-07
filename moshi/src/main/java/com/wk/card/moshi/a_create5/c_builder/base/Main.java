package com.wk.card.moshi.a_create5.c_builder.base;

public class Main {
		public static void main(String[] args) {
			Director director = new Director();
			ConcreBuilderA concreBuilderA = new ConcreBuilderA();
			ConcreBuilderB concreBuilderB = new ConcreBuilderB();
			
			
			director.dire(concreBuilderA);
					Product p1 = concreBuilderA.getResult();
						p1.show();
						
			director.dire(concreBuilderB);		
			Product p2 = concreBuilderB.getResult();
			p2.show();
			
		}
}
