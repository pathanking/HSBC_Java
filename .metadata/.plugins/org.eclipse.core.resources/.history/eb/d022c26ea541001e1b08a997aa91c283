package com.ems.dao;

import java.util.ArrayList;

import com.ems.business.Employee;

public class InMemoryEmployeeRepository implements EmployeeRepository {

	static ArrayList<Employee> employees = new ArrayList<>();

	@Override
	public void save(String ename) {
		Employee employee = new Employee(ename);
		employees.add(employee);
	}

	@Override
	public ArrayList<Employee> show() {
		return employees;
	}

	@Override
	public Employee fetch(int eid) {
		return employees.stream().filter(e -> e.getEid() == eid).findAny().get();
	}

	@Override
	public String delete(int eid) {
		Employee emp = employees.stream().filter(e -> e.getEid() == eid).findAny().get();
		employees.remove(emp);
		return "Employee Deleted Successfully";
	}
}