/* 
 * Copyright ©  2015 TIAMAES.Co.Ltd. All rights reserved.
 */
package com.tiamaes.learning.spring.aop.apis;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**  
 * <p>类描述： TODO </p>
 * <p>创建人：王成委  </p>
 * <p>创建时间：2015年10月12日 上午10:27:02  </p>
 * @since 1.0.0
 */
public class AopallianceServiceInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("After execute method");
		Object result = invocation.proceed();
		System.out.println("Before execute method");
		return result;
	}

}
