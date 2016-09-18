package people;

public class Student extends Person {

	private String studentID = "";
	
	public Student() {
		
		super(null, 0);
		this.studentID = null;
	}
	
	public Student(String name, int age, String studentID) {
		
		super(name, age);
		this.studentID = studentID;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return super.getName();
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		super.setName(name);;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return super.getAge();
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		super.setAge(age);
	}

	/**
	 * @return the studentNo
	 */
	public String getStudentNo() {
		return studentID;
	}

	/**
	 * @param studentNo the studentNo to set
	 */
	public void setStudentNo(String studentID) {
		this.studentID = studentID;
	}

	@Override
	public String toString() {
		return super.toString() + ", studentID=" + studentID;
	}
}