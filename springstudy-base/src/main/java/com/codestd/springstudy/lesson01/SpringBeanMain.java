package com.codestd.springstudy.lesson01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanMain {

	public static void main(String[] args) {
		javaTest();
		System.out.println("---------------------");
		springTest();
	}
	
	public static void javaTest(){
		SpringBean springBean1 = new SpringBean();
		SpringBean springBean2 = new SpringBean();
		springBean1.print();
		springBean2.print();
	}
	
	public static void springTest(){
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("lesson01/applicationContext.xml");
		SpringBean springBean1 = (SpringBean) context.getBean("springBean");
		SpringBean springBean2 = (SpringBean) context.getBean("springBean");
		springBean1.print();
		springBean2.print();
	}

}
