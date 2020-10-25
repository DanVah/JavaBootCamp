package sef.moduleFinal.activity;

import junit.framework.TestCase;

public class StudentTest extends TestCase {

	private Student theStudent;

	//Setup and tear down

	protected void setUp() throws Exception {
		super.setUp();
		// Initialize variables to be used here
		theStudent = new Student();
	}

	public void tearDown() throws Exception {
		super.tearDown();
	}

	//Test for the default constructor
	public void testDefaultConstructor() {

		//I set the variables to compare with
		String name = "na";
		String surname = "na";
		int age = 0;
		String schoolName = "na";

		//Testing through assert
		assertEquals(name,theStudent.getFirstName());
		assertEquals(surname,theStudent.getSecondName());
		assertEquals(age,theStudent.getAge());
		assertEquals(schoolName,theStudent.getSchoolName());
	}

	//Test for the parameterized constructor
	public void testParameterizedConstructor() throws customException {

		//I create use the parameterized constructor
		theStudent = new Student("Dan", "Vahrov", 28, "HIM");

		//Variables to compare with
		String name = "Dan";
		String surname = "Vahrov";
		int age = 28;
		String schoolName = "HIM";

		//Testing through assert
		assertEquals(name,theStudent.getFirstName());
		assertEquals(surname,theStudent.getSecondName());
		assertEquals(age,theStudent.getAge());
		assertEquals(schoolName,theStudent.getSchoolName());
	}


}
