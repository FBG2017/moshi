package com.wk.card.moshi.a_create5.d_prototype.jianli;

public class WorkExpire  implements Cloneable{
   private String workdate;
   private String company;
   
   
   public WorkExpire(String workdate, String company) {
	super();
	this.workdate = workdate;
	this.company = company;
}


public String getWorkdate() {
	return workdate;
}


public void setWorkdate(String workdate) {
	this.workdate = workdate;
}


public String getCompany() {
	return company;
}


public void setCompany(String company) {
	this.company = company;
}


@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}


@Override
public String toString() {
	return "WorkExpire [workdate=" + workdate + ", company=" + company + "]";
}


}
