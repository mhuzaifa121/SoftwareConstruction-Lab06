package lab6;

import java.util.HashMap;
import java.util.Map;

/**
 * Concrete implementation of StudentCollection, backed by a HashMap keyed
 * on student id.
 */
public class StudentCollectionImpl implements StudentCollection {

    private final Map<Integer, Student> students = new HashMap<>();

    @Override
    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    @Override
    public boolean removeStudent(int id) {
        return students.remove(id) != null;
    }

    @Override
    public Student findStudent(int id) {
        return students.get(id);
    }

    @Override
    public int getSize() {
        return students.size();
    }

    @Override
    public boolean isEmpty() {
        return students.isEmpty();
    }
}
