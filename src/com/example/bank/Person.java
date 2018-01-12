package com.example.bank;

public class Person {

	private String name;
	private String nid;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNid() {
		return nid;
	}

	public void setNid(String nid) {
		this.nid = nid;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", nid=" + nid + "]";
	}
}
