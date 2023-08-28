package com.ems.business;

import java.time.LocalDate;

public class Employee {
	private int eid;
	private String name;
	private LocalDate joining;
	private static int count;

	public Employee() {
		count++;
	}

	public Employee(String name) {
		count++;
		this.eid = count;
		this.name = name;
		this.joining = LocalDate.now();
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
		return "Employee [eid=" + eid + ", name=" + name + ", joining=" + joining + "]";
	}
}