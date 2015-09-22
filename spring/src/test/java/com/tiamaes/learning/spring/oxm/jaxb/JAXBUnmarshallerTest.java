/* 
 * Copyright ©  2015 TIAMAES.Co.Ltd. All rights reserved.
 */
package com.tiamaes.learning.spring.oxm.jaxb;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**  
 * <p>类描述： TODO </p>
 * <p>创建人：王成委  </p>
 * <p>创建时间：2015年9月22日 下午2:11:46  </p>
 * @since 1.0.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class JAXBUnmarshallerTest {

	@Resource
	private JAXBUnmarshaller unmarshaller;
	/**
	 * Test method for {@link com.tiamaes.learning.spring.oxm.jaxb.JAXBUnmarshaller#unmarshal()}.
	 * @throws Exception 
	 */
	@Test
	public void testUnmarshal() throws Exception {
		this.unmarshaller.unmarshal();
	}

}
