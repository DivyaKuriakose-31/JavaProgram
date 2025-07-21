package sample;
class Calculator {
	public void add(int a,int b) {
		int add= a+b;
		System.out.println("Addition of two integer numbers: "+add);
	}
	public void add(int c,int d,int e) {
		int add=c+d+e;
		System.out.println("Addition of three integer numbers: "+add);
	}
	public void add(double num1,double num2) {
		double add=num1+num2;
		System.out.println("Addition of two double values: "+add);
	}
	public void add(String a,int b) {
		String add=a+b;
		System.out.println("Addition of a string and an integer: "+add);
	}
}


public class OverLoadingDemo {
    public static void main(String[] args) {
    	Calculator calculator = new Calculator();
    	calculator.add(2,4);
    	calculator.add(5,2,1);
    	calculator.add(2.4,1.2);
    	calculator.add("Hello", 32);
    }
}
