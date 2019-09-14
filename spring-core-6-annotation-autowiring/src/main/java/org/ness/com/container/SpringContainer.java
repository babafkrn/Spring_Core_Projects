/**
 * 
 */
package org.ness.com.container;

import org.ness.com.service.InstrumentsList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author localadmin
 *
 */
public class SpringContainer {

	public static void main(String... args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
		InstrumentsList instrumentsList = (InstrumentsList) applicationContext.getBean("inst");
		instrumentsList.playGuiterUsingSetterInjection();
		instrumentsList.playViolinUsingConstructorInjection();
	}
}
