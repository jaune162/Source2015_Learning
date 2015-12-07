package com.codestd.springstudy.log;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:log/applicationContext.xml"})
public class UserServiceImplTest {
	
	@Autowired
	private UserService userService;

	@Test
	public void testLogin() throws AuthenticationException {
		User user = new User("admin","admin0");
		userService.login(user);
	}

}
