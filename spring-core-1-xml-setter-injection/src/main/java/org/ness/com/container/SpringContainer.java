/**
 * 
 */
package org.ness.com.container;

import org.ness.com.model.Trade;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author localadmin
 *
 */
public class SpringContainer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("---------- Before container1 ----------");
		// BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("src/main/resources/spring-config.xml"));
		ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("spring-config.xml");
		System.out.println("---------- after container1 ----------");
		
		Trade trade1 = (Trade) applicationContext1.getBean("trade1");
		System.out.println("Trade id: " + trade1.getTradeId() + " ---- " + "Trade type: " + trade1.getTradeType());
		
		// same class with different values and different bean id
		Trade trade2 = (Trade) applicationContext1.getBean("trade2");
		System.out.println("Trade id: " + trade2.getTradeId() + " ---- " + "Trade type: " + trade2.getTradeType());
		
		// using the name attribute instead id
		Trade trade3 = (Trade) applicationContext1.getBean("trade3");
		System.out.println("Trade id: " + trade3.getTradeId() + " ---- " + "Trade type: " + trade3.getTradeType());
		
		// bean configuration with singleton
		Trade trade4 = (Trade) applicationContext1.getBean("trade3");
		Trade trade5 = (Trade) applicationContext1.getBean("trade3");
		System.out.println("Both objects of single container are equal, single ton result: " + (trade4 == trade5));
		
		// bean configuration with prototype
		Trade trade8 = (Trade) applicationContext1.getBean("trade2");
		Trade trade9 = (Trade) applicationContext1.getBean("trade2");
		System.out.println("Both objects of single container are equal, proptotype result: " + (trade8 == trade9));
		
		System.out.println("---------- Before container2 ----------");
		ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("spring-config.xml");
		System.out.println("---------- after container2 ----------");
		Trade trade6 = (Trade) applicationContext2.getBean("trade3");
		Trade trade7 = (Trade) applicationContext2.getBean("trade3");
		System.out.println("Both objects of different containers are equal: " + (trade4 == trade6));
	}
}
