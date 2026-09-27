package lab6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class LibraryImplementationTest {

    @Test
    public void testAddAndSearchBook() {
        LibrarySystem library = new LibraryImplementation();
        Book book = new Book("B1", "Clean Code", "Robert C. Martin");

        library.addBook(book);

        assertEquals(book, library.searchBook("B1"));
        assertNull(library.searchBook("does-not-exist"));
    }

    @Test
    public void testIssueAndReturnBook() {
        LibrarySystem library = new LibraryImplementation();
        library.addBook(new Book("B2", "The Pragmatic Programmer", "Hunt & Thomas"));

        assertTrue(library.issueBook("B2"));
        // Cannot issue a book that is already issued.
        assertFalse(library.issueBook("B2"));

        assertTrue(library.returnBook("B2"));
        // Cannot return a book that isn't currently issued.
        assertFalse(library.returnBook("B2"));
    }

    @Test
    public void testRemoveBook() {
        LibrarySystem library = new LibraryImplementation();
        library.addBook(new Book("B3", "Refactoring", "Martin Fowler"));

        assertTrue(library.removeBook("B3"));
        assertNull(library.searchBook("B3"));
        // Removing an already-removed (or unknown) id fails gracefully.
        assertFalse(library.removeBook("B3"));
    }
}
