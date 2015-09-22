/* 
 * Copyright ©  2015 TIAMAES.Co.Ltd. All rights reserved.
 */
package com.tiamaes.learning.spring.oxm.jaxb;

import java.io.InputStream;

import javax.xml.transform.stream.StreamSource;

import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.Unmarshaller;

import com.tiamaes.learning.spring.bean.People;

/**  
 * <p>类描述： TODO </p>
 * <p>创建人：王成委  </p>
 * <p>创建时间：2015年9月22日 下午2:04:23  </p>
 * @since 1.0.0
 */
public class JAXBUnmarshaller {

	private Unmarshaller unmarshaller;
	
	private String fileName = "bean/people.xml";
	
	public void setUnmarshaller(Unmarshaller unmarshaller) {
		this.unmarshaller = unmarshaller;
	}

	public void unmarshal() throws Exception{
		InputStream is = null;
        try {
        	ClassPathResource cpr = new ClassPathResource(fileName);
            is = cpr.getInputStream();
            People bean = (People) this.unmarshaller.unmarshal(new StreamSource(is));
            System.out.println(bean.getName());
            System.out.println(bean.getAddress());
        } finally {
            if (is != null) {
                is.close();
            }
        }
	}
}
