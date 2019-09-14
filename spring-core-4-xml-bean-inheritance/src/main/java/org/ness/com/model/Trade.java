/**
 * 
 */
package org.ness.com.model;

/**
 * @author localadmin
 *
 */
public class Trade {

	private BajajTrade bajajTrade;
	private CitiTrade citiTrade;
	private IciciTrade iciciTrade;
	
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
}
