/*
	Mauricio Diaz
	CEN3024C
	June 15, 2024
	Software Development 1

	Book Class: This class is for the Book Object which will be used in conjunction with a database.
	The book object holds necessary book information.
*/

package LMS;

import java.util.*;

public class Book { // Book class for setting up Book objects.

    // Declaring book variables.
    private int Id;
    private String Title;
    private String Author;
    private int ReleaseYear;
    private String Barcode;
    private String Status;


    // Constructor for calling resetBook right as the book object is created.
    public Book(){
        resetBook();
    }

    // Initializing book variables.
    public void resetBook(){
        this.Id = -1;
        this.Title = null;
        this.Author = null;
        this.ReleaseYear = -1;
        this.Barcode = null;
        this.Status = null;
    }

    // Setters for Book Object (Holds information for book).
    public void setId(int Id){
        this.Id = Id;
    }
    public void setTitle(String Title){
        this.Title = Title;
    }
    public void setAuthor(String Author){
        this.Author = Author;
    }
    public void setReleaseYear(int ReleaseYear){
        this.ReleaseYear = ReleaseYear;
    }
    public void setBarcode(String Barcode){
        this.Barcode = Barcode;
    }
    public void setStatus(String Status){
        this.Status = Status;
    }

    // Getters for Book Object (Holds information for book).
    public int getId(){
        return this.Id;
    }
    public String getTitle(){
        return this.Title;
    }
    public String getAuthor(){
        return this.Author;
    }
    public int getReleaseYear(){
        return this.ReleaseYear;
    }
    public String getBarcode(){
        return this.Barcode;
    }
    public String getStatus(){
        return this.Status;
    }

    // Function for asking user for book information then adding to database.
    public void addBook(Scanner scanner){

        System.out.print("Book ID: ");
        this.setId(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Title: ");
        this.setTitle(scanner.nextLine());

        System.out.print("Author: ");
        this.setAuthor(scanner.nextLine());

        System.out.print("ReleaseYear: ");
        this.setReleaseYear(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Barcode: ");
        this.setBarcode(scanner.nextLine());

        System.out.print("Status: ");
        this.setStatus(scanner.nextLine());

        /*
        * Function for adding book to database with given values
        * */

        System.out.println("Adding book: " + this.getTitle()); // Confirmation message

        resetBook(); // Resets Book to default values.
    }

    // Function asks user for input for deleting book with given barcode.
    public void deleteBookBarcode(Scanner scanner){
        System.out.println("Book Deletion");
        System.out.print("Please enter barcode corresponding to the book for deletion: ");
        this.setBarcode(scanner.nextLine());

        /*
        * Function for going through database and finding book with given
        * barcode for deletion.
        * */

        System.out.println("Deleting book with barcode number: " + this.getBarcode()); // Confirmation message

        resetBook();
    }

    // Function asks user for input for deleting book with given title.
    public void deleteBookTitle(Scanner scanner){
        System.out.println("Book Deletion");
        System.out.print("Please enter title corresponding to the book for deletion: ");
        this.setTitle(scanner.nextLine());

        /*
         * Function for going through database and finding book with given
         * title for deletion.
         * */

        System.out.println("Deleting book with title: " + this.getTitle()); // Confirmation message

        resetBook();
    }

    public void checkInBook(Scanner scanner){
        System.out.print("Check in book: ");
        this.setTitle(scanner.nextLine());

        /*
        * Function for changing database status of corresponding book to checked in / available
        * */

        this.setStatus("Checked-In");

        System.out.println("Checking in book: " + this.getTitle()); // Confirmation message

        resetBook();
    }

    public void checkOutBook(Scanner scanner){
        System.out.print("Check Out book: ");
        this.setTitle(scanner.nextLine());

        /*
         * Function for changing database status of corresponding book to checked out / unavailable
         * */

        this.setStatus("Checked-Out");

        System.out.println("Checking Out book: " + this.getTitle()); // Confirmation message

        resetBook();
    }

    // Function for printing all books in database.
    public void printAllBooks(){

        /*
        * For loop to go through database, and assign each column value 1 by 1
        * to setters and then use print with getters to print all books to console.
        *
        * Or just use SQL commands and print books via a query EX: select * from books
        * */

        resetBook(); // If Object is used, if not remove.

    }

    public void printAvailableBooks(){

        /*
         * For loop to go through database, and assign each column value 1 by 1
         * to setters and then use print with getters to print all books to console.
         *
         * Or just use SQL commands and print books via a query EX: select * from books where
         * status == available or checked-in
         * */

        resetBook(); // If Object is used, if not remove.

    }
    public void printUnavailableBooks(){

        /*
         * For loop to go through database, and assign each column value 1 by 1
         * to setters and then use print with getters to print all books to console.
         *
         * Or just use SQL commands and print books via a query EX: select * from books where
         * status == unavailable or checked-out
         * */

        resetBook(); // If Object is used, if not remove.

    }

    public void importBooks(Scanner scanner){

        int counter = 0;

        System.out.print("Please enter name of comma delimited text file of books to be imported: ");
        String title = scanner.nextLine();

        System.out.println("Importing " + title + " books into the database");

        /*
        * Loops through text file and uses setters to save books to object
        * then imports to database.
        *
        * has counter
        * int counter++;
        * */

        System.out.println(counter + " Books have been imported into database");
        resetBook();
    }

    public void printAll(){ // For testing purposes...
        System.out.println("Book ID: " + this.getId());
        System.out.println("Title: " + this.getTitle());
        System.out.println("Author: " + this.getAuthor());
        System.out.println("ReleaseYear: " + this.getReleaseYear());
        System.out.println("Barcode: " + this.getBarcode());
        System.out.println("Status: " + this.getStatus());
    }

}