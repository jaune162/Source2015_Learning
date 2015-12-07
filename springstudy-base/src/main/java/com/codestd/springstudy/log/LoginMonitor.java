package com.codestd.springstudy.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoginMonitor {

	@Pointcut("execution(* com.codestd.springstudy.log.UserService.login(..))")
	public void loginPointcut(){};
	
	@Around("loginPointcut()")
	public Object afterLogin(ProceedingJoinPoint point) throws Throwable{
		User user = (User) point.getArgs()[0];
		System.out.println(user.getUsername()+"请求登录系统");
		Object obj ;
		try {
			obj = point.proceed();
		} catch (Throwable e) {
			System.out.println(user.getUsername()+"登录失败！"+e.getMessage());
			throw e;
		}
		System.out.println(user.getUsername()+"已登录系统");
		return obj;
	}
	
}
