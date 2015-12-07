package com.codestd.springstudy.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.codestd.springstudy.aop.People;

@Component
public class SystemInfo {

	
	private String javaVersion;
	
	@Value("#{systemEnvironment['JAVA_HOME']}")
	private String javaHome;
	
	@Value("#{people}")
	private People people;
	
	public SystemInfo() {
		super();
	}

	public SystemInfo(@Value("#{ systemProperties['java.version'] }") String javaVersion, String javaHome) {
		super();
		this.javaVersion = javaVersion;
		this.javaHome = javaHome;
	}

	public String getJavaVersion() {
		return javaVersion;
	}
	
	public void setJavaVersion(String javaVersion) {
		this.javaVersion = javaVersion;
	}
	public String getJavaHome() {
		return javaHome;
	}
	public void setJavaHome(String javaHome) {
		this.javaHome = javaHome;
	}

	public People getPeople() {
		return people;
	}

	public void setPeople(People people) {
		this.people = people;
	}
	
	
}
