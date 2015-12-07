package com.codestd.springstudy.aop.introductions;

import org.springframework.stereotype.Component;

@Component
public class Hen implements Animal {

	@Override
	public void sleep() {
		System.out.println("Hen sleep");

	}

	@Override
	public void shout() {
		System.out.println("Hen shout");

	}

}
