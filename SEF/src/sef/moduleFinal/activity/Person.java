package sef.moduleFinal.activity;

public class Person implements Introduce {

	// Person attributes
	private String firstName;
	private String secondName;
	private int age;

	//Default constructor
	public Person() {
		this.firstName="na";
		this.secondName="na";
		this.age=0;
	}

	//Parameterized constructor
	public Person(String firstName, String secondName, int age) throws customException {

		//a customException is thrown when name contains unwanted characters
		if(firstName.matches("[a-zA-Z]+") == false) {
			throw new customException("First name " + firstName + " is not accaptable");
		}
		//a customException is thrown when second name contains unwanted characters
		if(secondName.matches("[a-zA-Z]+") == false) {
			throw new customException("Second name " + secondName + " is not accaptable");
		}
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
	}

	//Introduce method implemented from the Introduce interface
	@Override
	public void introduce() {
		System.out.println("My name is " + getFirstName() + " " + getSecondName() + " and I am " + getAge() + " years old");
	}

	//firstName getter setter
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	//secondName getter setter
	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	//age getter setter
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
