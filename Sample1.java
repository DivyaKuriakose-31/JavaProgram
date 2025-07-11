package mynewproject;
import java.util.Scanner;

public class Sample1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = scanner.nextInt();
		
		if(age>=18) {
		System.out.println("Eligible for driving licence");
		}
		else {
			System.out.println("Not eligible for driving licence");
		}
		scanner.close();
	}
	

}
