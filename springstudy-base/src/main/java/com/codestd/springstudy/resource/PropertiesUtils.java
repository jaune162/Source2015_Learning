package com.codestd.springstudy.resource;

import java.util.Properties;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.io.Resource;

public class PropertiesUtils implements InitializingBean{
	
	private Properties properties;
	
	private Resource resource;

	public void setResource(Resource resource) {
		this.resource = resource;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		properties = new Properties();
		properties.load(this.resource.getInputStream());
	}
	
	public String get(String key){
		return (String) this.properties.get(key);
	}

}
