package com.spring.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Hello_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Resource r = new ClassPathResource("com.spring.demo.Bean_Hello.xml");
		BeanFactory factory = new XmlBeanFactory("com.spring.demo.Bean_Hello.xml");
		
	Hello_World2 a = 	(Hello_World2)factory.getBean("hw");
	
	System.out.print(a.getMessage());
	}

}
