/**
 * 
 */
package org.ness.com.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author localadmin
 *
 */
public class Trade {

	private int tradeId;
	private String tradeType;
	private String tradeMark;
	private Bank bank;
	private TradeDetails tradeDetails; 
	private List<TradeSystem> tradeSystemsList;
	private Set<TradeSystem> tradeSystemsSet;
	private Map<String, TradeSystem> tradeSystemsMap;
	private BajajTrade bajajTrade;
	private CitiTrade citiTrade;
	private IciciTrade iciciTrade;
	
	public Trade() {
		
	}
	
	/**
	 * 
	 * @param tradeId
	 * @param tradeType
	 */
	public Trade(int tradeId, String tradeType) {
		this.tradeId = tradeId;
		this.tradeType = tradeType;
	}

	/**
	 * @param tradeId
	 * @param tradeType
	 * @param tradeMark
	 */
	public Trade(int tradeId, String tradeType, String tradeMark) {
		super();
		this.tradeId = tradeId;
		this.tradeType = tradeType;
		this.tradeMark = tradeMark;
	}
	
	/**
	 * @param tradeId
	 * @param bank
	 */
	public Trade(int tradeId, Bank bank) {
		super();
		this.tradeId = tradeId;
		this.bank = bank;
	}

	/**
	 * @param bank
	 * @param tradeDetails
	 */
	public Trade(Bank bank, TradeDetails tradeDetails) {
		super();
		this.bank = bank;
		this.tradeDetails = tradeDetails;
	}


	/**
	 * @param tradeSystemsList
	 */
	public Trade(List<TradeSystem> tradeSystemsList) {
		super();
		this.tradeSystemsList = tradeSystemsList;
	}

	/**
	 * @param tradeSystemsSet
	 */
	public Trade(Set<TradeSystem> tradeSystemsSet) {
		super();
		this.tradeSystemsSet = tradeSystemsSet;
	}

	
	/**
	 * @param tradeSystemsMap
	 */
	public Trade(Map<String, TradeSystem> tradeSystemsMap) {
		super();
		this.tradeSystemsMap = tradeSystemsMap;
	}
	
	/**
	 * 
	 * @param tradeId
	 * @param tradeType
	 * @param tradeMark
	 * @param bajajTrade
	 */
	public Trade(int tradeId, String tradeType, String tradeMark, BajajTrade bajajTrade) {
		super();
		this.tradeId = tradeId;
		this.tradeType = tradeType;
		this.tradeMark = tradeMark;
		this.bajajTrade = bajajTrade;
	}
	
	/**
	 * @param citiTrade
	 * @param iciciTrade
	 */
	public Trade(CitiTrade citiTrade, IciciTrade iciciTrade) {
		super();
		this.citiTrade = citiTrade;
		this.iciciTrade = iciciTrade;
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

	/**
	 * @return the bank
	 */
	public Bank getBank() {
		return bank;
	}

	/**
	 * @param bank the bank to set
	 */
	public void setBank(Bank bank) {
		this.bank = bank;
	}

	/**
	 * @return the tradeDetails
	 */
	public TradeDetails getTradeDetails() {
		return tradeDetails;
	}

	/**
	 * @return the bajajTrade
	 */
	public BajajTrade getBajajTrade() {
		return bajajTrade;
	}

	/**
	 * @param bajajTrade the bajajTrade to set
	 */
	public void setBajajTrade(BajajTrade bajajTrade) {
		this.bajajTrade = bajajTrade;
	}

	/**
	 * @return the citiTrade
	 */
	public CitiTrade getCitiTrade() {
		return citiTrade;
	}

	/**
	 * @param citiTrade the citiTrade to set
	 */
	public void setCitiTrade(CitiTrade citiTrade) {
		this.citiTrade = citiTrade;
	}

	/**
	 * @return the iciciTrade
	 */
	public IciciTrade getIciciTrade() {
		return iciciTrade;
	}

	/**
	 * @param iciciTrade the iciciTrade to set
	 */
	public void setIciciTrade(IciciTrade iciciTrade) {
		this.iciciTrade = iciciTrade;
	}

	/**
	 * @param tradeDetails the tradeDetails to set
	 */
	public void setTradeDetails(TradeDetails tradeDetails) {
		this.tradeDetails = tradeDetails;
	}

	/**
	 * Example for configuring list. This method is used to display the list in the console
	 */
	public void displayTradeSystemsListInConsole() {
		
		System.out.println("------------ Display trade systems list in console ------------");
		tradeSystemsList.stream().forEach(trade -> {
			System.out.println("Trade id: " + trade.getTradeId() + " ---- " + "Trade type: " + trade.getTradeType());
		});
	}
	
	/**
	 * Example for configuring set. This method is used to display the set in the console
	 */
	public void displayTradeSystemsSetInConsole() {
		
		System.out.println("------------ Display trade systems set in console ------------");
		tradeSystemsSet.stream().forEach(trade -> {
			System.out.println("Trade id: " + trade.getTradeId() + " ---- " + "Trade type: " + trade.getTradeType());
		});
		
	}	
	
	/**
	 * Example for configuring map. This method is used to display the map in the console
	 */
	public void displayTradeSystemsMapInConsole() {
			
		System.out.println("------------ Display trade systems map in console ------------");
		tradeSystemsMap.forEach((key,value) -> {

			System.out.println("Key: " + key + "---- " + "Trade id: " + value.getTradeId() + " ---- " + "Trade type: " + value.getTradeType());
		});
	}
	
	@Override
	public String toString() {
		
		return "[" + "tradeId=" + tradeId + ", tradeType=" + tradeType + ", tradeMark=" + tradeMark + "bank" + bank.getName() + "tradeDetails" +  tradeDetails.getTradeAmount() + "]";
	}
}
