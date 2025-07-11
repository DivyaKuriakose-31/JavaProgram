/*Author:Divya Kuriakose
  Date:11-07-2025
  Program in java to check whether the number is paindrome or not
 */

package mynewproject;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter the number");
    	int num = scanner.nextInt();
    	int original =num;
    	int digit,rev=0;
    	
    	while(num!=0) {
    		digit=num%10;
    		rev=rev *10+ digit;
    		num=num/10;
    		
    	}
    	if(original==rev) {
    		System.out.println("The number is palindrome");
    	}
    	else {
    		System.out.println("The number is not palindrome");
    	}
}
}
