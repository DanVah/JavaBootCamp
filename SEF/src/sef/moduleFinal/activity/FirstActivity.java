package sef.moduleFinal.activity;

public class FirstActivity implements Introduce {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Irina","Semiletova" , 28, "Teacher", "Trio LTD", 3000);
		Employee emp2 = new Employee("John","Vindberg" , 42, "Surgeon", "Good Health LTD", 7000);
		Employee emp3 = new Employee("Mary","Jane" , 33, "Head Doctor", "Big Pharma LTD", 10000);
		Employee emp4 = new Employee("Jamie","Lee" , 33, "Dentist", "Straight Teeth LTD", 7000);

		//Select emp object according to salary
		
		introduceSalary();
		
		System.out.println(emp1.getSalary());
		
		emp1.introduce();

	}

	private static void introduceSalary(int salary) {
		
		
	}

	@Override
	public void introduce() {
		// TODO Auto-generated method stub

	}

}
