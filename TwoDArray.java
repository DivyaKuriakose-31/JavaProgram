package trial;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the row: ");
		 int row=sc.nextInt();
		 System.out.println("Enter the column: ");
		 int col=sc.nextInt();
		 int[][]matrix=new int[row][col];
		 int[][]transpose=new int[col][row];
		 
		 System.out.println("Enter the elements: ");
		 for(int i=0;i<row;i++) {
			 for(int j=0;j<col;j++) {
				 matrix[i][j]=sc.nextInt();
			 }
		 }
		 for(int i=0;i<col;i++) {
			 for(int j=0;j<row;j++) {
				 transpose[j][i]=matrix[i][j];
			 }
		 }
		 System.out.println("The original matrix: ");
		 for(int i=0;i<matrix.length;i++) {
			 for(int j=0;j<matrix[i].length;j++) {
				 System.out.print(matrix[i][j]+"\t");
			 }
			 System.out.println("\n");
		 }
		 System.out.println("The transpose matrix: ");
		 for(int i=0;i<matrix.length;i++) {
			 for(int j=0;j<matrix[i].length;j++) {
				 System.out.print(transpose[j][i]+"\t");
			 }
			 System.out.println("\n");
	     }
}
}
	
	
	
	
	
	
	