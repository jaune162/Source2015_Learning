/* 
 * Copyright ©  2015 TIAMAES.Co.Ltd. All rights reserved.
 */
package com.tiamaes.learning.spring.beancreate;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**  
 * <p>TODO </p>
 * <p>创建人：王成委  </p>
 * <p>创建时间：2015年9月21日 下午3:42:43  </p>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class PeopleTest {

	@Resource
	private People people;
	
	@Test
	public void testRun() {
		this.people.run();
	}

}
