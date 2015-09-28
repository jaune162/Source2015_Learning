/* 
 * Copyright ©  2015 TIAMAES.Co.Ltd. All rights reserved.
 */
package com.codestd.springstudy.spel;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**  
 * <p>类描述： TODO </p>
 * <p>创建人：王成委  </p>
 * <p>创建时间：2015年9月23日 下午12:37:16  </p>
 * @since 1.0.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spel/applicationContext.xml"})
public class SPELBeanBaseTest {

	@Resource
	private SPELBeanBase spelBeanBase;
	
	@Test
	public void test() {
		System.out.println("name:"+this.spelBeanBase.getName());
		System.out.println("age:"+this.spelBeanBase.getAge());
		System.out.println("money:"+this.spelBeanBase.getMoney());
		System.out.println("is:"+this.spelBeanBase.isIs());
		System.out.println("people"+this.spelBeanBase.getPeople());
		System.out.println("names"+this.spelBeanBase.getNames());
	}

}
