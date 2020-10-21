package sef.module6.activity;

public class Rectangle extends Shape { 
	
	//The size of the rectangle
	double length;
	double breadth;

	//Default constructor
	public Rectangle() {
	System.out.println("Rectangle default constructor");
	}
	//Parameterized constructor
	public Rectangle(double length, double breadth, String color) {
		super.color = color;
		this.length = length;
		this.breadth = breadth;
	}
	
	public double calculateArea() {
		return length * breadth;
	}

	public double calculatePerimeter() {
		return 2 * (length + breadth);
	}
	
}
