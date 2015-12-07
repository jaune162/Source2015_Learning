package com.codestd.springstudy.bean.pop;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:bean/pop/applicationContext.xml"})
public class PersonTest {

	@Autowired
	private Person person;
	
	@Test
	public void test() {
		System.out.println(this.person.getName());
		System.out.println(this.person.getAge());
		System.out.println(this.person.getAddress());
		System.out.println(this.person.getPhone());
	}

}
