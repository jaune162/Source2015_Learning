/* 
 * Copyright ©  2015 TIAMAES.Co.Ltd. All rights reserved.
 */
package com.tiamaes.learning.spring.aop.apis;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**  
 * <p>类描述： TODO </p>
 * <p>创建人：王成委  </p>
 * <p>创建时间：2015年10月12日 上午9:54:10  </p>
 * @since 1.0.0
 */
public class ServiceInterceptor implements MethodInterceptor {

	@Override
	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy methodProxy) throws Throwable {
		System.out.println(obj.getClass());
		return null;
	}

}
