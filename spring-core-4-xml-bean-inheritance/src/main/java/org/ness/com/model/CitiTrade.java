/**
 * 
 */
package org.ness.com.model;

/**
 * @author localadmin
 *
 */
public class CitiTrade {

	private int tradeId;
	private String tradeType;
	
	public CitiTrade() {
		
		System.out.println("Inside CitiTrade Constrcutor");
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
}
