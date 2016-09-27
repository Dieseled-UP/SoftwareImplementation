package people;

public class Address {

	private String name;
	private String street;
	private String town;
	private String county;
	
	/**
	 * Default constructor
	 */
	public Address() {
		this(null, null, null, null);
	}
	
	/**
	 * Loaded constructor
	 * @param name
	 * @param street
	 * @param town
	 * @param county
	 */
	public Address(String name, String street, String town, String county) {
		
		this.name = name;
		this.street = street;
		this.town = town;
		this.county = county;
	}
	
	/**
	 * Method to compare 2 Address objects
	 * @param address
	 * @return boolean true or false
	 */
	public boolean equals(Address address) {
		
		if (address.name.equals(name) && address.street.equals(street) && address.town.equals(town) && address.county.equals(county)) {
			
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Address: [name/number=" + name + ", street=" + street + ", town=" + town + ", county=" + county + "]";
	}
}
