/**
 * 
 */
package org.ness.com.model;

/**
 * @author localadmin
 *
 */
public class BajajTrade extends TradeSystem {

	private int tradeId;
	
	private String tradeType;

	/**
	 * @param tradeId
	 * @param tradeType
	 */
	public BajajTrade(int tradeId, String tradeType) {
		super();
		this.tradeId = tradeId;
		this.tradeType = tradeType;
	}
	
	@Override
	public void setTradeId(int tradeId) {
		this.tradeId = tradeId;
	}

	@Override
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	@Override
	public int getTradeId() {
	
		return tradeId;
	}

	@Override
	public String getTradeType() {
		
		return tradeType;
	}
	
	@Override
	public String toString() {
		
		return "[" + "tradeId=" + tradeId + "tradeType" + tradeType + "]";
	}
}
