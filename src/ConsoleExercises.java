import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       /* double pi = 3.14159;
        System.out.println("The value of pi is " + pi);

        System.out.print("Enter an integer: ");
        int nextInt = sc.nextInt();
        System.out.println(nextInt);

        System.out.println("Enter three words: ");
        String wordOne = sc.next();
        String wordTwo = sc.next();
        String wordThree = sc.next();

        System.out.println(wordOne);
        System.out.println(wordTwo);
        System.out.println(wordThree);

        System.out.println("Enter a sentence: ");
        String ourSentence = sc.next();
        System.out.println("You sentence is:" + ourSentence);*/

        System.out.println("Give me a length: ");
        String length = sc.nextLine();
        System.out.println("Give me a width: ");
        String width = sc.nextLine();
        int newLength = parseInt(length);
        int newWidth = parseInt(width);







    }

    private static int parseInt(String length) {
        return 0;
    }
}
