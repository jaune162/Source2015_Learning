package com.codestd.springstudy.resource;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.UrlResource;

public class ClassPathResourceStudy {

	@Test
	public void test() throws Throwable{
		ClassPathResource rs= new ClassPathResource("spel/setup.properties");
		System.out.println(rs.exists());			//判断文件是否存在
		System.out.println(rs.getFilename());		//获取文件名
		System.out.println(rs.getPath());			//获取文件的路径（相对路径）
		System.out.println(rs.getFile());			//获取文件
		System.out.println(rs.getInputStream());	//获取InputStream
	}
	
	@Test
	public void testFileSystemResource() throws Exception{
		FileSystemResource rs= new FileSystemResource("F:/temp/resource.txt");
		System.out.println(rs.exists());			//判断文件是否存在
		System.out.println(rs.getFilename());		//获取文件名
		System.out.println(rs.getPath());			//获取文件的路径（相对路径）
		System.out.println(rs.getFile());			//获取文件
		System.out.println(rs.getInputStream());	//获取InputStream
	}
	
	@Test
	public void testUrlResource() throws Exception{
		UrlResource rs = new UrlResource("http://www.springframework.org/schema/beans/spring-beans-4.1.xsd");
		System.out.println(rs.exists());			//判断文件是否存在
		System.out.println(rs.getFilename());		//获取文件名
		System.out.println(rs.getInputStream());	//获取InputStream
		
	}
}
