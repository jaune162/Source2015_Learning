package com.codestd.springstudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

public class LoggingTest {
	private Log logger = LogFactory.getLog(getClass());
	
	@Test
	public void test(){
		logger.info("T");
	}
}
