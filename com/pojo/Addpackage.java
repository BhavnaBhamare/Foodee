package com.pojo;

// Generated Mar 26, 2018 8:42:39 PM by Hibernate Tools 3.4.0.CR1

/**
 * Addpackage generated by hbm2java
 */
public class Addpackage implements java.io.Serializable {

	private Integer packid;
	private String packagetotalday;
	private Integer packageamount;

	public Addpackage() {
	}

	public Addpackage(String packagetotalday, Integer packageamount) {
		this.packagetotalday = packagetotalday;
		this.packageamount = packageamount;
	}

	public Integer getPackid() {
		return this.packid;
	}

	public void setPackid(Integer packid) {
		this.packid = packid;
	}

	public String getPackagetotalday() {
		return this.packagetotalday;
	}

	public void setPackagetotalday(String packagetotalday) {
		this.packagetotalday = packagetotalday;
	}

	public Integer getPackageamount() {
		return this.packageamount;
	}

	public void setPackageamount(Integer packageamount) {
		this.packageamount = packageamount;
	}

}
