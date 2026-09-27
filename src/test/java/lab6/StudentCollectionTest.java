package lab6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StudentCollectionTest {

    @Test
    public void testAddStudentIncreasesSize() {
        StudentCollection collection = new StudentCollectionImpl();
        assertTrue(collection.isEmpty());

        collection.addStudent(new Student(1, "Ali", 3.5));

        assertEquals(1, collection.getSize());
        assertFalse(collection.isEmpty());
    }

    @Test
    public void testFindStudentById() {
        StudentCollection collection = new StudentCollectionImpl();
        Student ali = new Student(1, "Ali", 3.5);
        collection.addStudent(ali);

        assertEquals(ali, collection.findStudent(1));
        assertNull(collection.findStudent(999));
    }

    @Test
    public void testRemoveStudent() {
        StudentCollection collection = new StudentCollectionImpl();
        collection.addStudent(new Student(2, "Sara", 3.8));

        assertTrue(collection.removeStudent(2));
        assertEquals(0, collection.getSize());
        assertFalse(collection.removeStudent(2)); // already removed
    }

    @Test
    public void testGetSizeAndIsEmpty() {
        StudentCollection collection = new StudentCollectionImpl();
        assertTrue(collection.isEmpty());

        collection.addStudent(new Student(3, "Bilal", 3.2));
        collection.addStudent(new Student(4, "Hina", 3.9));

        assertEquals(2, collection.getSize());
        assertFalse(collection.isEmpty());
    }
}
