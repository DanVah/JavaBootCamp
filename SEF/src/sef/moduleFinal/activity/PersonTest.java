package sef.moduleFinal.activity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

	private Person thePerson;

	//Setup and tear down

	protected void setUp() throws Exception {
		super.setUp();
		// Initialize variables to be used here
		thePerson = new Person();
	}

	public void tearDown() throws Exception {
		super.tearDown();
	}

	//I feel like these test are a bit unnecessary, but I am not sure what else to test besides them.

	//Test for the default constructor
	public void testDefaultConstructor() {
		String name = "na";
		String surname = "na";
		int age = 0;

		assertEquals(name,thePerson.getFirstName());
		assertEquals(surname,thePerson.getSecondName());
		assertEquals(age,thePerson.getAge());
	}

	//Test for the parameterized constructor
	public void testParameterizedConstructor() throws customException {

		//I use the parameterized constructor
		thePerson = new Person("Dan", "Vahrov", 28);

		//Variables to compare with
		String name = "Dan";
		String surname = "Vahrov";
		int age = 28;

		//Testing through assert
		assertEquals(name,thePerson.getFirstName());
		assertEquals(surname,thePerson.getSecondName());
		assertEquals(age,thePerson.getAge());
	}

}
