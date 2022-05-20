package week1.day2;

public class Calculator {
	
	public int add(int x, int y) {
		int sum = x + y;
		return sum;
	}
	
	public double sub(double x, double y) {
		double result = x - y;
		return result;
	}
	
	public double mul(double x, double y) {
		double result = x * y;
		return result;
	}
	
	public int div(int x, int y) {
		int result = x / y;
		return result;
	}

	public static void main(String[] args) {
		
		int a = 38;
		int b = 14;
		double c = 45.8;
		double d = 23.4;
		
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
