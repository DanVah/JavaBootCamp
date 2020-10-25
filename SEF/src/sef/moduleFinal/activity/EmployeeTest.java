package sef.moduleFinal.activity;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {

	private Employee theEmployee;

	//Setup and tear down

	protected void setUp() throws Exception {
		super.setUp();
		// Initialize variables to be used here
		theEmployee = new Employee();
	}

	public void tearDown() throws Exception {
		super.tearDown();
	}

	//Again, it feels like these test are a bit unnecessary, but I am not sure what else to test besides them.

	//Test for the default constructor
	public void testDefaultConstructor() {

		//I set the variables to compare with
		String name = "na";
		String surname = "na";
		int age = 0;
		String position = "na";
		String companyName = "na";
		int wage = 0;

		//Testing through assert
		assertEquals(name,theEmployee.getFirstName());
		assertEquals(surname,theEmployee.getSecondName());
		assertEquals(age,theEmployee.getAge());
		assertEquals(companyName,theEmployee.getCompany());
		assertEquals(position,theEmployee.getJobTitel());
		assertEquals(wage,theEmployee.getSalary());

	}

	//Test for the parameterized constructor
	public void testParameterizedConstructor() throws customException {

		//I create use the parameterized constructor
		theEmployee = new Employee("Dan", "Vahrov", 28,"Trainee" , "Accenture", 1000);

		//Variables to compare with
		String name = "Dan";
		String surname = "Vahrov";
		int age = 28;
		String position = "Trainee";
		String companyName = "Accenture";
		int wage = 1000;

		//Testing through assert
		assertEquals(name,theEmployee.getFirstName());
		assertEquals(surname,theEmployee.getSecondName());
		assertEquals(age,theEmployee.getAge());
		assertEquals(position,theEmployee.getJobTitel());
		assertEquals(companyName,theEmployee.getCompany());
		assertEquals(wage,theEmployee.getSalary());
	}


}
