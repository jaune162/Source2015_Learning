package com.codestd.springstudy.bean.create;

import org.springframework.beans.factory.FactoryBean;

public class PeopleFactoryBean implements FactoryBean<People> {

private String name;

public void setName(String name) {
	this.name = name;
}

@Override
public People getObject() throws Exception {
	People p = new People();
	p.setName(name);
	return p;
}

	@Override
	public Class<?> getObjectType() {
		return People.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
