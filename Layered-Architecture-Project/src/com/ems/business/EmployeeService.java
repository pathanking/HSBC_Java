package com.ems.business;

import java.util.List;

import com.ems.exceptions.EmployeeNotFoundException;
import com.ems.persistence.EmployeeRepository;

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

	public Employee getEmployee(int eid) throws EmployeeNotFoundException {
		Employee emp = null;
		try {
			emp = repository.fetch(eid);
		} catch (EmployeeNotFoundException e) {
			throw e;
		}
		return emp;
	}

	public String deleteEmployee(int eid) throws EmployeeNotFoundException{
		try {
			return repository.delete(eid);
		} catch (EmployeeNotFoundException e) {
			throw e;
		}
	}
}