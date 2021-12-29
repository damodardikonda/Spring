package com.employeeDetails.proj.EmployeeDetails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import com.employeeDetails.proj.EmployeeDetails.Exception.UserNotFoundException;
import com.employeeDetails.proj.EmployeeDetails.model.Employee;
import com.employeeDetails.proj.EmployeeDetails.repo.EmployeeRepo;

import java.util.*;
@Service
@Transactional
public class EmployeeService {
	@Autowired
	private final EmployeeRepo employeerepo;

	@Autowired
	public EmployeeService(EmployeeRepo employeerepo) {
		this.employeerepo = employeerepo;
	}
	
	public Employee addEmp(Employee emp) {
		
		emp.setEmpcode(UUID.randomUUID().toString());
		return employeerepo.save(emp);
	}
	
	public List<Employee> findAllEmployee(){
		return employeerepo.findAll();
	}
	
	public Employee updateEmployee(Employee employee) {
		return employeerepo.save(employee);
	}
	
	public Employee findEmployeeById(Long id) {
		return employeerepo.findEmployeeById(id);//.orElseThrow(() -> new UserNotFoundException(" User by id " + id + " was not found "));
	}
	
	public void deleteEmployee(Long id) { 
		employeerepo.deleteEmployeeById(id);
	}
	

	
}
