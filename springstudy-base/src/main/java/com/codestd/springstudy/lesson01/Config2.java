package com.codestd.springstudy.lesson01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config2 {

	@Bean
	public SpringBean2 springBean2(){
		return new SpringBean2();
	}
	
}
