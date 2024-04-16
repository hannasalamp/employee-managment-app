package com.example.employee.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.employee.entity.Employee;
import com.example.employee.repositories.EmployeeRepository;


@Service
public class EmployeeServiceImplementation implements EmployeeService {
	EmployeeRepository emprepo;
	

	public EmployeeServiceImplementation(EmployeeRepository emprepo) {
		super();
		this.emprepo = emprepo;
	}

	@Override
	public String addEmlpoyee(Employee e) {
		emprepo.save(e);
		return "Employee Object is created and saved";
	}

	@Override
	public Employee getEmployeeInfo(String empId) {
		Employee e=emprepo.findById(empId).get();
		return e;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> empList=emprepo.findAll();
		return empList;
	}

	@Override
	public String updateEmployee(Employee e) {
		emprepo.save(e);
		return "Employee Object is updated";
	}

	@Override
	public String deleteEmployee(String empId) {
		emprepo.deleteById(empId);
		return "Employee object is deleted";
	}

}
