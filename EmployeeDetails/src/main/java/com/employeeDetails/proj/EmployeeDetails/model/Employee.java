package com.employeeDetails.proj.EmployeeDetails.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@Entity
public class Employee implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false , updatable = false)
	private Long id;
	private String name ;
	private String email;
	private String jobtitle;
	private String phone;
	private String imageurl;
	
	@Column(nullable = false , updatable = false)
	private String empcode;
	

	public Employee() {}
	
	public Employee(Long id , String name , String email , String jobtitle , String phone , String imageurl , String empcode) {
		
		this.id = id ;
		this.name = name;
		this.email = email;
		this.jobtitle = jobtitle;
		this.phone = phone;
		this.imageurl = imageurl;
		this.empcode = empcode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJobtitle() {
		return jobtitle;
	}

	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public String getEmpcode() {
		return empcode;
	}

	public void setEmpcode(String empcode) {
		this.empcode = empcode;
	}

	@Override
	public String toString() {
		
		return " Employee{" +" id = " + id +
				", name = "+ name +  " / " + 
				" , email = " + email + '/' +
				" ,  jobtitle = " + jobtitle + '/' +
				", phone = " + phone + '/' +
				", imageurl = " + imageurl + '/' +
				", empcode = " + empcode + '/' +
				"}; " ;
				}
	}
