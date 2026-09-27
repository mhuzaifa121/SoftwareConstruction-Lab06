package lab6;

/**
 * Lab Task 4 - Library System ADT Design
 *
 * This interface is the ADT's contract: it says WHAT a library system does
 * (add, remove, search, issue, return books) without saying HOW those
 * operations are carried out. Any class that implements this interface can
 * be swapped in without client code needing to change.
 */
public interface LibrarySystem {

    /** Adds a new book to the library's collection. */
    void addBook(Book book);

    /**
     * Removes the book with the given id from the collection.
     * @return true if a book with that id was found and removed
     */
    boolean removeBook(String bookId);

    /**
     * Looks up a book by id.
     * @return the matching Book, or null if no book with that id exists
     */
    Book searchBook(String bookId);

    /**
     * Marks the book with the given id as issued (checked out), if it
     * exists and is not already issued.
     * @return true if the book was successfully issued
     */
    boolean issueBook(String bookId);

    /**
     * Marks the book with the given id as returned (available again), if
     * it exists and is currently issued.
     * @return true if the book was successfully returned
     */
    boolean returnBook(String bookId);
}
