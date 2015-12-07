package com.codestd.springstudy.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PeopleInterceptor {

	@Pointcut("execution(* com..*.sleep(..))")
	//@Pointcut("args(java.lang.String)")
	//@Pointcut("bean(*le)")
	public void callSleep(){}
	
	/*@Pointcut("target(com.codestd.springstudy.aop.Human)")
	public void callSleep1(){}
	
	@Pointcut("this(com.codestd.springstudy.aop.TargetA)")
	public void callSleep2(){}*/
	
	@Before("execution(* com..*.sleep(..))")
    public void beforeSleep(JoinPoint joinPoint){
		System.out.println("before sleep");
		System.out.println(joinPoint.getArgs());
		System.out.println(joinPoint.getSignature().getDeclaringType());
    }
	
	@Around(value = "callSleep()")
	public Object afterSleep(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("before sleep1");
		Object retVal = joinPoint.proceed();
		return retVal;
	}
	
	@AfterReturning(value = "execution(* com..*.getName(..))", returning="name" )
	public void retAdvice(String name){
		System.out.println(name);
	}
	
	@AfterThrowing(value = "execution(* com..*.sleep(..))", throwing="ex" )
	public void throwAdvice(Exception ex){
		System.out.println(ex.getMessage());
	}
}
