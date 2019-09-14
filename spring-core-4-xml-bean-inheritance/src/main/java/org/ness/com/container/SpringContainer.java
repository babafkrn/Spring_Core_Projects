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

	public static void main(String... args) {
		
		// configuring spring bean inheritance example
		System.out.println("------------- before container -------------");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
		System.out.println("------------- after container -------------");
		Trade trade9 = (Trade) applicationContext.getBean("trade9");
		System.out.println("------------- displaying spring bean inheritance example values -------------");
		System.out.println("Trade id: " + trade9.getBajajTrade().getTradeId() + " ---- " + "Trade type: " + trade9.getBajajTrade().getTradeType());	
		Trade trade10 = (Trade) applicationContext.getBean("trade10");
		System.out.println("Trade id: " + trade10.getBajajTrade().getTradeId() + " ---- " + "Trade type: " + trade10.getBajajTrade().getTradeType());
		System.out.println("Trade id: " + trade10.getIciciTrade().getTradeId() + " ---- " + "Trade type: " + trade10.getIciciTrade().getTradeType());
		System.out.println("Trade id: " + trade10.getCitiTrade().getTradeId() + " ---- " + "Trade type: " + trade10.getCitiTrade().getTradeType());
	}
}
