package com.ems.persistence;

import java.util.ArrayList;

import com.ems.business.Employee;
import com.ems.exceptions.EmployeeNotFoundException;

public interface EmployeeRepository {

	void save(String ename);

	ArrayList<Employee> show();

	Employee fetch(int eid) throws EmployeeNotFoundException;

	String delete(int eid) throws EmployeeNotFoundException;

	Employee update(int eid, Employee newData) throws EmployeeNotFoundException;
}
