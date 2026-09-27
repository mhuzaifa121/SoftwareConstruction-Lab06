package lab6;

/**
 * A simple generic Stack ADT following the LIFO (Last-In, First-Out)
 * principle. This interface defines WHAT a stack does, independent of any
 * particular implementation.
 */
public interface Stack<E> {

    /** Pushes item onto the top of the stack. */
    void push(E item);

    /**
     * Removes and returns the item at the top of the stack.
     * @throws java.util.NoSuchElementException if the stack is empty
     */
    E pop();

    /**
     * Returns (without removing) the item at the top of the stack.
     * @throws java.util.NoSuchElementException if the stack is empty
     */
    E peek();

    /** Returns true if the stack contains no items. */
    boolean isEmpty();

    /** Returns the number of items currently in the stack. */
    int size();
}
