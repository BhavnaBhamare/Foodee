package com.pojo;

// Generated Mar 26, 2018 8:42:39 PM by Hibernate Tools 3.4.0.CR1

/**
 * Feedback generated by hbm2java
 */
public class Feedback implements java.io.Serializable {

	private Integer fedid;
	private String name;
	private String emailid;
	private String message;

	public Feedback() {
	}

	public Feedback(String name, String emailid, String message) {
		this.name = name;
		this.emailid = emailid;
		this.message = message;
	}

	public Integer getFedid() {
		return this.fedid;
	}

	public void setFedid(Integer fedid) {
		this.fedid = fedid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailid() {
		return this.emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
