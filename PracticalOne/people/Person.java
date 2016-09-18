package people;

public class Person {

	private String name;
	private int age;
	private Address address;
	
	public Person() {
		this(null, 0, null);
	}

	public Person(String name, int age, Address address) {
		
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age;
	}
}
