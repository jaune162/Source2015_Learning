package com.codestd.springstudy.lesson01;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component("a")
@DependsOn({"b"})
public class A {
	
	@PostConstruct
	public void init(){
		System.out.println("Bean A init");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("Bean A destroy");
	}
	
}
