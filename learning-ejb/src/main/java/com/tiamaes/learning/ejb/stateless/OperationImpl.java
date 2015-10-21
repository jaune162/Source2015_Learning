/* 
 * Copyright ©  2015 TIAMAES Inc. All rights reserved.
 */
package com.tiamaes.learning.ejb.stateless;

import javax.ejb.Remote;
import javax.ejb.Stateless;

/**  
 * 计算器实现
 * @author 王成委
 * @since 1.0
 */
@Stateless
@Remote(Operation.class)
public class OperationImpl implements Operation {

    @Override
    public int add(int i, int j) {
	return i+j;
    }

}
