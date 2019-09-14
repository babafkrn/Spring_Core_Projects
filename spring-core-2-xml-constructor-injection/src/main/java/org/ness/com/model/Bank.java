package org.ness.com.model;

public class Bank {

	/**
	 * @param name
	 */
	public Bank(String name) {
		super();
		this.name = name;
	}

	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		
		return "[" + "name=" + name + "]";
	}
}
