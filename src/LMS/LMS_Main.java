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

        Scanner scanner = new Scanner(System.in); // Scanner for reading user input.
        Book book = new Book(); // Creating book object, used for holding book data.
        book.menuOptions(scanner); // Calls menuOptions which begins the program.

    }
}

/*
* TODO: Module 9
* Need to connect functions to database for the importing and exporting of data.
* Organize project files to use standard java project structure, checkout MAVEN.
* */
