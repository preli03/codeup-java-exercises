import java.util.Scanner;

public class StringExercise {
  /* public static void main(String[] args) {
        String output1 = "We dont need no eduction\nWe dont need no thought control";
        System.out.println(output1);
        String output2 = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(output2);
        String output3 ="In wndows, main drive is usually C:\\";
        System.out.println(output3);
        String output4 = "I can do backslashes \\, double backslashes \\\\,\nand the amazing triple backslash\\\\\\!";
        System.out.println(output4);
    }*/
public static class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bob: Hey Im Bob. Whats up?");
        String userInput = scanner.nextLine();

        if (userInput.endsWith("?")) {
            System.out.println("Bob: Sure.");
        } else if (userInput.endsWith("!")) {
            System.out.println("Bob: Whoa, chill out!");
        } else if (userInput.isEmpty()) {
            System.out.println("Bob: Fine. Be that way!");
        } else {
            System.out.println("Bob: Whatever.");
        }
    }
}}
