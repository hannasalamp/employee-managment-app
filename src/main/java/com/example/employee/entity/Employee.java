package com.example.employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	String empId;
	String name;
	float salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String empId, String name, float salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	

}
