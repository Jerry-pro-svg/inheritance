// Base class
class Person {
    String name;
    int age;

    // Constructor for Person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Intermediate class inheriting from Person
class Student extends Person {
    String studentID;
    String major;

    // Constructor for Student
    public Student(String name, int age, String studentID, String major) {
        super(name, age); // Correctly chaining to Person's constructor
        this.studentID = studentID;
        this.major = major;
    }

    // Method to display student details
    public void displayStudentDetails() {
        displayPersonDetails();
        System.out.println("Student ID: " + studentID);
        System.out.println("Major: " + major);
    }
}

// Derived class inheriting from Student
class GraduateStudent extends Student {
    String researchTopic;

    // Constructor for GraduateStudent
    public GraduateStudent(String name, int age, String studentID, String major, String researchTopic) {
        super(name, age, studentID, major); // Correctly chaining to Student's constructor
        this.researchTopic = researchTopic;
    }

    // Method to display graduate student details
    public void displayGraduateStudentDetails() {
        displayStudentDetails();
        System.out.println("Research Topic: " + researchTopic);
    }
}

// Main class
public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        // Create a GraduateStudent object
        GraduateStudent gradStudent = new GraduateStudent(
            "John Doe", 24, "S12345", "Computer Science", "Artificial Intelligence"
        );

        // Display graduate student details
        gradStudent.displayGraduateStudentDetails();
    }
}
