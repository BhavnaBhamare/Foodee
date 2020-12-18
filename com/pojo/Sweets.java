package com.pojo;

// Generated Mar 26, 2018 8:42:39 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Sweets generated by hbm2java
 */
public class Sweets implements java.io.Serializable {

	private Integer sweetid;
	private String sweetmenutype;
	private Integer sweetprize;
	private Set vegmenus = new HashSet(0);

	public Sweets() {
	}

	public Sweets(String sweetmenutype, Integer sweetprize, Set vegmenus) {
		this.sweetmenutype = sweetmenutype;
		this.sweetprize = sweetprize;
		this.vegmenus = vegmenus;
	}

	public Integer getSweetid() {
		return this.sweetid;
	}

	public void setSweetid(Integer sweetid) {
		this.sweetid = sweetid;
	}

	public String getSweetmenutype() {
		return this.sweetmenutype;
	}

	public void setSweetmenutype(String sweetmenutype) {
		this.sweetmenutype = sweetmenutype;
	}

	public Integer getSweetprize() {
		return this.sweetprize;
	}

	public void setSweetprize(Integer sweetprize) {
		this.sweetprize = sweetprize;
	}

	public Set getVegmenus() {
		return this.vegmenus;
	}

	public void setVegmenus(Set vegmenus) {
		this.vegmenus = vegmenus;
	}

}