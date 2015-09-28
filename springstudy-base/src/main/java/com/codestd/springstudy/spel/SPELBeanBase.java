/* 
 * Copyright ©  2015 TIAMAES.Co.Ltd. All rights reserved.
 */
package com.codestd.springstudy.spel;

import java.util.List;

import com.codestd.springstudy.lesson03.People;

/**  
 * <p>类描述： TODO </p>
 * <p>创建人：王成委  </p>
 * <p>创建时间：2015年9月23日 下午12:34:00  </p>
 * @since 1.0.0
 */
public class SPELBeanBase {

	private String name;
	private int age;
	private double money;
	private boolean is;
	private List<String> names;
	
	private People people;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public boolean isIs() {
		return is;
	}
	public void setIs(boolean is) {
		this.is = is;
	}
	public People getPeople() {
		return people;
	}
	public void setPeople(People people) {
		this.people = people;
	}
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	
}
