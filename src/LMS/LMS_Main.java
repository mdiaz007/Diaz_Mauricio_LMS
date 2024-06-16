/*
	Mauricio Diaz
	CEN3024C
	June 15, 2024
	Software Development 1

	LMS_Main: This is the main class for the library management system, it is what pulls
	all necessary functions together so that the user can add, remove, check in, checkout,
	and see book information.
*/

package LMS;

import java.util.*;

public class LMS_Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Book book = new Book();
//        book.addBook(scanner);
//        book.deleteBookBarcode(scanner);
//        book.deleteBookTitle(scanner);
//        book.checkInBook(scanner);
//        book.checkOutBook(scanner);

//        book.printAll();

        book.importBooks(scanner);
    }
}

/*
* TODO: Module 9
* delete function - needs database connection.
* add function - needs database connection.
* check in & out function - needs database connection.
* print functions - needs database connection.
* import function - needs database connection + needs IO loop (can do this now)
* */
