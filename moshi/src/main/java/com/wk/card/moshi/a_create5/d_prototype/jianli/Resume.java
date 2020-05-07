package com.wk.card.moshi.a_create5.d_prototype.jianli;

public class Resume implements Cloneable{

	private String name;
	private String sex;
	private Integer age;
	private WorkExpire workExpire;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public WorkExpire getWorkExpire() {
		return workExpire;
	}
	public void setWorkExpire(WorkExpire workExpire) {
		this.workExpire = workExpire;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		 Resume resume = new  Resume();
		 resume.name=this.name;
		 resume.sex=this.sex;
		 resume.age=this.age;
		return resume;
	}
	@Override
	public String toString() {
		return "Resume [name=" + name + ", sex=" + sex + ", age=" + age + ", workExpire=" + workExpire + "]";
	}
	
	
	
	
}
