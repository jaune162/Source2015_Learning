package com.codestd.springstudy.aop.introductions;

public class DefaultFlyable implements Flyable {

	@Override
	public void fly() {
		System.out.println("fly");
	}

}
