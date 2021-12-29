package com.spring.demo;

public class hello_world {

	private String message ;
	private String template;
	private long textsize;
	public hello_world(String template , long textsize) {
		this.template = template;
	}
	
	public String getTemplate() {
		return template;
	}

	public long getTextsize() {
		long count = 0;
		for(int i = 0 ;i < template.length() ; i++) 
			count++;	
		return count;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	} 
}
