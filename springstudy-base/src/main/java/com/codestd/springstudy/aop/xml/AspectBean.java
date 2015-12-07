package com.codestd.springstudy.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class AspectBean {
	
	public void doAfter(JoinPoint jp){
		System.out.println("do after");
	}
	
	public void doBefore(JoinPoint jp){
		System.out.println("do after");
	}
	
	public Object doAround(ProceedingJoinPoint  jp) throws Throwable{
		System.out.println("do Around");
		Object obj = jp.proceed();
		return obj;
	}
	
	public void doThrowing(JoinPoint jp,Exception e){
		System.out.println(e.getClass().getName()+"|->|"+e.getMessage());
	}
	
}
