package com.spring.demo;

public class Employee {
	
	private String name ;
	private int empid=0 ;
	private double sal ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	public String toString() {
		return " Employee name = " + name + " " + "emp id = " + empid + " sal = " + sal   ;
	}

}
