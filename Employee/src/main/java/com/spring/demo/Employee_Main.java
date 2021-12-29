package com.spring.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employee_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ApplicationContext context = new ClassPathXmlApplicationContext("Employee_Bean.xml");
		Employee e = (Employee) context.getBean("emp");
		System.out.println(e.toString());
		
		Employee e2 = (Employee) context.getBean("emp2");
		System.out.println(e2.toString());
		
		Employee e3 = (Employee) context.getBean("emp1");
		System.out.print(e3.toString());
		
		
	}

}
