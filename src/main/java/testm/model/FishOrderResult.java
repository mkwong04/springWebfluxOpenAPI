package testm.model;

import jakarta.validation.constraints.NotBlank;

public class FishOrderResult extends FishOrder{

	@NotBlank
	private String orderStatus;
	
	public FishOrderResult(FishOrder order, String status) {
		super(order.getId(), order.getQuantity(), order.getAccountNo());
		this.orderStatus=status;
	}

	/**
	 * @return the orderStatus
	 */
	public String getOrderStatus() {
		return orderStatus;
	}

	/**
	 * @param orderStatus the orderStatus to set
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
}
