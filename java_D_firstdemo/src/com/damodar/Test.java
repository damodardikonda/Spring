package com.damodar;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.damodar.HelloBean;

public class Test {

	public static void main(String[] args)    {
		// TODO Auto-generated method stub
		
		BeanFactory context;
		try {
			context = new ClassPathXmlApplicationContext("HelloBeanxml.xml");
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		///XmlBeanFactory context = new XmlBeanFactory(new ClassPathResource("HelloBeanxml.xml"));
		HelloBean hellos = (HelloBean)context.getBean("hello");
		hellos.HelloMethod();
	}
}
