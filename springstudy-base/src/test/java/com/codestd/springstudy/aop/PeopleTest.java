package com.codestd.springstudy.aop;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:aop/applicationContext.xml"})
public class PeopleTest {

	@Resource(name = "people")
	private Human people;
	
	@Resource
	private TargetA a;
	
	@Before
	public void setUp(){
		people.setName("Jaune");
	}
	
	@Test
	public void testSleep() throws Exception {
		System.out.println("---------------------------------");
		people.sleep();
		people.getName();
		System.out.println("---------------------------------");
		//a.exec();
	}

}
