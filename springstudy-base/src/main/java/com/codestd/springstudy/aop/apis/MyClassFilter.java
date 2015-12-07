package com.codestd.springstudy.aop.apis;

import org.springframework.aop.ClassFilter;

public class MyClassFilter implements ClassFilter {

	@Override
	public boolean matches(Class<?> clazz) {
		System.out.println("________________");
		if(clazz.getName().startsWith("com.codestd.springstudy.aop.xml")){
			return true;
		}
		
		return false;
	}

}
