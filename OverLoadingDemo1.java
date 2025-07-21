package sample;
class AreaCalculator{
	public void area(double r) {
		 double area=3.14f*r*r;
		System.out.println("Area of circle: "+area);
	}
	public void area(double l,double b) {
		double area=l*b;
		System.out.println("Area of Rectangle: "+area);
	}
	public void area(float b,float h) {
		 double area=0.5f*b*h;
		System.out.println("Area of Triangle: "+area);
	}
	public void area(int side) {
		int area=side*side;
		System.out.println("Area of square: "+area);
	}
}
public class OverLoadingDemo1 {
	public static void main(String[] args) {
		AreaCalculator calculator=new AreaCalculator();
		calculator.area(2.1);
		calculator.area(1.5,0.5);
		calculator.area(3.4f,2.5f);
		calculator.area(5);
	}

}
