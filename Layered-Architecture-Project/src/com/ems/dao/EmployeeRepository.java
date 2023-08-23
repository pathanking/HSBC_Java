package com.ems.dao;

import java.util.ArrayList;

import com.ems.business.Employee;

public interface EmployeeRepository {

	void save(String ename);

	ArrayList<Employee> show();

	Employee fetch(int eid);

	String delete(int eid);
}