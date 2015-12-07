package com.codestd.springstudy.lesson01;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:lesson01/applicationContext.xml"})
public class ApplicationConfigTest {

	@Resource(name="a")
	private A a;
	
	@Test
	public void test() {
		System.out.println(a);
	}

}
