package com.ems.business;

public class Employee {
	private int eid;
	private String name;
	private static int count;

	public Employee() {
		count++;
	}

	public Employee(String name) {
		count++;
		this.eid = count;
		this.name = name;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + "]";
	}
}