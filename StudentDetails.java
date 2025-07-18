/* Author: Divya Kuriakose
 * Date: 18-07-2025
 * Program to create a class named Student and display the details of two students
*/


package sample;

class Student{
	String name;
	int rollNumber;
	String department;
	Student(String name ,int rollNumber ,String department){
		this.name = name;
		this.rollNumber = rollNumber;
		this.department = department;
	}
	public void printStudentInfo() {
		System.out.println("Name: "+ name);
		System.out.println("Roll Number: "+ rollNumber);
		System.out.println("Department: "+ department);
	}
}

public class StudentDetails {
	public static void main(String[] args) {
		Student student=new Student("David",32,"CSE");
		student.printStudentInfo();
		Student students=new Student("Evan",23,"ECS");
	    students.printStudentInfo();
	}
}
