package com.codestd.springstudy.lesson03;

import org.springframework.stereotype.Component;

@Component
public class People {

	private String name;
	
	public String getName() {
		System.out.println("调用了Get方法");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sleep(){
		System.out.println(this.name+"睡着了");
	}
	
	public void sleep(String str){
		System.out.println(this.name+"睡着了");
	}
}
