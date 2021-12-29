package com.training.app2;

public class GetSetMeth {

	private String name ;
	
	public void setName(String name) {
		this.name = name ;
	}
	
	public String getName() {
		return name ;
	}
	
	public String sayHello() {
		
		return "Hello " + name ;
	}
}
