package sef.module8.activity;
//Needs to be completed
//1 - extend this class from Exception class
public class CustomExceptionActivity extends Exception{

	public String toString() {
		return "My custom Exception";
	}

	public String getMessage() {
		String mes = "You are not allowed to use this program";
		return mes;
		//2 - Override getMessage() and provide the following message 
		// "You are not allowed to use this program"
	}
}