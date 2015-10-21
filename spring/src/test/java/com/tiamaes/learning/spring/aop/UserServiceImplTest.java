/* 
 * Copyright ©  2015 TIAMAES.Co.Ltd. All rights reserved.
 */
package com.tiamaes.learning.spring.aop;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**  
 * <p>类描述： TODO </p>
 * <p>创建人：王成委  </p>
 * <p>创建时间：2015年10月12日 上午10:13:30  </p>
 * @since 1.0.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:aop/applicationContext.xml"})
public class UserServiceImplTest {

	@Autowired
	private UserService userService;
	/**
	 * Test method for {@link com.tiamaes.learning.spring.aop.UserServiceImpl#login()}.
	 */
	@Test
	public void testLogin() {
		this.userService.login();
	}

}
