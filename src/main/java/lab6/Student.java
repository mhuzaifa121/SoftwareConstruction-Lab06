package lab6;

/**
 * Lab Task 2 - Data Encapsulation
 *
 * All fields are private. The only way for outside code to read this data
 * is through the public getter methods below -- outside code cannot reach
 * in and read (or corrupt) the fields directly.
 */
public class Student {

    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', cgpa=" + cgpa + "}";
    }

    /*
     * ---------------------------------------------------------------------
     * PROOF OF ENCAPSULATION (Task 2 test idea)
     * ---------------------------------------------------------------------
     * The two lines below are left here, commented out, exactly as the lab
     * asks: uncommenting either one and trying to compile the project will
     * produce a compilation error, because `id` and `name` are private and
     * are therefore not visible outside this class.
     *
     * Example (paste into Main.java and try to compile):
     *
     *   Student s = new Student(1, "Ali", 3.5);
     *   int x = s.id;          // ERROR: id has private access in Student
     *   String n = s.name;     // ERROR: name has private access in Student
     *
     * The only way to read this data from outside is through the public
     * getters: s.getId(), s.getName(), s.getCgpa().
     * ---------------------------------------------------------------------
     */
}
