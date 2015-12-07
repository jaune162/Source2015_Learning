package com.codestd.springstudy.aop.apis;

import java.lang.reflect.Method;

import org.springframework.aop.MethodMatcher;

public class MyMethodMatcher implements MethodMatcher {

	@Override
	public boolean matches(Method method, Class<?> targetClass) {
		return true;
	}

	@Override
	public boolean isRuntime() {
		return true;
	}

	@Override
	public boolean matches(Method method, Class<?> targetClass, Object[] args) {
		return true;
	}

}
