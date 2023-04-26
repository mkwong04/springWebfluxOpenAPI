package testm.model;

/**
 * 
 * service catalog model
 */
public class Catalog {
	
	private String name;
	private String type;
	private String url;
	
	/**
	 * 
	 * @param name
	 * @param type
	 * @param url
	 */
	public Catalog(String name, String type, String url) {
		super();
		this.name = name;
		this.type = type;
		this.url = url;
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
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
}
