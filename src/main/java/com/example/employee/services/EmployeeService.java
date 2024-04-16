package com.example.employee.services;

import java.util.List;

import com.example.employee.entity.Employee;

public interface EmployeeService {
	String addEmlpoyee(Employee e);
	Employee getEmployeeInfo(String empId);
	List<Employee> getAllEmployee();
	String updateEmployee(Employee e);
	String deleteEmployee(String empId);

	

}
