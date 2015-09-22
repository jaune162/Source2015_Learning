package com.codestd.springstudy.lesson02;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:lesson02/applicationContext.xml"})
public class MainBeanTest {

	@Resource
	private MainBean mainBean;
	
	@Test
	public void testPrint() {
		this.mainBean.print();
	}

}
