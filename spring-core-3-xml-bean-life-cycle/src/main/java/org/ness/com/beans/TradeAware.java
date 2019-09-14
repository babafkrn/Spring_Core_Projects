/**
 * 
 */
package org.ness.com.beans;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author localadmin
 *
 */
public class TradeAware
		implements InitializingBean, DisposableBean, ApplicationContextAware, BeanFactoryAware, BeanNameAware {

	private int tradeId;
	private String tradeType;
	
	public TradeAware() {
		System.out.println("inside constructor: " + this.tradeId + "<------->" + this.tradeType);
	}
	
	/**
	 * @return the tradeId
	 */
	public int getTradeId() {
		return tradeId;
	}

	/**
	 * @param tradeId the tradeId to set
	 */
	public void setTradeId(int tradeId) {
		this.tradeId = tradeId;
	}

	/**
	 * @return the tradeType
	 */
	public String getTradeType() {
		return tradeType;
	}

	/**
	 * @param tradeType the tradeType to set
	 */
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	// order starting from here
	public void setBeanName(String name) {
		System.out.println("setBeanName called:");
		
		System.out.println(tradeId + "<------->" + tradeType);
		System.out.println("setBeanName:: defined in context: " + name);
	}

	// you are trying to know what is the bean in your logic or which is currently instantiated.
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		
		System.out.println("setBeanFactory called:");
		System.out.println("setBeanFactory:: trade bean single ton=" + beanFactory.isSingleton("tradeaware"));	
	}

	// to know how many beans have been initialized in spring.xml, all those i am getting here.
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		
		System.out.println("setApplicationContext called:");
		System.out.println("setApplicationContext:: Bean definition names: " + Arrays.toString(applicationContext.getBeanDefinitionNames()));
	}

	// before it is destroying, these methods will be called
	public void destroy() throws Exception {
		System.out.println("destroy method()");

	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
		tradeId = 20012;
		tradeType = "Kotak";

	}
	
	public void inInit() {
		System.out.println("inInit()");
		tradeId = 10011;
		tradeType = "Citi";
	}
	
	public void customDestroy() {
		System.out.println("customDestroy()");
	}

}
