/* 
 * Copyright ©  2015 TIAMAES.Co.Ltd. All rights reserved.
 */
package com.tiamaes.learning.spring.oxm;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBException;
import javax.xml.transform.stream.StreamSource;

import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.Unmarshaller;

import com.tiamaes.learning.spring.bean.XMLBean;

/**  
 * <p>TODO </p>
 * <p>创建人：王成委  </p>
 * <p>创建时间：2015年9月21日 下午5:53:17  </p>
 */
public class XMLBeanUnmarshaller {

	private Unmarshaller unmarshaller;
	
	public void setUnmarshaller(Unmarshaller unmarshaller) {
		this.unmarshaller = unmarshaller;
	}

	private String fileName = "bean/xmlbean.xml";
	
	public void loadXMLBean() throws IOException, JAXBException {
        InputStream is = null;
        try {
        	ClassPathResource cpr = new ClassPathResource(fileName);
            is = cpr.getInputStream();
            XMLBean bean = (XMLBean) this.unmarshaller.unmarshal(new StreamSource(is));
            System.out.println(bean.getName());
        } finally {
            if (is != null) {
                is.close();
            }
        }
    }
}
