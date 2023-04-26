package testm.model;

public class Fish{
	
	private String id;
	private String name;
	private int available;
	private double unitPrice;
	
	/**
	 * 
	 * @param id
	 * @param name
	 * @param available
	 * @param unitPrice
	 */
	public Fish(String id, String name, int available, double unitPrice) {
		super();
		this.id = id;
		this.name = name;
		this.available = available;
		this.unitPrice = unitPrice;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the available
	 */
	public int getAvailable() {
		return available;
	}

	/**
	 * @param available the available to set
	 */
	public void setAvailable(int available) {
		this.available = available;
	}

	/**
	 * @return the unitPrice
	 */
	public double getUnitPrice() {
		return unitPrice;
	}

	/**
	 * @param unitPrice the unitPrice to set
	 */
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
}