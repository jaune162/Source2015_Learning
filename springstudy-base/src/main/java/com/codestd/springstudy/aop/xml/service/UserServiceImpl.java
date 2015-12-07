package com.codestd.springstudy.aop.xml.service;

public class UserServiceImpl implements UserService {

	@Override
	public void login() {
		System.out.println("User login");

	}

	@Override
	public void logout() throws Exception {
		System.out.println("User logout");
		throw new Exception("Exception test");
	}

}
