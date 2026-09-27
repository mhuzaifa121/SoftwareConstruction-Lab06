package lab6;

/**
 * Lab Task 5 - Student Management System
 *
 * ADT specification for a collection of Students. This interface describes
 * WHAT operations are available; StudentCollectionImpl provides one
 * possible HOW.
 */
public interface StudentCollection {

    /** Adds student to the collection. */
    void addStudent(Student student);

    /**
     * Removes the student with the given id, if present.
     * @return true if a student with that id was found and removed
     */
    boolean removeStudent(int id);

    /**
     * Finds the student with the given id.
     * @return the matching Student, or null if no student with that id
     *         exists in the collection
     */
    Student findStudent(int id);

    /** Returns the number of students currently in the collection. */
    int getSize();

    /** Returns true if the collection contains no students. */
    boolean isEmpty();
}
