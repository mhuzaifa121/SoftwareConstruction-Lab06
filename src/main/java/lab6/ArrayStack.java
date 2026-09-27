package lab6;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Array-backed concrete implementation of the Stack ADT.
 */
public class ArrayStack<E> implements Stack<E> {

    private Object[] data;
    private int count;

    private static final int DEFAULT_CAPACITY = 10;

    public ArrayStack() {
        data = new Object[DEFAULT_CAPACITY];
        count = 0;
    }

    @Override
    public void push(E item) {
        if (count == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
        data[count] = item;
        count++;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Cannot pop from an empty stack");
        }
        count--;
        E item = (E) data[count];
        data[count] = null; // avoid memory leak
        return item;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Cannot peek an empty stack");
        }
        return (E) data[count - 1];
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int size() {
        return count;
    }
}
