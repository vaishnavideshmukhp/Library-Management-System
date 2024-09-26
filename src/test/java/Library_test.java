import org.example.Book;
import org.example.Library;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Library_test {
    private Library library;
        private Book book1;
        private Book book2;


        @Before
        public void setUp() {
            library = new Library();
            book1 = new Book("123456789", "TUF", "F.S. Fitzgerald", 1905);
            book2 = new Book("987654321", "RJP", "George O.G", 1979);

            library.addBook(book1);
            library.addBook(book2);
        }

        //Test to verify that books are added correctly to the library.

        @Test
        public void testAddBook() {
            assertEquals(2, library.viewAvailableBooks().size());
        }

//

}
