package sef.module8.activity;
//Needs to be completed
//1 - Find out the error in this program and share your finding with the instructor
public class ExceptionSequenceActivity {
	
public static void main(String[] args) {
	
	new ExceptionSequenceActivity().divide(10,0);
}

void divide(int num1,int num2)
{
	try
	{
		System.out.println(num1/num2);
	}
	catch(ArithmeticException a)
	{
			System.out.println("Division by zero is not allowed");
	}	
	catch(Exception e)
	{	
		System.out.println("Exception!!!");
	}
}
}
// As far as I understand there is a exception hierarchy,
// and when the general exception comes first, the compiler understands that
// there is no way we will reach a more specific exception,
// so when the "ArithmeticException" was second, there was no way for it to be executed.