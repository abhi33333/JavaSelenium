package assignmentJavaBasics;

public class Book {
	
	// Attributes
    String title;
    String author;

    // Constructor
    public Book(String title, String author) {

        this.title = title;
        this.author = author;
    }

    // Method to print book details
    public void displayBookDetails() {

        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
 
    

    public static void main(String[] args) {

        // Creating object using constructor
        Book book1 = new Book("Atomic Habits", "James Clear");

        // Calling method
        book1.displayBookDetails();
    }
}

