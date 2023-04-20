package testm.model;

/**
 * 
 * service catalog model
 */
public class Catalog {
	
	private String name;
	private String type;
	
	/**
	 * 
	 * @param name
	 * @param type
	 */
	public Catalog(String name, String type) {
		super();
		this.name = name;
		this.type = type;
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	
	
	

}
