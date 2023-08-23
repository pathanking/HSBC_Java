package com.ems.business;

import java.util.List;

import com.ems.dao.EmployeeRepository;

public class EmployeeService {

	EmployeeRepository repository;

	public EmployeeService(EmployeeRepository repository) {
		this.repository = repository;
	}

	public String addEmployee(String ename) {
		if (!ename.isBlank()) {
			repository.save(ename);
			return "Employee Saved";
		} else
			return "Invalid Name";
	}

	public List<Employee> showEmployees() {
		return repository.show();
	}

	public Employee getEmployee(int eid) {
		return repository.fetch(eid);
	}

	public String deleteEmployee(int eid) {
		return repository.delete(eid);
	}
}