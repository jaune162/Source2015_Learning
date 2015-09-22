package com.codestd.springstudy.lesson01;

import org.springframework.context.annotation.Bean;

//@Configuration
public class ApplicationConfig {

	@Bean
	public SpringBean springBean(){
		System.out.println("create SpringBean");
		return new SpringBean();
	}
}
