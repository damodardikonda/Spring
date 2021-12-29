package com.training.app2;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BeanFactory factory = new ClassPathXmlApplicationContext("getsetxml.xml");
		GetSetMeth gsm = (GetSetMeth) factory.getBean("gs");
		gsm.setName("Peter");
		System.out.println(gsm.getName());
		System.out.println(gsm.sayHello());
	}

}
