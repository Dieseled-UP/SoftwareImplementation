package people;

public class Address {

	private String name;
	private String street;
	private String town;
	private String county;
	
	public Address() {
		this(null, null, null, null);
	}
	
	public Address(String name, String street, String town, String county) {
		
		this.name = name;
		this.street = street;
		this.town = town;
		this.county = county;
	}
	
	public boolean equals(Address address) {
		
		if (address.name.equals(name) && address.street.equals(street) && address.town.equals(town) && address.county.equals(county)) {
			
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Address [name=" + name + ", street=" + street + ", town=" + town + ", county=" + county + "]";
	}
}
