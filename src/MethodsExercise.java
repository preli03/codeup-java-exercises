
import java.util.Scanner;

public class MethodsExercise {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 5;

        int additionResult = addition(num1, num2);
        int subtractionResult = subtraction(num1, num2);
        int multiplicationResult = multiplication(num1, num2);
        double divisionResult = division(num1, num2);
        int modulusResult = modulus(num1, num2);

        System.out.println("Addition Result: " + additionResult);
        System.out.println("Subtraction Result: " + subtractionResult);
        System.out.println("Multiplication Result: " + multiplicationResult);
        System.out.println("Division Result: " + divisionResult);
        System.out.println("Modulus Result: " + modulusResult);

        Scanner sc = new Scanner(System.in);
        String choice;

        do {

            int number = getInput(scanner);
            long factorial = calculateFactorial(number);
            System.out.println("the factorial of" + number + " is: " + factorial);
            System.out.println("Do you want to continue? (Y/N): ");

        } while (choice.equalsIgnoreCase("Y"));

        System.out.println("Program exited.");
    }

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static double division(int num1, int num2) {
        return (double) num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);

        int userInput;
        do {
            System.out.println("Enter a number between " + min + " and " + max + ": ");
            while (!sc.hasNextInt()) {
                String input = sc.next();
                System.out.println("Invalid input. Please enter integer...");
            }
            userInput = sc.nextInt();
            while (userInput < min || userInput > max) ;

            return userInput;
        }
        public static long calculateFactorial(int number){
            long factorial = 1;
            for (int i = 2; i <= number; i++) {
                factorial *= i;
            }
            return (int) factorial;
        }
    }
}



        /* public static int getInput(Scanner scanner) {
             int number;
             do {
                 System.out.print("Enter an integer from 1 to 10: ");
                 while (!scanner.hasNextInt()) {
                     String input = scanner.next();
                     System.out.println("Invalid input. Please enter an integer.");
                 }
                 number = scanner.nextInt();
             } while (number < 1 || number > 10);

             return number;
         }*/



