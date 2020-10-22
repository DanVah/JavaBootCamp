package sef.module6.activity;

public class AbstractionActivity {

	public static void main(String[] args) {
		
		Shape r1 = new Rectangle (5, 6, "Black");
		System.out.println("Rectangle color is " + r1.getColor());
		System.out.println("Rectangle area is " + r1.calculateArea());
		System.out.println("Rectangle perimeter is " + r1.calculatePerimeter());

	}

}
