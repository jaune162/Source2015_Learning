package com.codestd.springstudy.aop.apis;

import java.lang.reflect.Method;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.MethodMatcher;
import org.springframework.aop.Pointcut;

public class MyPointcut implements Pointcut,ClassFilter,MethodMatcher {
	
	@Override
	public ClassFilter getClassFilter() {
		return this;
	}

	@Override
	public MethodMatcher getMethodMatcher() {
		return this;
	}

	@Override
	public boolean matches(Method method, Class<?> targetClass) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isRuntime() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean matches(Method method, Class<?> targetClass, Object[] args) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean matches(Class<?> clazz) {
		if(clazz.getName().startsWith("com.codestd.springstudy.aop.xml")){
			return true;
		}
		return false;
	}

}
