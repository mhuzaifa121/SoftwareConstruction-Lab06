package lab6;

import java.util.HashMap;
import java.util.Map;

/**
 * Concrete implementation of LibrarySystem, backed by a HashMap keyed on
 * book id for fast lookup. Client code that only depends on the
 * LibrarySystem interface never needs to know this detail.
 */
public class LibraryImplementation implements LibrarySystem {

    private final Map<String, Book> books = new HashMap<>();

    @Override
    public void addBook(Book book) {
        books.put(book.getBookId(), book);
    }

    @Override
    public boolean removeBook(String bookId) {
        return books.remove(bookId) != null;
    }

    @Override
    public Book searchBook(String bookId) {
        return books.get(bookId);
    }

    @Override
    public boolean issueBook(String bookId) {
        Book book = books.get(bookId);
        if (book == null || book.isIssued()) {
            return false;
        }
        book.setIssued(true);
        return true;
    }

    @Override
    public boolean returnBook(String bookId) {
        Book book = books.get(bookId);
        if (book == null || !book.isIssued()) {
            return false;
        }
        book.setIssued(false);
        return true;
    }
}
