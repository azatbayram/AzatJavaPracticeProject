package Java.day18_readingUserInput;

import java.util.Scanner;

public class task73_guessingGame {

    public static void main(String[] args) {

        int userInput;
        int secretNumber=8;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter number: ");

        do {
            userInput=scanner.nextInt();

            if(userInput<secretNumber){
                System.out.println("Enter a bigger number");
            }
            else if(userInput>secretNumber){
                System.out.println("Enter a smaller number");
            }
            else {
                System.out.println("Congrat you got it");
            }
        }
        while (userInput!=secretNumber);
    }
}
