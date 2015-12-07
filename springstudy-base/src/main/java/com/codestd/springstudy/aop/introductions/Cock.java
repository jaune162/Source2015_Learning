package com.codestd.springstudy.aop.introductions;

import org.springframework.stereotype.Component;

@Component
public class Cock implements Animal {

	@Override
	public void sleep() {
		System.out.println("Cock sleep");

	}

	@Override
	public void shout() {
		System.out.println("Cock shout");

	}

}
