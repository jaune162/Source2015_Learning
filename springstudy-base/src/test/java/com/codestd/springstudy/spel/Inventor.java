package com.codestd.springstudy.spel;

import java.util.Date;

public class Inventor {
	private String name;
	private Date birthday; 
	private String nationality;
	
	
	public Inventor() {
		super();
	}

	public Inventor(String name, String nationality) {
		super();
		this.name = name;
		this.nationality = nationality;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	
}
