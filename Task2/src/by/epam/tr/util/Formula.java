package by.epam.tr.util;

public class Formula{
	
	public static void calculate() {
		
		double r;
		double c;
		double s;

		r = 3;

		c = 2 * Math.PI * r;
		s = Math.PI * r * r;

		System.out.println("Circuit = " + c + ", square = " + s); 
	}
	
}