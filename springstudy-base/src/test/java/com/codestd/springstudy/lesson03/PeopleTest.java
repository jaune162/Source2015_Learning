package com.codestd.springstudy.lesson03;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:lesson03/applicationContext.xml"})
public class PeopleTest {

	@Resource
	private People people;
	
	@Before
	public void setUp(){
		people.setName("Jaune");
	}
	
	@Test
	public void testSleep() {
		System.out.println("---------------------------------");
		people.sleep();
		System.out.println("---------------------------------");
		people.sleep("");
	}

}
