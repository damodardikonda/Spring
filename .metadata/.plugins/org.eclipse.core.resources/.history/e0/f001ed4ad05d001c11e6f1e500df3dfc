package com.miniproject.module.AttendanceManagementSystem.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.module.AttendanceManagementSystem.Entity.Department;
import com.miniproject.module.AttendanceManagementSystem.Entity.Employee;

//import Repository_Cls.DepartmentRepo;
import Services_Cls.DepartmentService;
import Services_Cls.ManagerServices;

@RestController
@RequestMapping("Manager")
public class ManagerController {

	private ManagerServices managerservices;

	private DepartmentService deptservice ;
	public ManagerController(ManagerServices managerservices , DepartmentService deptservice) {
		this.managerservices = managerservices;
		this.deptservice = deptservice;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAllEmployee(){
		List<Employee> emp = managerservices.findAllEmployee();
		return new ResponseEntity<>(emp , HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id){
		Employee emp = managerservices.findEmployeeById(id);
		return new ResponseEntity<>(emp , HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
		Employee newEmp = managerservices.addEmp(employee);
		return new ResponseEntity<>(newEmp , HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Employee> delEmp(@PathVariable("id") Long id){
		managerservices.deleteEmployee(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping("/alldept")
	public ResponseEntity<List<Department>> allDepartment(){
		List<Department> dept = deptservice.finAllDept();
		return new ResponseEntity<>(dept , HttpStatus.OK);
		}
	/*
	@GetMapping("/alldept/{id}")
	public ResponseEntity<List<Employee>> allDepartment(@PathVariable("id") Long id){
		List<Employee> dept = Employee.finAllDept(id);
		return new ResponseEntity<>(dept , HttpStatus.OK);
		}
	*/ 
}
