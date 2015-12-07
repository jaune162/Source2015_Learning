package com.codestd.springstudy.aop.xml.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.codestd.springstudy.aop.introductions.Flyable;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:aop/applicationContext.xml"})
public class UserServiceImplTest {

	@Autowired
	private UserService userService;
	
	/*@Autowired
	private Flyable flyable;*/
	
	@Test
	public void test() throws Exception {
		this.userService.login();
		//this.userService.logout();
		
		//this.flyable.fly();
	}

}
