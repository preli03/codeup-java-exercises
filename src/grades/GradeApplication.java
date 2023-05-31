package grades;

import java.util.HashMap;

public class GradeApplication {
    private static HashMap<String,Student>;
    public static void main(String[] args){
        students = makeStudents();
        printWelcome();

    }

    public static HashMap<String, Student> makeStudents(){
        Student Preli = new Student("Patrick");
        Preli.addGrade(90);
        Preli.addGrade(50);
        Student Rich = new Student("Rich");

        Student John = new Student("John");

        Student Mary = new Student("Mary");






        students.put("Preli" ,Patrick);
        students.put("Rich" ,Rich);
        students.put("Mary" ,Mary);

        return students;


    }
    private static void printWelcome(){
        System.out.println("" +
                "Welcome!" );
    }
}
