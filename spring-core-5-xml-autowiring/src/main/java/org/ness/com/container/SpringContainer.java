/**
 * 
 */
package org.ness.com.container;

import org.ness.com.model.Transaction;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * @author localadmin
 *
 */
public class SpringContainer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		// configuring autowiring example
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml")	;
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("src/main/resources/spring-config.xml"));
		// autowiring by constructor
		Transaction transaction = (Transaction) beanFactory.getBean("transaction");
		transaction.displayTransactionDetailsInConsole();
		
		// autowiring by name
		
		// autowiring by type
	}
}
