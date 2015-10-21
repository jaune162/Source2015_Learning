/* 
 * Copyright ©  2015 TIAMAES.Co.Ltd. All rights reserved.
 */
package com.tiamaes.learning.spring.aop;

/**  
 * <p>类描述： TODO </p>
 * <p>创建人：王成委  </p>
 * <p>创建时间：2015年10月12日 上午9:53:02  </p>
 * @since 1.0.0
 */
public class UserServiceImpl implements UserService {

	@Override
	public void login() {
		System.out.println("--User login!--");
	}

}
