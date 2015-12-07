package com.codestd.springstudy.resource;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class ResourceLoaderTest {
	
	public static void main(String[] args) throws Exception{
		ResourceLoader loader = new DefaultResourceLoader();
		Resource setup = loader.getResource("classpath:spel/setup.properties");
		System.out.println(setup.getFile());
		
		Resource txt = loader.getResource("file://F:/temp/resource.txt");
		System.out.println(txt.getFile());
		
		Resource xsd = loader.getResource("http://www.springframework.org/schema/beans/spring-beans-4.1.xsd");
		System.out.println(xsd.getURI());
		System.out.println(xsd.getInputStream());
		
		Resource log = loader.getResource("log4j.properties");
		System.out.println(log.getFile());
	}

}
