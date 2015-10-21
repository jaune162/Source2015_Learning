/* 
 * Copyright ©  2015 TIAMAES Inc. All rights reserved.
 */
package com.tiamaes.learning.ejb.stateless;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.Test;

/**  
 * TODO
 * @author 王成委
 * @since 1.0
 */
public class OperationImplTest {

    /**
     * Test method for {@link com.tiamaes.learning.ejb.stateless.OperationImpl#add(int, int)}.
     * @throws NamingException 
     */
    @Test
    public void testAdd() throws NamingException {
	Properties props = new Properties();
	props.setProperty("java.naming.factory.initial","org.jboss.naming.remote.client.InitialContextFactory");
	props.setProperty("java.naming.provider.url", "http-remoting://localhost:8080");
	//props.setProperty("java.naming.factory.url.pkgs","org.jboss.naming:org.jnp.interfaces");
	props.put(Context.SECURITY_PRINCIPAL, "tiamaes");
	  // password
	props.put(Context.SECURITY_CREDENTIALS, "tiamaes");
	InitialContext ctx = new InitialContext(props);
	Operation hello = (Operation) ctx.lookup("learning-ejb/OperationImpl!com.tiamaes.learning.ejb.stateless.Operation");
	System.out.println(hello);
	System.out.println(hello.add(1,1));
    }

}
