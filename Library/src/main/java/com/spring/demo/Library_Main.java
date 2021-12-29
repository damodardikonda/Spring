package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Library_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Library_Bean.xml");
		Library ll = (Library)context.getBean("l1");
		System.out.println(ll.getLibrarian_name());
		System.out.println(ll.getC());
		System.out.print(ll.getLoc());

	}

}
