/**
 * 
 */
package org.ness.com.container;

import org.ness.com.model.Bank;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author localadmin
 *
 */
public class DisplayBeanPostProcessor implements BeanPostProcessor {

	private Bank bank;
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println("in postProcessAfterInitialization: " + beanName);
		return bean;
	}
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println("in postProcessBeforeInitialization: " + beanName);
		
		if(bean instanceof Bank) {
			bank = (Bank) bean;
			System.out.println("Account no: " + bank.getAccountNo());
		}
		
		return bean; 
	}	
}
