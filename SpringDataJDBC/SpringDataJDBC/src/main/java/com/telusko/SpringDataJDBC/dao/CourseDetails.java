package com.telusko.SpringDataJDBC.dao;

public class CourseDetails {
	
	private Integer cid;
	private String cname;
	
	public CourseDetails() {
		
	}
	

	public CourseDetails(Integer cid, String cname) {
		
		this.cid = cid;
		this.cname = cname;
	}


	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}


	@Override
	public String toString() {
		return "CourseDetails [cid=" + cid + ", cname=" + cname + "]";
	}
	

}
