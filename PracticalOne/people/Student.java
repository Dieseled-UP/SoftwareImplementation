package people;

public class Student extends Person {

	private String studentID;
	
	/**
	 * Default constructor
	 */
	public Student() {
		
		// The word 'super' is a keyword in java
		// Through the use of the super keyword we can call the Parent class
		super(null, 0,null);
		this.studentID = null;
	}
	
	/**
	 * Loaded constructor
	 * @param name
	 * @param age
	 * @param studentID
	 */
	public Student(String name, int age, String studentID) {
		
		super(name, age, null);
		this.studentID = studentID;
	}
	
	/**
	 * Method to return a Students name
	 * Note the call to the super class to return the name
	 * @return the name
	 */
	public String getName() {
		return super.getName();
	}

	/**
	 * Method to set a Students name
	 * @param name the name to set
	 */
	public void setName(String name) {
		super.setName(name);;
	}

	/**
	 * Method to return a Students age
	 * @return the age
	 */
	public int getAge() {
		return super.getAge();
	}

	/**
	 * Method to set a Students name
	 * @param age the age to set
	 */
	public void setAge(int age) {
		super.setAge(age);
	}

	/**
	 * Method to return a Students ID
	 * @return the studentNo
	 */
	public String getStudentNo() {
		return studentID;
	}

	/**
	 * Method to set a Students ID
	 * @param studentNo the studentNo to set
	 */
	public void setStudentNo(String studentID) {
		this.studentID = studentID;
	}

	@Override
	public String toString() {
		return super.toString() + ", StudentID: " + studentID;
	}
}