
import java.util.Scanner;

import static java.lang.Integer.getInteger;

public class MethodsExercise {
    public static void main(String[] args) {
/*
rollSomeDice();
*/
//#1
      /*  int additionResult = addition(max, min);
        int subtractionResult = subtraction(max, min);
        int multiplicationResult = multiplication(max, min);
        double divisionResult = division(max, min);
        int modulusResult = modulus(max, min);

        System.out.println("Addition Result: " + additionResult);
        System.out.println("Subtraction Result: " + subtractionResult);
        System.out.println("Multiplication Result: " + multiplicationResult);
        System.out.println("Division Result: " + divisionResult);
        System.out.println("Modulus Result: " + modulusResult);

    }
*/
      /*  //#1
        public static int addition ( int num1, int num2){
            return num1 + num2;
        }

        public static int subtraction ( int num1, int num2){
            return num1 - num2;
        }

        public static int multiplication ( int num1, int num2){
            return num1 * num2;
        }

        public static double division ( int num1, int num2){
            return (double) num1 / num2;
        }

        public static int modulus ( int num1, int num2){
            return num1 % num2;
        }

    }*/


       /* //#2
        int min = 5;
        int max = 10;
        getInteger(min, max);
    }
    public static void getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max + ": ");

        int userInput = sc.nextInt();

        if (userInput >= min && userInput <= max) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
            getInteger(min, max);

        }


    }*/

       /* System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        System.out.println("Valid input: " + userInput);
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int userInput;

        do {
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println("Invalid input. Please enter a valid number.");
            }
            userInput = scanner.nextInt();

            if (userInput < min || userInput > max) {
                System.out.println("Input out of range. Please enter a number between " + min + " and " + max + ".");
            }
        } while (userInput < min || userInput > max);

        return userInput;
    }


    public static long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }*/

}

   /* private static void rollSomeDice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sides for die: ");
    int dieSides = getInteger(String.valueOf(4),20);

        input.nextLine();

        System.out.println("Press enter to roll some dice");
        input.nextLine();

        int result = rollADie(dieSides);
        System.out.println("You rolled a " + result);

    }
    private static int rollADie(int dieSides){
        int result = (int) Math.random() * dieSides);
return result;
    }*/
    }


