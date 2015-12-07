package com.codestd.springstudy.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("people")
public class People implements Human{

	private String name;
	
	public String getName() {
		return name;
	}

	
	public void setName( @Value("J") String name) {
		this.name = name;
	}

	public void sleep() throws Exception{
		
		System.out.println(this.name+"睡着了");
		throw new Exception("Throw test");
	}
	
	public void sleep(String str){
		System.out.println(this.name+"睡着了");
	}
}
