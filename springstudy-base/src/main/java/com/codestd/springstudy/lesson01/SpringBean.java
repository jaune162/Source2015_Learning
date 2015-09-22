package com.codestd.springstudy.lesson01;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

//@Component
//@Repository
@Service
public class SpringBean {
	private Log logger = LogFactory.getLog(getClass());
	
	public void print(){
		logger.info("This Object ID is "+Integer.toHexString(this.hashCode()));
	}
}
