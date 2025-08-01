package demo;

class Student{
	String name;
	int rollNumber;
	static int studentCount=0;
	Student(String name,int rollNUmber){
		this.name=name;
		this.rollNumber=rollNumber;
		studentCount++;
	}
	public static void displayStudentCount() {
		System.out.println("Total number of student is: "+studentCount);
	}
}

public class Main {
	public static void main(String[] args) {
		Student student1=new Student("Alice",12);
		Student student2=new Student("Anu",14);
		Student student3=new Student("Aparna",18);
		
		Student.displayStudentCount();
	}

}
