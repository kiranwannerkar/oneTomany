package com.onetomanybi.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Sim {

	@Id
	private int id;
	private String name;
	private int simno;

	@ManyToOne
	private Phone phone ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSimno() {
		return simno;
	}

	public void setSimno(int simno) {
		this.simno = simno;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}



}
