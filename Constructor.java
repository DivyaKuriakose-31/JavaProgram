package sample;
class Student{
	int rollNumber;
	String name;
	String dept;
	Student(){
		rollNumber=1;
		name="Name";
		dept="Department";
				
	}
	Student(int rollNUmber){
		this.rollNumber=rollNumber;
	}
	Student(int rollNumber,String name){
		this.rollNumber=rollNumber;
		this.name=name;
	}
	public void dispalyDetails() {
		System.out.println("Roll Number: "+rollNumber);
		System.out.println("Name: "+name);
		System.out.println("Department: "+dept);
	}
}
public class Constructor {
	public static void main(String[] args) {
		Student student =new Student();
		student.displayDetails();
		Student student2 =new Student(2);
		student2.displayDetails();
		Student student3 =new Student(5,"Lena");
		student3.displayDEtails();
		}
	}
}
