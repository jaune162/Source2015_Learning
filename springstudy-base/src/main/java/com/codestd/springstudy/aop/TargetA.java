package com.codestd.springstudy.aop;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class TargetA {

	@Resource
	private Human human;
	
	public void exec() throws Exception{
		human.sleep();
	}
}
