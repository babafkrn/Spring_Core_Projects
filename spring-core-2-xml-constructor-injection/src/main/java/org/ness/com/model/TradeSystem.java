/**
 * 
 */
package org.ness.com.model;

/**
 * @author localadmin
 *
 */
public abstract class TradeSystem {

	public abstract void setTradeId(int tradeId);
	public abstract void setTradeType(String tradeType);
	public abstract int getTradeId();
	public abstract String getTradeType();	
}
