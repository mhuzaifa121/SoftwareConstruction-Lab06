# Lab 6 – Abstract Data Types (ADT)

**Course:** Software Construction — 5th Semester, Software Engineering
**University:** University of Engineering and Technology, Abbottabad Campus
**Instructor:** Engr. Rizwan Shah

## Objective

Implement simple ADTs in Java, use interfaces to define contracts, and
apply abstraction and encapsulation principles.

## What Was Implemented

| Task | File(s) | What it covers |
|------|---------|-----------------|
| 1. Stack ADT | `Stack.java`, `ArrayStack.java`, `ArrayStackTest.java` | Array-backed `Stack<E>` following LIFO. `push(10); push(20); push(30);` then `pop()` returns `30`, then `20`, then `10`. |
| 2. Data Encapsulation | `Student.java` | Private `id`, `name`, `cgpa` fields with public getters only. Direct field access (`student.id`) does not compile — proven in a comment block in `Student.java` and demoed via getters in `Main.java`. |
| 3. Programming to an Abstraction | shown in `Main.java` | A single `List<String> students` variable is first backed by `ArrayList`, then reassigned to `LinkedList` — client code never changes. |
| 4. Library System ADT | `Book.java`, `LibrarySystem.java`, `LibraryImplementation.java`, `LibraryImplementationTest.java` | Interface `LibrarySystem` defines `addBook`, `removeBook`, `searchBook`, `issueBook`, `returnBook`; `LibraryImplementation` implements it with a `HashMap<String, Book>`. |
| 5. Student Management System | `StudentCollection.java`, `StudentCollectionImpl.java`, `StudentCollectionTest.java` | Interface `StudentCollection` defines `addStudent`, `removeStudent`, `findStudent`, `getSize`, `isEmpty`; implemented with a `HashMap<Integer, Student>` and validated with JUnit tests. |

`Main.java` runs a short demo of all five tasks and prints the results to
the console — this is what to screenshot for the report.

## How to Run

### In NetBeans (quickest way)
1. **File → Open Project**, select the `lab6` folder.
2. In the Projects panel, open `Source Packages → lab6 → Main.java`.
3. Right-click inside the editor (or on the file) and choose **Run File**
   (or just press **Shift+F6** while the file is open).

This runs `Main.java` directly and prints all five tasks' output to the
console — no extra configuration needed.

To run the JUnit tests: right-click the project → **Test** (or **Alt+F6**).

### From the command line (if you have Maven installed)
```bash
mvn test          # run all JUnit tests
mvn package        # build an executable jar (lab6-adt-1.0.0.jar)
java -jar target/lab6-adt-1.0.0.jar   # run the demo
```

## Project Structure

```
lab6/
├── pom.xml
├── README.md
├── src/
│   ├── main/java/lab6/
│   │   ├── Main.java                 (run this one directly)
│   │   ├── Stack.java
│   │   ├── ArrayStack.java
│   │   ├── Student.java
│   │   ├── Book.java
│   │   ├── LibrarySystem.java
│   │   ├── LibraryImplementation.java
│   │   ├── StudentCollection.java
│   │   └── StudentCollectionImpl.java
│   └── test/java/lab6/
│       ├── ArrayStackTest.java
│       ├── LibraryImplementationTest.java
│       └── StudentCollectionTest.java
```
