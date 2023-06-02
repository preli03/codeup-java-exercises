package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class GradeApplication {
    private static HashMap<String,Student> students;
    public static void main(String[] args){
        Map<String, Student> students = new HashMap<>();
        students.put("john123", new Student("John"));
        students.get("john123").addGrade(85);
        students.get("john123").addGrade(90);
        students.get("john123").addGrade(92);

        students.put("sarah456", new Student("Sarah"));
        students.get("sarah456").addGrade(88);
        students.get("sarah456").addGrade(76);
        students.get("sarah456").addGrade(95);

        students.put("alex789", new Student("Alex"));
        students.get("alex789").addGrade(70);
        students.get("alex789").addGrade(82);
        students.get("alex789").addGrade(79);

        students.put("emma321", new Student("Emma"));
        students.get("emma321").addGrade(95);
        students.get("emma321").addGrade(88);
        students.get("emma321").addGrade(92);

        runGradesApplication(students);
    }

    public static void runGradesApplication(Map<String, Student> students) {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        boolean running = true;

        while (running) {
            System.out.println("Welcome!");
            System.out.println("Here are the GitHub usernames of our students:");

            for (String username : students.keySet()) {
                System.out.print("| " + username + " ");
            }
            System.out.println("|");

            System.out.println("Please enter the GitHub username of the student you want to know more about:");
            userInput = scanner.nextLine();

            if (students.containsKey(userInput)) {
                Student student = students.get(userInput);
                System.out.println("Name: " + student.getName());
                System.out.println("Grades: " + student.getGradeAverage());
            } else {
                System.out.println("No users with that username were found.");
            }

            System.out.println("Do you want to continue? (yes/no)");
            userInput = scanner.nextLine();

            if (!userInput.equalsIgnoreCase("yes")) {
                running = false;
            }
        }
        System.out.println("Goodbye!");
    }
}
