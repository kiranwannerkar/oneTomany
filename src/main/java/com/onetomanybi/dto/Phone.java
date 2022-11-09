package com.onetomanybi.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Phone {

	@Id
	private int id;
	private String model;
	private int storage;
	private String emi;

	@OneToMany
	private List<Sim> sim;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public String getEmi() {
		return emi;
	}

	public void setEmi(String emi) {
		this.emi = emi;
	}

	public List<Sim> getSim() {
		return sim;
	}

	public void setSim(List<Sim> sim) {
		this.sim = sim;
	}




}
