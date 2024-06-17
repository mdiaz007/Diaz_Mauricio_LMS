/*
	Mauricio Diaz
	CEN3024C
	June 15, 2024
	Software Development 1

	Book Class: This class is for the Book Object which will be used in conjunction with a database.
	The book object holds necessary book information.
*/

package LMS;

import java.io.*;
import java.time.*;
import java.util.*;

public class Book { // Book class for setting up Book objects.

    // Declaring book variables.
    private int Id;
    private String Title;
    private String Author;
    private int ReleaseYear;
    private String Barcode;
    private String Status;
    private String DueDate;


    // Constructor for calling resetBook right as the book object is created.
    public Book(){
        resetBook();
    }

    // Initializing book variables.
    public void resetBook(){
        setId(-1);
        setTitle(null);
        setAuthor(null);
        setReleaseYear(-1);
        setBarcode(null);
        setStatus(null);
        setDueDate(null);
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
    public void setDueDate(String DueDate){
        this.DueDate = DueDate;
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
    public String getDueDate(){
        return this.DueDate;
    }

    // Function for asking user for book information then adding to database.
    public void addBook(Scanner scanner, int decision){

        // Decision is for function needs to be used without user import, for importing purposes.
        if (decision == 1){
            System.out.print("Book ID: ");
            setId(scanner.nextInt());
            scanner.nextLine();

            System.out.print("Title: ");
            setTitle(scanner.nextLine());

            System.out.print("Author: ");
            setAuthor(scanner.nextLine());

            System.out.print("ReleaseYear: ");
            setReleaseYear(scanner.nextInt());
            scanner.nextLine();

            System.out.print("Barcode: ");
            setBarcode(scanner.nextLine());

            System.out.print("Status: ");
            setStatus(scanner.nextLine());

            System.out.print("Due Date: ");
            setDueDate(scanner.nextLine());
        }

        /*
        * Function for adding book to database with given values
        * */

        System.out.println("Adding book: " + getTitle()); // Confirmation message
        resetBook(); // Resets Book to default values.
    }

    // Function asks user for input for deleting book with given barcode.
    public void deleteBookBarcode(Scanner scanner){
        System.out.println("Book Deletion");
        System.out.print("Please enter barcode corresponding to the book for deletion: ");
        setBarcode(scanner.nextLine());

        /*
        * Function for going through database and finding book with given
        * barcode for deletion.
        * */

        System.out.println("Deleting book with barcode number: " + getBarcode()); // Confirmation message

        resetBook();
    }

    // Function asks user for input for deleting book with given title.
    public void deleteBookTitle(Scanner scanner){
        System.out.println("Book Deletion");
        System.out.print("Please enter title corresponding to the book for deletion: ");
        setTitle(scanner.nextLine());

        /*
         * Function for going through database and finding book with given
         * title for deletion.
         * */

        System.out.println("Deleting book with title: " + getTitle()); // Confirmation message

        resetBook();
    }

    public void checkInBook(Scanner scanner){
        System.out.print("Check in book: ");
        setTitle(scanner.nextLine());
        setStatus("Checked-In");
        setDueDate(null);

        /*
         * Function for changing database status of corresponding book to checked in / available
         * if found.
         * */

        System.out.println("Checking in book: " + getTitle()); // Confirmation message

        resetBook();
    }

    public void checkOutBook(Scanner scanner){

        // Creates LocalDate objects for use of due date.
        LocalDate currentDate = LocalDate.now();
        LocalDate dueDate = currentDate.plusWeeks(4);
        String dueDateString = dueDate.toString();

        System.out.print("Check Out book: ");
        setTitle(scanner.nextLine());

        /*
        * Error message if book not found or already checked out.
        * */

        setStatus("Checked-Out");
        setDueDate(dueDateString);

        /*
         * Function for changing database status of corresponding book to checked out / unavailable
         * if found.
         * */

        System.out.println("Checking Out book: " + getTitle()); // Confirmation message
        System.out.println("Due Date: " + getDueDate()); // Confirmation message

        resetBook();
    }

    // Function for printing all books in database.
    public void seeAllBooks(){

        /*
        * For loop to go through database, and assign each column value 1 by 1
        * to setters and then use print with getters to print all books to console.
        *
        * Or just use SQL commands and print books via a query EX: select * from books
        * */

        resetBook(); // If Object is used, if not remove.

    }

    public void seeAvailableBooks(){

        /*
         * For loop to go through database, and assign each column value 1 by 1
         * to setters and then use print with getters to print all available books to console.
         *
         * Or just use SQL commands and print books via a query EX: select * from books where
         * status == available or checked-in
         * */

        resetBook(); // If Object is used, if not remove.

    }
    public void seeUnavailableBooks(){

        /*
         * For loop to go through database, and assign each column value 1 by 1
         * to setters and then use print with getters to print all unavailable books to console.
         *
         * Or just use SQL commands and print books via a query EX: select * from books where
         * status == unavailable or checked-out
         * */

        resetBook(); // If Object is used, if not remove.

    }

    public void importBooks(Scanner scanner){

        String line = null; // Holds line data of imported file.
        int counter = 0; // Counter for holding number of how many books have been added.

        // Takes user give
        System.out.print("Please enter name of comma delimited text file of books to be imported: ");
        String title = scanner.nextLine();
        System.out.println("Importing " + title + " books into the database");

        try { // Try and catch just in case for exception handling.

            // BufferedReader to read text files.
            BufferedReader reader = new BufferedReader(new FileReader(title));
            while((line = reader.readLine()) != null){ // Goes through each line and saves data.

                String[] delimitMe = line.split(","); // Splits data by using delimiter of ",".

                // Sets the value of books given by text file.
                setId(Integer.parseInt(delimitMe[0]));
                setTitle(delimitMe[1]);
                setAuthor(delimitMe[2]);
                setReleaseYear(Integer.parseInt(delimitMe[3]));
                setBarcode(delimitMe[4]);
                setStatus(delimitMe[5]);
                setDueDate(delimitMe[6]);

                // Calls addBook function to add book to database.
                addBook(scanner, 0);
                counter++;
            }

            System.out.println("Import complete");
            System.out.println(counter + " Books have been imported into database");
            reader.close(); // Closes reader.
        } catch (IOException e){
            System.out.println("Error while reading file");
        }

        /* Will not call resetBook() because addBook() function calls it*/
    }

//    public void printAll(){ // For testing purposes...
//        System.out.println("Book ID: " + getId());
//        System.out.println("Title: " + getTitle());
//        System.out.println("Author: " + getAuthor());
//        System.out.println("ReleaseYear: " + getReleaseYear());
//        System.out.println("Barcode: " + getBarcode());
//        System.out.println("Status: " + getStatus());
//        System.out.println("DueDate: " + getDueDate());
//    }

    public void menuOptions(Scanner scanner){

        int selection = -1; // Keeps track of user selected menu option.

        do {

            // Menu options
            System.out.println("\nMenu Options");
            System.out.println("[1] addBook");
            System.out.println("[2] deleteBookBarcode");
            System.out.println("[3] deleteBookTitle");
            System.out.println("[4] checkInBook");
            System.out.println("[5] checkOutBook");
            System.out.println("[6] seeAllBooks");
            System.out.println("[7] seeAvailableBooks");
            System.out.println("[8] seeUnavailableBooks");
            System.out.println("[9] importBooks");
            System.out.println("[0] exit program");

            System.out.print("Selection: ");
            selection = scanner.nextInt();
            scanner.nextLine();

            switch(selection){ // Chooses function based on user selection.
                case 1:
                    addBook(scanner, 1);
                    break;
                case 2:
                    deleteBookBarcode(scanner);
                    break;
                case 3:
                    deleteBookTitle(scanner);
                    break;
                case 4:
                    checkInBook(scanner);
                    break;
                case 5:
                    checkOutBook(scanner);
                    break;
                case 6:
                    seeAllBooks();
                    break;
                case 7:
                    seeAvailableBooks();
                    break;
                case 8:
                    seeUnavailableBooks();
                    break;
                case 9:
                    importBooks(scanner);
                    break;
                case 0:
                    System.out.println("Exiting program");
                    break;
                default:
                    System.out.println("Invalid selection, please try again!");
                    break;
            }
        }while (selection != 0);
    }
}