package com.employeeDetails.proj.EmployeeDetails;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeeDetails.proj.EmployeeDetails.model.Employee;
import com.employeeDetails.proj.EmployeeDetails.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeResource {

	private final EmployeeService employeeservice;
	
	public EmployeeResource(EmployeeService employeeservice) {
		this.employeeservice = employeeservice;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		List<Employee> employees = employeeservice.findAllEmployee();
		return new ResponseEntity<>(employees , HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id){
		Employee emp = employeeservice.findEmployeeById(id);
		return new ResponseEntity<>(emp , HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
		Employee newEmployee = employeeservice.addEmp(employee);
		return new ResponseEntity<>(newEmployee , HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmp(@RequestBody Employee employee){
		Employee updatedEmp =  employeeservice.updateEmployee(employee);
		return new ResponseEntity<>(updatedEmp , HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Employee> deleteEmp(@PathVariable("id") Long id){
		employeeservice.deleteEmployee(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
