package com.codestd.springstudy.log;

import com.codestd.springstudy.log.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public void login(User user) throws AuthenticationException {
		if("admin".equals(user.getUsername()) && "admin".equals(user.getPassword())){
			System.out.println("登录成功");
		}else{
			throw new AuthenticationException("用户名密码错误!");
		}
	}

}
