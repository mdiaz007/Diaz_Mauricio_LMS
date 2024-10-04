/*
	Mauricio Diaz
	CEN3024C
	July 18 , 2024
	Software Development 1

	BookTest Class: This class is for holding the Unit Tests for the Book class.
*/

import com.mauricio.librarymanagementsystem.Book;
import com.mauricio.librarymanagementsystem.Database;
import com.mauricio.librarymanagementsystem.Functions;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class BookTest { // Visible within same package, not accessible by other packages. This class has the standard access modifier of "package-private"

    Book testBook = new Book();

    // Constructor for unit test.
    public BookTest(){
        setTestBook();
    }

    public void setTestBook(){
        testBook.setId(999);
        testBook.setTitle("Unit Testing with Mauricio Diaz");
        testBook.setAuthor("Unit Test");
        testBook.setReleaseYear(1901);
        testBook.setBarcode("UnitTest");
    }

    // Small JUnit test.
    @Test
    void addRemoveBookTest() {

        File myObj = new File("LMS_DATABASE.db");

        if (myObj.exists()){
            assertEquals(1, Functions.addBook(1, testBook));
            testBook.setTitle("Unit Testing with Mauricio Diaz");
            assertEquals("Deleting book with title: Unit Testing with Mauricio Diaz", Functions.deleteBookTitle(testBook));
        }else{
            Database.createDatabase();
            assertEquals(1, Functions.addBook(1, testBook));
            testBook.setTitle("Unit Testing with Mauricio Diaz");
            assertEquals("Deleting book with title: Unit Testing with Mauricio Diaz", Functions.deleteBookTitle(testBook));
            myObj.delete();
        }

    }

}