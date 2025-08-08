package test;

class Book {
	String title;
	String author;
	double price;
	
	Book(String title,String author,double price ){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public void displayDetails() {
		System.out.println("Title name: "+title);
		System.out.println("Author name: "+author);
		System.out.println("Price: "+price);
	}
}
 class EBook extends Book{
		double fileSizeMb;
		EBook(String title,String author,double price,double fileSizeMb){
			super(title, author, price);
			this.fileSizeMb=fileSizeMb;
		}
		public void displayDetails() {
			super.displayDetails();
			System.out.println("File size: "+fileSizeMb+" MB");
			}
    }
 
	
	 class PrintedBook extends Book{
		int numberOfPages;
		PrintedBook(String title,String author,double price,int numberOfPages){
			super(title,author,price);
			this.numberOfPages=numberOfPages;
		}
		public void displayDetails() {
			super.displayDetails();
			System.out.println("Number of pages in the book: "+numberOfPages);
	
		}
	}
	


public class InheritanceDemo {
	public static void main(String[] args) {
		EBook ebook= new EBook("The Art of UI Design","James Gamma",15.50,2.8);
		System.out.println("---EBOOKS---");
	    ebook.displayDetails();
		
		PrintedBook pbook= new PrintedBook("Mastering in java","James Gosling",25.75,520);	    
		System.out.println("----PRINTED BOOKS----");
	    pbook.displayDetails();
	}
	

}
