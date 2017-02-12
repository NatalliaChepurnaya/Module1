package by.rdcentre.javatr.main;

public class FormulaInspector{
	
	public static void main (String[] args){
		
		double a;
		double b;
		double c = 0;
		double p;
		double s;

		a = 10;
		b = 5;

		c = Math.sqrt(a * a + b * b);

		p = a + b + c;
		s = 0.5 * b * a;

		System.out.println("Perimetr = " + p + ", square = " + s); 
	}
	
}