package sef.moduleFinal.activity;

import java.util.Arrays;

public class FirstActivity implements Introduce {

	public static void main(String args[]) throws customException {

		// Creating the array and populating it
		Employee[] emp = new Employee[4];
		emp[0] = new Employee("Irina","Semiletova" , 28, "Teacher", "Trio LTD", 3000);
		emp[1] = new Employee("John","Vindberg" , 42, "Driver", "Good Health LTD", 2000);
		emp[2] = new Employee("Mary","Jane" , 33, "Head Doctor", "Big Pharma LTD", 10000);
		emp[3] = new Employee("Jamie","Lee" , 33, "Dentist", "Straight Teeth LTD", 7000);

		System.out.println("--- Before Sorting ---");

		// Try to catch exceptions
		try {
			//Printing out employees one by one (no sorting yet)
			for(int i = 0; i<emp.length; i++) {
				emp[i].introduce();
			}

			//Sorting emp array by natural salary order
			Arrays.sort(emp);

			System.out.println("--- After Sorting ---");

			//Printing out employees one by one (after sorting)
			for(int i = 0; i<(emp.length); i++) {
				emp[i].introduce();

			}
		}

		// Message printed out if an exception occurs
		catch (Exception a) {
			System.out.println(""); // Space between lines
			System.out.println("Exception!");
		}

		finally {
			System.out.println(""); // Space between lines
			System.out.println("The end"); // This will be printed anyway, even if an exception occures
		}

	}

	@Override
	public void introduce() {
		// TODO Auto-generated method stub

	}

}