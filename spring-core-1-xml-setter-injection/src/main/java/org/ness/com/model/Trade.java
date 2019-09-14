/**
 * 
 */
package org.ness.com.model;

/**
 * @author localadmin
 *
 */
public class Trade {

	private int tradeId;
	private String tradeType;
	private String tradeMark;
	
	public Trade() {
		System.out.println("in constructor: " + this.hashCode());
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
	
	
	/**
	 * @return the tradeMark
	 */
	public String getTradeMark() {
		return tradeMark;
	}

	/**
	 * @param tradeMark the tradeMark to set
	 */
	public void setTradeMark(String tradeMark) {
		this.tradeMark = tradeMark;
	}

	@Override
	public String toString() {
		
		return "[" + "tradeId=" + tradeId + ", tradeType=" + tradeType + ", tradeMark=" + tradeMark + "]";
	}
}
