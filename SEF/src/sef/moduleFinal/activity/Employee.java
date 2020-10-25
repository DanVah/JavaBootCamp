package sef.moduleFinal.activity;

public class Employee extends Person implements Introduce, Comparable<Employee> {

	//Attributes
	private String jobTitel;
	private String company;
	private int salary;

	//Default constructor
	public Employee(){
		this.jobTitel = "na";
		this.company = "na";
		this.salary = 0;
	}

	//Parameterized constructor
	public Employee(String firstName, String secondName, int age, String jobTitel, String company, int salary) throws customException {
		super(firstName, secondName, age);
		this.jobTitel = jobTitel;
		this.company = company;
		this.salary = salary;
	}

	//Overridden method with a super method from Person
	public void introduce() {
		super.introduce();
		System.out.println("I work as a " + getJobTitel() + " in " + getCompany());
	}

	// getter and setter for jobTitle
	public String getJobTitel() {
		return jobTitel;
	}

	public void setJobTitel(String jobTitel) {
		this.jobTitel = jobTitel;
	}

	// getter and setter for company
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	// getter and setter for salary
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	//Overridden comperTo method, which will sort by salary, top to bottom
	@Override
	public int compareTo(Employee o) {
		return o.salary - this.salary;
	}

}
