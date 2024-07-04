/*
	Mauricio Diaz
	CEN3024C
	June 23, 2024
	Software Development 1

	BookTest Class: This class is for holding the Unit Tests for the Book class.
*/

package LMS;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookTest { // Visible within same package, not accessible by other packages. This class has the standard access modifier of "package-private"


    /* When the database is implemented, a unit case will be created.
     * If a database returns successfully and data was added the unit case will pass.
     * The unit case will be created during module 9.
     * */
    @Test
    void addBook() { // This test is for the addBook() function in the Book class.
        fail("Database not implemented yet");
    }

    @Test
    void deleteBookBarcode() { // This test is for the deleteBookBarcode() function in the Book class.
        fail("Database not implemented yet");
    }

    @Test
    void deleteBookTitle() { // This test is for the deleteBookTitle() function in the Book class.
        fail("Database not implemented yet");
    }

    @Test
    void checkInBook() { // This test is for the checkInBook() function in the Book class.
        fail("Database not implemented yet");
    }

    @Test
    void checkOutBook() { // This test is for the checkOutBook() function in the Book class.
        fail("Database not implemented yet");
    }
}