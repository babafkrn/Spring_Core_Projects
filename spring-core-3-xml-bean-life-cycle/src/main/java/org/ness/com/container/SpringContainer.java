/**
 * 
 */
package org.ness.com.container;

import org.ness.com.beans.TradeAware;
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
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
		System.out.println("------- Before --------");
		
		TradeAware trade = (TradeAware) applicationContext.getBean("tradeaware");
		System.out.println("------- After --------");
		System.out.println(trade.getTradeId() + "<---------->" + trade.getTradeType());
		applicationContext.close();
	}

}
