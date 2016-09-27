package people;

public class Person {

	private String name;
	private int age;
	private Address address;
	
	/**
	 * Default constructor
	 */
	public Person() {
		this(null, 0, null);
	}

	/**
	 * Loaded constructor
	 * @param name
	 * @param age
	 * @param address
	 */
	public Person(String name, int age, Address address) {
		
		this.name = name;
		this.age = age;
		this.address = address;
	}

	/**
	 * Method to return a Persons name
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method to set a Persons name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Method to return a Persons age
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Method to set a Persons age
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Method to return an Address
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * Method to set an Address
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	
	/**
	 * Method to compare 2 Person objects
	 * @param person
	 * @return
	 */
	public boolean equals(Person person) {
		
		if (person.address.equals(address) && person.age == age) {
			
			return true;
		} else {
			return false;
		}
	}

	/**
	 * The toString method belongs to the Object class
	 * we can override this method and return a value of our own.
	 * Note the use of the '@Override' annotation this allows the complier
	 * know exactly what you are trying to achieve, and ensures that you are correctly
	 * overriding the method.
	 */
	@Override
	public String toString() {
		return "Name: " + name + ", Age: " + age + ", " + address.toString();
	}
}
