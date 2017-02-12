package by.epam.tr.util;

public class Formula{
	
	public static void calculate() {
		
		int v;
		int c;
		int v1;

		v = 1204;
		c = 1;

		v1 = v;

		while  (v1 >= 10) {
			c = c * (v1 % 10);
			v1 = v1 / 10;
		}

		System.out.println("Digit composition of " + v + " is " + c); 
	}
	
}