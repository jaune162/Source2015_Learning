/* 
 * Copyright ©  2015 TIAMAES.Co.Ltd. All rights reserved.
 */
package com.tiamaes.learning.spring.oxm;

import java.io.IOException;

import javax.annotation.Resource;
import javax.xml.bind.JAXBException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**  
 * <p>TODO </p>
 * <p>创建人：王成委  </p>
 * <p>创建时间：2015年9月21日 下午5:58:01  </p>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class XMLBeanUnmarshallerTest {

	@Resource
	private XMLBeanUnmarshaller unmarshaller;
	
	@Test
	public void test() throws IOException, JAXBException {
		this.unmarshaller.loadXMLBean();
	}

}
