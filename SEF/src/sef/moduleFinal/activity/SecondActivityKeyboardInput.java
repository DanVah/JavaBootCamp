package sef.moduleFinal.activity;

import java.util.Scanner;

public class SecondActivityKeyboardInput {

	public static void main(String[] args) throws Exception {

		//Creating the variables
		int num1 = 0;
		int num2 = 0;
		String inputAction = "";
		String action = "";

		//The calculator is initiated
		SecondActivity calc = new SecondActivity();

		//Creating a scanner which accepts user input
		Scanner scan = new Scanner(System.in);

		//Welcome text
		System.out.println("Welcome to Number Tron 3000 \n");

		//Prompting the user for the first number
		System.out.println("Please enter your first number and press enter");

		//accepting the next number as an int, and creating the integer
		try {
			num1 = scan.nextInt();
		}
		//a catch in case the user does not enter an integer
		catch (Exception e) {
			System.out.println("Error. The input must be just an integer");
			System.out.println("App closed");
			scan.close();
			return;
		}

		//Prompting the user for desired action
		System.out.println("Please enter action to be performed +, -, *, / and press enter");
		inputAction = scan.next();

		if (inputAction.matches("\\+")) {
			action = "sum";
		}
		else if (inputAction.matches("\\-")) {
			action = "subtract";
		}
		else if (inputAction.matches("\\*")) {
			action = "multiply";
		}
		else if (inputAction.matches("\\/")) {
			action = "divide";
		}
		else {
			System.out.println("Error. The input must be one of these +, -, *, /");
			System.out.println("App closed");
			scan.close();
			return;
		}

		//Prompting the user for the first number
		System.out.println("Please enter your second number and press enter");

		//accepting the next number as an int, and creating the integer
		try {
			num2 = scan.nextInt();
		}
		//a catch in case the user does not enter an integer
		catch (Exception e) {
			System.out.println("Error. The input must be just an integer");
			System.out.println("App closed");
			scan.close();
			return;
		}

		//closing the scan
		scan.close();

		//Executing the method based on the action
		if (action == "sum") {
			System.out.println("The answer is " + calc.sum(num1,num2));
		}
		if (action == "subtract") {
			System.out.println("The answer is " + calc.subtract(num1,num2));
		}
		if (action == "multiply") {
			System.out.println("The answer is " + calc.multiply(num1,num2));
		}
		if (action == "divide") {
			System.out.println("The answer is " + calc.divide(num1,num2));
		}

	}

}
