package com.codestd.springstudy.spel;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spel/applicationContext.xml"})
public class SystemInfoTest {

	@Resource
	private SystemInfo systemInfo;
	
	@Test
	public void testGetJavaVersion() {
		System.out.println("Java Version:"+this.systemInfo.getJavaVersion());
	}

	@Test
	public void testGetJavaHome() {
		System.out.println("Java Home:"+this.systemInfo.getJavaHome());
	}
	
	@Test
	public void testGetPeople(){
		System.out.println(this.systemInfo.getPeople().getName());
	}

}
