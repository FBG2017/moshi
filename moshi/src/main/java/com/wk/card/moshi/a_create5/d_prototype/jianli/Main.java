package com.wk.card.moshi.a_create5.d_prototype.jianli;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Resume resume = new  Resume();
		resume.setName("张三");
		resume.setSex("男");
		resume.setAge(20);
		
		Resume a = (Resume) resume.clone();
				a.setWorkExpire(new WorkExpire("1993-2001","AA公司"));
		Resume b = (Resume) resume.clone();
		b.setName("王玩儿");
		b.setWorkExpire(new WorkExpire("2001-2002","BB公司"));
		Resume c = (Resume) resume.clone();
		c.setWorkExpire(new WorkExpire("2002-2010","CC公司"));
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
	}
}
