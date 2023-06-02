package grades;

import grades.GradeApplication;
import grades.Student;

public class StudentTest {
    public static void main(String[] args) {
        GradeApplication.main(args);

        // Alternatively, you can also test the Student class independently
        testStudent();
    }

    public static void testStudent() {
        Student bob = new Student("Bob");
        bob.addGrade(90);
        bob.addGrade(90);
        bob.addGrade(90);
        bob.addGrade(90);

        System.out.println("Student: " + bob.getName());
        System.out.println("Average Grade: " + bob.getGradeAverage());
    }
}
