package grades;

public class StudentTest {
    public static void main(String[] args){
        Student bob = new Student('bob');
        bob.addGrade(90);
        bob.addGrade(90);
        bob.addGrade(90);
        bob.addGrade(90);
        System.out.println(bob.getGradeAverage());
    }
}
