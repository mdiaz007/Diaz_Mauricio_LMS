/*
	Mauricio Diaz
	CEN3024C
	July 13, 2024
	Software Development 1

	Book Class: This class holds all the necessary functions for the LMS. It reuses the same book object
	until the book data can be imported to a database, then the object is reset for later use.
*/

package com.mauricio.librarymanagementsystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Functions { // Book class for setting up Book objects.

    // Function for asking user for book information then adding to database.
    public static int addBook(int decision, Book book){

        ArrayList<String> UnitTestCheck = new ArrayList<>();

        // Decision variable is for importing books and does the addBook function a bit differently.
        if (decision == 1){

            book.setStatus("Checked-In");
            book.setDueDate("null");

        }

        String sqlCommand = "INSERT INTO BOOKS (ID, TITLE, AUTHOR, RELEASEYEAR, BARCODE, STATUS, DUEDATE)\n" +
                "VALUES ("+null+", '"+book.getTitle()+"', '"+book.getAuthor()+"' , "+book.getReleaseYear()+", '"+book.getBarcode()+"', '"+book.getStatus()+"', '"+book.getDueDate()+"')";

        UnitTestCheck = Database.DatabaseConnect(sqlCommand, 1);
        book.resetBook(); // Resets Book to default values.

        int check = Integer.parseInt(UnitTestCheck.getFirst());

        return check;
    }

    // Function asks user for input for deleting book with given barcode.
    public static String deleteBookBarcode(Book book){

        ArrayList<String> list = new ArrayList<String>();
        String holder;

        String sqlCommand = "DELETE FROM BOOKS\n" + "WHERE BARCODE = '"+book.getBarcode()+"' ";

        list = Database.DatabaseConnect(sqlCommand, 1);

        holder = list.getFirst();

        if (holder.equals("0")){
            holder = "Book not found with barcode: " + book.getBarcode();
        }else{
            holder = "Deleting book with barcode number: " + book.getBarcode();
        }

        book.resetBook();

        return holder;

    }

    // Function asks user for input for deleting book with given title.
    public static String deleteBookTitle(Book book){

        ArrayList<String> list = new ArrayList<String>();
        String holder;

        String sqlCommand = "DELETE FROM BOOKS\n" + "WHERE TITLE = '"+book.getTitle()+"' ";

        list = Database.DatabaseConnect(sqlCommand, 1);

        holder = list.getFirst();

        if (holder.equals("0")){
            holder = "Book not found with title: " + book.getTitle();
        }else{
            holder = "Deleting book with title: " + book.getTitle();
        }

        book.resetBook();

        return holder;

    }

    // Function for checking in book.
    public static String checkInBook(Book book){

        ArrayList<String> list = new ArrayList<String>();
        String holder;

        String sqlCommand = "UPDATE BOOKS\n" + "SET STATUS = 'Checked-In' \n" + "WHERE TITLE = '"+book.getTitle()+"' ";

        String sqlCommand2 = "UPDATE BOOKS\n" + "SET DUEDATE = 'null' \n" + "WHERE TITLE = '"+book.getTitle()+"' ";

        list = Database.DatabaseConnect(sqlCommand, 1);
        Database.DatabaseConnect(sqlCommand2, 1);

        holder = list.getFirst();

        if (holder.equals("0")){
            holder = "Book not found with title: " + book.getTitle();
        }else{
            holder = "Checking in book: " + book.getTitle();
        }



        book.resetBook();

        return holder;
    }

    // Function for checking out book.
    public static String checkOutBook(Book book){

        ArrayList<String> list = new ArrayList<String>();

        // Creates LocalDate objects for use of due date.
        LocalDate currentDate = LocalDate.now();
        LocalDate dueDate = currentDate.plusWeeks(4);
        String dueDateString = dueDate.toString();

        String holder = null;

        String sqlCommand = "UPDATE BOOKS\n" + "SET STATUS = 'Checked-Out' \n" + "WHERE TITLE = '"+book.getTitle()+"' ";
        String sqlCommand1 = "UPDATE BOOKS\n" + "SET DUEDATE = '"+dueDateString+"' \n" + "WHERE TITLE = '"+book.getTitle()+"' ";

        list = Database.DatabaseConnect(sqlCommand, 1);
        Database.DatabaseConnect(sqlCommand1, 1);

        holder = list.getFirst();

        if (holder.equals("0")){
            holder = "Book not found with title: " + book.getTitle();
        }else{
            holder = ("Checking Out book: " + book.getTitle()); // Confirmation message
        }

        book.resetBook();

        return holder;
    }
    // Function for seeing unavailable books.
    public static ArrayList<String> seeAvailableBooks(){

        String sqlCommand = "SELECT * FROM BOOKS WHERE STATUS = 'Checked-In'";

        ArrayList<String> list = Database.DatabaseConnect(sqlCommand, 2);

        return list;

    }

    // Function for seeing unavailable books.
    public static ArrayList<String> seeUnavailableBooks(){

        String sqlCommand = "SELECT * FROM BOOKS WHERE STATUS = 'Checked-Out'";

        ArrayList<String> list = Database.DatabaseConnect(sqlCommand, 2);

        return list;

    }

    public static String importBooks(/*Scanner scanner*/String TextFileLocation, Book book){

        String line = null; // Holds line data of imported file.
        int counter = 0; // Counter for holding number of how many books have been added.

        String location = TextFileLocation;

        try { // Try and catch just in case for exception handling.

            // BufferedReader to read text files.
            BufferedReader reader = new BufferedReader(new FileReader(location));
            while((line = reader.readLine()) != null){ // Goes through each line and saves data.

                String[] delimitMe = line.split(","); // Splits data by using delimiter of ",".

                // Sets the value of books given by text file.
                book.setId(Integer.parseInt(delimitMe[0]));
                book.setTitle(delimitMe[1]);
                book.setAuthor(delimitMe[2]);
                book.setReleaseYear(Integer.parseInt(delimitMe[3]));
                book.setBarcode(delimitMe[4]);
                book.setStatus(delimitMe[5]);
                book.setDueDate(delimitMe[6]);

                // Calls addBook function to add book to database.
                addBook(2, book);
                counter++;
            }

            String returnMe = (counter + " Books have been imported into database");
            reader.close(); // Closes reader.
            return returnMe;
        } catch (IOException e){
//            System.out.println("Error while reading file");
            String returnMe = "Try again, Could not find file: " + TextFileLocation;
            return returnMe;
        }

        /* Will not call resetBook() because addBook() function calls it*/
    }

}