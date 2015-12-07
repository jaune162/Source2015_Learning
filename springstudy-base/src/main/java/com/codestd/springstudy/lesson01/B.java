package com.codestd.springstudy.lesson01;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class B {
	
	@PostConstruct
	public void init(){
		System.out.println("Bean B init");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("Bean B destroy");
	}

}
