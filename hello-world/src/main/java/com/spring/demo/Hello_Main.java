package com.spring.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Hello_Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(" hello_world_Bean.xml ");
		
		//hello_world h  = (hello_world) context.getBean("hw");
		hello_world w = context.getBean("hw" , hello_world.class);		
		System.out.println(w.getMessage());
		System.out.println(w.getTemplate());
		System.out.println(w.getTextsize());
		
	}
}
