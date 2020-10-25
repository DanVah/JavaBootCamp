package sef.moduleFinal.activity;

public class Student extends Person implements Introduce {

	//Attributes
	private String schoolName;

	//Default constructor
	public Student(){
		super();
		this.schoolName = "na";
	}

	//Parameterized constructor
	public Student(String firstName, String secondName, int age, String schoolName) throws customException {
		super(firstName, secondName, age);
		this.schoolName = schoolName;
	}

	//Overridden method
	public void introduce() {
		super.introduce();
		System.out.println("I am studying in the " + getSchoolName() + " university");
	}

	// getter and setter for schoolName
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

}
