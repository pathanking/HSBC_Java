package com.ems.persistence;

import java.util.ArrayList;

import com.ems.business.Employee;
import com.ems.exceptions.EmployeeNotFoundException;

public class DbImplementation implements EmployeeRepository {

	@Override
	public void save(String ename) {

	}

	@Override
	public ArrayList<Employee> show() {
		return null;
	}

	@Override
	public Employee fetch(int eid) {
		return null;
	}

	@Override
	public String delete(int eid) {
		return null;
	}

	@Override
	public Employee update(int eid, Employee newData) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
}