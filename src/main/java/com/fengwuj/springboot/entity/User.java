package com.fengwuj.springboot.entity;

public class User {
	private int id;
	private String name;
	private String address;
	
	public String getAddress() {
		return address;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
}
