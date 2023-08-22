package Java.day18_readingUserInput;

import java.util.Scanner;

public class userInput {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the firs number");
        int num1=scanner.nextInt();

        System.out.println("Enter the second number");
        int num2=scanner.nextInt();

        //scanner.nextLine();

        System.out.println("Enter your name");
        //String name=scanner.nextLine();
        String name=scanner.next();

        System.out.println("Output: " + num1 + " : " + num2 + " : " + name);
    }
}
