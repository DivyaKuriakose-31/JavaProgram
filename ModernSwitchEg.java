/*Author:Divya Kuriakose
  Date:11-07-2025
  Program in java with switch statement
 */


package mynewproject;
import java.util.Scanner;

public class ModernSwitchEg {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter your grade");
    	String grade = scanner.nextLine();
    	
    	
    	switch(grade) {
    	case "O" :System.out.println("Outstanding Performance");
    	           break;
    	case "A+":System.out.println("Excellent Performance");
    	          break;
    	case "A" :System.out.println("Very good Performance");
    	          break;
    	case "B+":System.out.println("Good Performance");
    	          break;
    	case "B" :System.out.println("Above average Performance");
    	          break;
    	case "C" :System.out.println("Good Performance");
                  break;
    	case "P" :System.out.println("Pass");
                  break;
    	case "F" :System.out.println("Fail");
                  break;
    	default  :System.out.println("Invalid choice");
    	}
    	scanner.close();
    	
    	
     }
}
