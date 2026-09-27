package lab6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Runnable demo of all 5 Lab 6 tasks.
 *
 * HOW TO RUN IN NETBEANS: right-click this file in the Projects/Files
 * panel -> "Run File" (or press Shift+F6 while it's open in the editor).
 * You do not need to run the whole project for this -- it works even
 * though this Maven project has no single "project main class" configured.
 */
public class Main {

    public static void main(String[] args) {
        task1_stackAdt();
        task2_encapsulation();
        task3_programToAnAbstraction();
        task4_librarySystem();
        task5_studentCollection();
    }

    private static void task1_stackAdt() {
        System.out.println("=== Task 1: Stack ADT (LIFO) ===");
        Stack<Integer> stack = new ArrayStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Pushed: 10, 20, 30");
        System.out.println("pop() -> " + stack.pop() + " (expected 30)");
        System.out.println("pop() -> " + stack.pop() + " (expected 20)");
        System.out.println("pop() -> " + stack.pop() + " (expected 10)");
        System.out.println();
    }

    private static void task2_encapsulation() {
        System.out.println("=== Task 2: Data Encapsulation ===");
        Student student = new Student(1, "Ali", 3.75);
        // Direct field access like `student.id` or `student.name` would not
        // compile here, because those fields are private -- we can only
        // reach the data through the public getters below.
        System.out.println("getId()   -> " + student.getId());
        System.out.println("getName() -> " + student.getName());
        System.out.println("getCgpa() -> " + student.getCgpa());
        System.out.println();
    }

    private static void task3_programToAnAbstraction() {
        System.out.println("=== Task 3: Programming to an Abstraction ===");
        List<String> students; // declared as the interface type

        students = new ArrayList<>();
        students.add("Ali");
        System.out.println("Backed by: " + students.getClass().getSimpleName()
                + " -> " + students);

        students = new LinkedList<>(); // same variable, different implementation
        students.add("Sara");
        System.out.println("Backed by: " + students.getClass().getSimpleName()
                + " -> " + students);
        System.out.println("(No client code above needed to change when the "
                + "implementation changed -- that's the point of the abstraction.)");
        System.out.println();
    }

    private static void task4_librarySystem() {
        System.out.println("=== Task 4: Library System ADT ===");
        LibrarySystem library = new LibraryImplementation();

        library.addBook(new Book("B1", "Clean Code", "Robert C. Martin"));
        library.addBook(new Book("B2", "Effective Java", "Joshua Bloch"));

        System.out.println("searchBook(\"B1\") -> " + library.searchBook("B1"));
        System.out.println("issueBook(\"B1\")  -> " + library.issueBook("B1"));
        System.out.println("issueBook(\"B1\") again (should fail) -> "
                + library.issueBook("B1"));
        System.out.println("returnBook(\"B1\") -> " + library.returnBook("B1"));
        System.out.println("removeBook(\"B2\") -> " + library.removeBook("B2"));
        System.out.println("searchBook(\"B2\") after removal -> "
                + library.searchBook("B2"));
        System.out.println();
    }

    private static void task5_studentCollection() {
        System.out.println("=== Task 5: Student Management System ===");
        StudentCollection collection = new StudentCollectionImpl();

        collection.addStudent(new Student(1, "Ali", 3.5));
        collection.addStudent(new Student(2, "Sara", 3.8));
        System.out.println("getSize() -> " + collection.getSize());
        System.out.println("isEmpty() -> " + collection.isEmpty());
        System.out.println("findStudent(1) -> " + collection.findStudent(1));
        System.out.println("removeStudent(1) -> " + collection.removeStudent(1));
        System.out.println("getSize() after removal -> " + collection.getSize());
        System.out.println("findStudent(1) after removal -> "
                + collection.findStudent(1));
    }
}
