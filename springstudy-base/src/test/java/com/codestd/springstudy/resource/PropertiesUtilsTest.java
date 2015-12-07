package com.codestd.springstudy.resource;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:resource/applicationContext.xml"})
public class PropertiesUtilsTest {

	@Autowired
	private PropertiesUtils propertiesUtils;
	
	@Test
	public void testGet() {
		String value = this.propertiesUtils.get("system.name");
		assertEquals("spel", value);
	}

}
