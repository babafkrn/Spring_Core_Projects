/**
 * 
 */
package org.ness.com.model;

/**
 * @author localadmin
 *
 */
public class Transaction {

	private PrivateBank privateBank1;
	private PrivateBank privateBank2;
	private GovernmentBank governmentBank;
	
	/**
	 * @param privateBank
	 * @param governmentBank
	 */
	/**
	public Transaction(PrivateBank privateBank1, PrivateBank privateBank2, GovernmentBank governmentBank) {
		super();
		this.privateBank1 = privateBank1;
		this.privateBank2 = privateBank2;
		this.governmentBank = governmentBank;
	}
	*/
	
	public void displayTransactionDetailsInConsole() {
		
		System.out.println(privateBank1.getTransactionType() + "  " + privateBank1.getAccountName() + "  " + privateBank1.getAccountNo());
		System.out.println(privateBank2.getTransactionType() + "  " + privateBank2.getAccountName() + "  " + privateBank2.getAccountNo());
		System.out.println(governmentBank.getTransactionType() + "  " + governmentBank.getAccountName() + "  " + governmentBank.getAccountNo());
	}

	/**
	 * @return the privateBank1
	 */
	public PrivateBank getPrivateBank1() {
		return privateBank1;
	}

	/**
	 * @param privateBank1 the privateBank1 to set
	 */
	public void setPrivateBank1(PrivateBank privateBank1) {
		this.privateBank1 = privateBank1;
	}

	/**
	 * @return the privateBank2
	 */
	public PrivateBank getPrivateBank2() {
		return privateBank2;
	}

	/**
	 * @param privateBank2 the privateBank2 to set
	 */
	public void setPrivateBank2(PrivateBank privateBank2) {
		this.privateBank2 = privateBank2;
	}

	/**
	 * @return the governmentBank
	 */
	public GovernmentBank getGovernmentBank() {
		return governmentBank;
	}

	/**
	 * @param governmentBank the governmentBank to set
	 */
	public void setGovernmentBank(GovernmentBank governmentBank) {
		this.governmentBank = governmentBank;
	}
}
