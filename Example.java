package demo;

class Book{
	String title;
	String author;
	final int bookID;

    static int bookCounter=1000;
    static final String LIBRARY_NAME="Central library";
    
    Book(){
    	title="Wings of fire";
    	author="APJ Abdul Kalam";
    	bookID=bookCounter++;
    	
    }
    Book(String title,String author){
    	this.title=title;
    	this.author=author;
    	bookID=bookCounter++;
    }
    public void displayInfo() {
    	System.out.println("Book title: "+title);
    	System.out.println("Author of the book: "+author);
    	System.out.println("Book ID: "+bookID);
    }
}
public class Example {

}
