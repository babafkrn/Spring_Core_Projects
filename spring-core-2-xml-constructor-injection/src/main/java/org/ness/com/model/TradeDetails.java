/**
 * 
 */
package org.ness.com.model;

/**
 * @author localadmin
 *
 */
public class TradeDetails {

	private long tradeAmount;

	/**
	 * @param tradeAmount
	 */
	public TradeDetails(long tradeAmount) {
		super();
		this.tradeAmount = tradeAmount;
	}

	/**
	 * @return the tradeAmount
	 */
	public long getTradeAmount() {
		return tradeAmount;
	}

	/**
	 * @param tradeAmount the tradeAmount to set
	 */
	public void setTradeAmount(long tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	
	@Override
	public String toString() {
		
		return "[" + "tradeAmount=" + tradeAmount +"]";
	}
}
