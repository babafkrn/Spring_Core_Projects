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
public class SpringContainer2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("---------- Before container1 ----------");
		ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("spring-config.xml");
		System.out.println("---------- after container1 ----------");
		
		Trade trade2 = (Trade) applicationContext1.getBean("trade2");
		System.out.println(trade2.hashCode());
		
		Trade trade3 = (Trade) applicationContext1.getBean("trade2");
		System.out.println(trade2.hashCode());
	}
}
