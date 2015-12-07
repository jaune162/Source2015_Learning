package com.codestd.springstudy.aop.introductions;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:aop/applicationContext.xml"})
public class AnimalTest {

	@Resource(name="cock")
	private Flyable flyable;
	
	@Test
	public void test() {
		this.flyable.fly();
	}

}
