package com.codestd.springstudy.lesson01;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:lesson01/applicationContext.xml"})
public class SpringBeanTest{

	@Resource(name="springBean")
	private SpringBean springBean;
	
	@Test
	public void testPrint() {
		this.springBean.print();
	}
	
	/*@SuppressWarnings("resource")
	@Test
	public void testWhithoutSpringTest(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:lesson01/applicationContext.xml");
		SpringBean springBean = (SpringBean) ctx.getBean("springBean");
		springBean.print();
	}*/

}
