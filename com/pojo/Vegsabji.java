package com.pojo;

// Generated Mar 26, 2018 8:42:39 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Vegsabji generated by hbm2java
 */
public class Vegsabji implements java.io.Serializable {

	private Integer sabjimenuid;
	private String sabjimenutype;
	private Integer sabjiprize;
	private Set vegmenus = new HashSet(0);

	public Vegsabji() {
	}

	public Vegsabji(String sabjimenutype, Integer sabjiprize, Set vegmenus) {
		this.sabjimenutype = sabjimenutype;
		this.sabjiprize = sabjiprize;
		this.vegmenus = vegmenus;
	}

	public Integer getSabjimenuid() {
		return this.sabjimenuid;
	}

	public void setSabjimenuid(Integer sabjimenuid) {
		this.sabjimenuid = sabjimenuid;
	}

	public String getSabjimenutype() {
		return this.sabjimenutype;
	}

	public void setSabjimenutype(String sabjimenutype) {
		this.sabjimenutype = sabjimenutype;
	}

	public Integer getSabjiprize() {
		return this.sabjiprize;
	}

	public void setSabjiprize(Integer sabjiprize) {
		this.sabjiprize = sabjiprize;
	}

	public Set getVegmenus() {
		return this.vegmenus;
	}

	public void setVegmenus(Set vegmenus) {
		this.vegmenus = vegmenus;
	}

}
