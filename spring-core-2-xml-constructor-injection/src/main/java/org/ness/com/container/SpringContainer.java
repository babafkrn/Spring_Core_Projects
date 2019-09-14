/**
 * 
 */
package org.ness.com.container;

import java.util.Arrays;

import org.ness.com.model.Trade;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
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
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
		
		// two parameterized constructor
		Trade trade1 = (Trade) applicationContext.getBean("trade1");
		System.out.println("Trade id: " + trade1.getTradeId() + " ---- " + "Trade type: " + trade1.getTradeType());
		
		// three parameterized constructor with using some attributes of constructor-arg
		Trade trade2 = (Trade) applicationContext.getBean("trade2");
		System.out.println("Trade id: " + trade2.getTradeId() + " ---- " + "Trade type: " + trade2.getTradeType() + " ---- " + "Trade mark: " + trade2.getTradeMark());
				
		// no constructor configured, empty bean, the result.i.e the values will be null
		Trade trade3 = (Trade) applicationContext.getBean("trade3");
		System.out.println("Trade id: " + trade3.getTradeId() + " ---- " + "Trade type: " + trade3.getTradeType() + " ---- " + "Trade mark: " + trade3.getTradeMark());
		
		// one bean referring some other bean, has-a relationship
		Trade trade4 = (Trade) applicationContext.getBean("trade4");
		System.out.println("Trade id: " + trade4.getTradeId() + " ---- " + "Bank name: " + trade4.getBank().getName());
		
		// inner beans example
		Trade trade5 = (Trade) applicationContext.getBean("trade5");
		System.out.println("TradeName: " + trade5.getBank().getName() + " ---- " + "Trade amount: " + trade5.getTradeDetails().getTradeAmount());
		
		// check some methods of ClassPathXmlApplicationContext
		System.out.println("------------- Testing some methods of ApplicationContext and its implementation class -------------");
		System.out.println("Is single ton: " + applicationContext.isSingleton("trade1"));
		System.out.println("Is bean available: " + applicationContext.containsBean("trade2"));
		System.out.println("------------- Display all bean present in container -------------");
		Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(beanName -> {
			System.out.println(beanName);
		});
		
		// configuring list example
		Trade trade6 = (Trade) applicationContext.getBean("trade6");
		trade6.displayTradeSystemsListInConsole();
		
		// configuring list example
		Trade trade7 = (Trade) applicationContext.getBean("trade7");
		trade7.displayTradeSystemsSetInConsole();
				
		// configuring list example
		Trade trade8 = (Trade) applicationContext.getBean("trade8");
		trade8.displayTradeSystemsMapInConsole();
		
		//  configuring spring bean inheritance example, not working 
		Trade trade9 = (Trade) applicationContext.getBean("trade9");
		System.out.println("------------- Displaying spring bean inheritance example values -------------");
		System.out.println("Trade id: " + trade9.getBajajTrade().getTradeId() + " ---- " + "Trade type: " + trade9.getBajajTrade().getTradeType());	
		Trade trade10 = (Trade) applicationContext.getBean("trade10");
		//System.out.println("Trade id: " + trade10.getBajajTrade().getTradeId() + " ---- " + "Trade type: " + trade10.getBajajTrade().getTradeType());
		System.out.println("Trade id: " + trade10.getIciciTrade().getTradeId() + " ---- " + "Trade type: " + trade10.getIciciTrade().getTradeType());
		System.out.println("Trade id: " + trade10.getCitiTrade().getTradeId() + " ---- " + "Trade type: " + trade10.getCitiTrade().getTradeType());
		
		// test with bean which is not present
		testBeansException(applicationContext);
	}
	
	/**
	 * This method is used to check the raised exception when there is no bean found.
	 * 
	 * @param applicationContext
	 */
	public static void testBeansException(ApplicationContext applicationContext) {
		
		try {
			System.out.println("---------- testing exceptions ----------");
			Trade trade1 = (Trade) applicationContext.getBean("trade20");	
		} catch (NoSuchBeanDefinitionException bEx) {
			System.out.println(bEx.toString());
		}
	}
}
