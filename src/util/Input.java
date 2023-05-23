package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

        public Input(){
            this.scanner = new Scanner(System.in);
        }
        public String getString(){
            return  this.scanner.nextLine();
    }
    public boolean yesNo(){
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y")){
                    return true;
                     } else {
                return false;
    }
    }

    public int getInt(){
            return this.scanner.nextInt();

    }

    public double getDouble(){
            return this.scanner.nextDouble();

    };

        public int getInt(int min, int max){
             int userNum =  Integer.valueOf((this.getString()));
             if(userNum >= min && userNum <= max);
             return userNum;

        }
        System.out.println("Integer not between bounds. Enter a double: ")
                    return getDouble(min,max,prompt);
}

public double getDouble(doube min, double max,String prompt);
public static void main(String[] arg){
            Input inputOne = new Input();
    System.out.println("Get String: ");
    System.out.println("yesNo");
    System.out.println(inputOne.yesNo());
    System.out.println("give me a number between 1.0-10.0");
    System.out.println(inputOne.getDouble(1.0, 10.0));
}

}
