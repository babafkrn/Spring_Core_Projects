/**
 * 
 */
package org.ness.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author localadmin
 *
 */
@Service
public class InstrumentsList {

	private Guitar guitar;
	private Violin violin;
	
	/**
	 * @param violin
	 */
	// constructor injection
	@Autowired
	public InstrumentsList(Violin violin) {
		super();
		this.violin = violin;
	}

	/**
	 * @return the guitar
	 */
	public Guitar getGuitar() {
		return guitar;
	}

	/**
	 * @param guitar the guitar to set
	 */
	// setter injection
	@Autowired
	@Qualifier("g2")
	public void setGuitar(Guitar guitar) {
		this.guitar = guitar;
	}
	
	public void playGuiterUsingSetterInjection() {
		guitar.play();
	}
	
	public void playViolinUsingConstructorInjection() {
		violin.play();
	}
}
