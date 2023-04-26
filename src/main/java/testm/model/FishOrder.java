package testm.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;


public class FishOrder {
	@NotBlank
	private String id;
	@NotBlank
	@Min(value = 0)
	private int quantity;
	@NotBlank
	private String accountNo;
	
	/**
	 * 
	 * @param id
	 * @param quantity
	 * @param accountNo 
	 */
	public FishOrder(String id, int quantity, String accountNo) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.accountNo = accountNo;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the accountNo
	 */
	public String getAccountNo() {
		return accountNo;
	}

	/**
	 * @param accountNo the accountNo to set
	 */
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
}
