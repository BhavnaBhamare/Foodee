package com.pojo;

// Generated Mar 26, 2018 8:42:39 PM by Hibernate Tools 3.4.0.CR1

/**
 * Nvegmenu generated by hbm2java
 */
public class Nvegmenu implements java.io.Serializable {

	private Integer nvegid;
	private Nvegeggmaincourse nvegeggmaincourse;
	private Nvegbiryanees nvegbiryanees;
	private Addhotel addhotel;
	private Nvegmuttonmaincourse nvegmuttonmaincourse;
	private Nvegstarter nvegstarter;
	private Nvegchickenmaincourse nvegchickenmaincourse;

	public Nvegmenu() {
	}

	public Nvegmenu(Nvegeggmaincourse nvegeggmaincourse, Nvegbiryanees nvegbiryanees, Addhotel addhotel,
			Nvegmuttonmaincourse nvegmuttonmaincourse, Nvegstarter nvegstarter,
			Nvegchickenmaincourse nvegchickenmaincourse) {
		this.nvegeggmaincourse = nvegeggmaincourse;
		this.nvegbiryanees = nvegbiryanees;
		this.addhotel = addhotel;
		this.nvegmuttonmaincourse = nvegmuttonmaincourse;
		this.nvegstarter = nvegstarter;
		this.nvegchickenmaincourse = nvegchickenmaincourse;
	}

	public Integer getNvegid() {
		return this.nvegid;
	}

	public void setNvegid(Integer nvegid) {
		this.nvegid = nvegid;
	}

	public Nvegeggmaincourse getNvegeggmaincourse() {
		return this.nvegeggmaincourse;
	}

	public void setNvegeggmaincourse(Nvegeggmaincourse nvegeggmaincourse) {
		this.nvegeggmaincourse = nvegeggmaincourse;
	}

	public Nvegbiryanees getNvegbiryanees() {
		return this.nvegbiryanees;
	}

	public void setNvegbiryanees(Nvegbiryanees nvegbiryanees) {
		this.nvegbiryanees = nvegbiryanees;
	}

	public Addhotel getAddhotel() {
		return this.addhotel;
	}

	public void setAddhotel(Addhotel addhotel) {
		this.addhotel = addhotel;
	}

	public Nvegmuttonmaincourse getNvegmuttonmaincourse() {
		return this.nvegmuttonmaincourse;
	}

	public void setNvegmuttonmaincourse(Nvegmuttonmaincourse nvegmuttonmaincourse) {
		this.nvegmuttonmaincourse = nvegmuttonmaincourse;
	}

	public Nvegstarter getNvegstarter() {
		return this.nvegstarter;
	}

	public void setNvegstarter(Nvegstarter nvegstarter) {
		this.nvegstarter = nvegstarter;
	}

	public Nvegchickenmaincourse getNvegchickenmaincourse() {
		return this.nvegchickenmaincourse;
	}

	public void setNvegchickenmaincourse(Nvegchickenmaincourse nvegchickenmaincourse) {
		this.nvegchickenmaincourse = nvegchickenmaincourse;
	}

}
