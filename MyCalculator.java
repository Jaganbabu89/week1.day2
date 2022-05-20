package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		
		int a = 25;
		int b = 9;
		double c = 28.2;
		double d = 11.7;
		
		Calculator cal = new Calculator();
		
		int add = cal.add(a, b);
		System.out.println("Addition = "+add);
		
		double sub = cal.sub(c, d);
		System.out.println("Subraction = "+sub);
		
		double mul = cal.mul(c, d);
		System.out.println("Mulitplication = "+mul);
		
		int div = cal.div(a, b);
		System.out.println("Division = "+div);

	}

}
