package sef.moduleFinal.activity;

public class SecondActivity {

	public static void main(String args[]) throws Exception {

		SecondActivity calc = new SecondActivity();
		System.out.println(calc.sum(4,2));
		System.out.println(calc.subtract(4,2));
		System.out.println(calc.multiply(4,2));
		System.out.println(calc.divide(4,2));
		System.out.println(calc.divide(4,0));
	}

	//Sum method
	public double sum(double a, double b) {
		return a + b;
	}

	//Subtraction method
	public double subtract(double a, double b) {
		return a - b;
	}

	//Multiplication method
	public double multiply(double a, double b) {
		return a * b;
	}

	//Division method
	public double divide(double a, double b) {
		if (b != 0) {
			return a / b;
		}
		else {
			System.out.println("Connot divide by zero");
			return 0;
		}
	}
}