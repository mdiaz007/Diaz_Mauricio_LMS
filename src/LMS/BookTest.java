/*
	Mauricio Diaz
	CEN3024C
	July 18 , 2024
	Software Development 1

	BookTest Class: This class is for holding the Unit Tests for the Book class.
*/

package LMS;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest { // Visible within same package, not accessible by other packages. This class has the standard access modifier of "package-private"

    Book testBook = new Book();

    public BookTest(){ // Constructor for unit test.
        setTestBook();
    }

    public void setTestBook(){
        testBook.setId(999);
        testBook.setTitle("Unit Testing with Mauricio Diaz");
        testBook.setAuthor("Unit Test");
        testBook.setReleaseYear(1901);
        testBook.setBarcode("UnitTest");
    }

    @Test
    void addBookTest(){ // This test is for the addBook()
        assertEquals(1, Functions.addBook(1, testBook));
    }

    @Test
    void checkOutBookTest(){
        assertEquals("Checking Out book: Unit Testing with Mauricio Diaz", Functions.checkOutBook(testBook));
    }

    @Test
    void checkInBookTest(){
        assertEquals("Checking in book: Unit Testing with Mauricio Diaz", Functions.checkInBook(testBook));
    }

    @Test
    void removeByBarcodeTest(){
        assertEquals("Deleting book with barcode number: UnitTest", Functions.deleteBookBarcode(testBook));
    }

    @Test
    void removeByTitleTest(){
        assertEquals("Book not found with title: Unit Testing with Mauricio Diaz", Functions.deleteBookTitle(testBook));
    }

}