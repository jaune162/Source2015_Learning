/* 
 * Copyright ©  2015 TIAMAES Inc. All rights reserved.
 */
package com.tiamaes.learning.ejb.stateless;

/**
 * EJB接口
 * @author 王成委
 * @since 1.0
 */
public interface Operation {

    /**
     * 加法计算
     * @param i Int类型的数值
     * @param j Int类型的数值
     * @return
     */
    public int add(int i,int j);
}
