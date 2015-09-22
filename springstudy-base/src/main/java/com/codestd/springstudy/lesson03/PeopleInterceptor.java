package com.codestd.springstudy.lesson03;

import java.lang.reflect.Field;
import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PeopleInterceptor {

	@Pointcut("execution(* com.codestd.springstudy.lesson03.People.sleep(String))")
	public void callSleep(){}
	
	@Before(value="callSleep()")  
    public void beforeSleep(JoinPoint joinPoint){
		Object obj = joinPoint.getTarget();
		try {
			Field field = obj.getClass().getDeclaredField("name");
			field.setAccessible(true);
			String name = (String)field.get(obj);
			System.out.println(name+"要睡觉了。"+(new Date()));
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
	
	@After(value = "callSleep()")
	public void afterSleep(){
		System.out.println("after sleep");
	}
}
