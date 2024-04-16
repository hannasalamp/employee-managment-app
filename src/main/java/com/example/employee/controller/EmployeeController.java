package com.example.employee.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.entity.Employee;
import com.example.employee.services.EmployeeService;

@RestController
@RequestMapping("emp")
public class EmployeeController { 
	EmployeeService empServ;
	
	
	public EmployeeController(EmployeeService empServ) {
		super();
		this.empServ = empServ;
	}
	@PostMapping(value="create")
	public String addEmployee(@RequestBody Employee e) {
		String msg=empServ.addEmlpoyee(e);
		return msg;
		
		
	}
	@GetMapping(value="get/{empId}")
	public Employee getEmployeeInfo(@PathVariable String empId) {
		Employee e=empServ.getEmployeeInfo(empId);
		return e;
	}
	@GetMapping
	public List<Employee> getAllEmployee() {
		List<Employee> empListObjects=empServ.getAllEmployee();
		return empListObjects;
	}
	@PutMapping(value="update/{empId}")
	public String updateEmployee(@RequestBody Employee e) {
		String msg=empServ.updateEmployee(e);
		return msg;
	}

	@DeleteMapping(value="delete/{empId}")
	public String deleteEmployee(@PathVariable String empId) {
		String msg=empServ.deleteEmployee(empId);
		return msg;
	}

	

}
