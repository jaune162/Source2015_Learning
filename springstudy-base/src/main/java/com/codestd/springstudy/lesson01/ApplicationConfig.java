package com.codestd.springstudy.lesson01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(Config2.class)
public class ApplicationConfig {

	@Bean
	public SpringBean springBean(){
		return new SpringBean();
	}
}
