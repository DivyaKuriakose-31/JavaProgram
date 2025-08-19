package trial;

import java.util.Scanner;

public class ArrayDemo {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the value of N: ");
	   int n=sc.nextInt();
	   int [] array=new int[n];
	   System.out.println("Enter the elements                                                                                                                : ");
	   for(int i=0;i<n;i++) {
		   array[i]=sc.nextInt();
	   }
	   //print the array
	   System.out.println("Array elements are: ");
	   for(int num:array) {
		   System.out.println(num+"\t");
	   }
	   System.out.println("");
	   //LARGEST ELEMENT
	   int largest=array[0];
	   for(int i=0;i<n;i++) {
		   if(array[i]>largest) {
			  largest=array[i];
		   }
	   }
	   System.out.println("The largest element in the array: "+largest);
   }
}
