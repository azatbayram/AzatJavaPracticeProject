package Java.day18_readingUserInput;

import java.util.Scanner;

public class task72_sumNumbers {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();

        int sum=num1+num2+num3;

        System.out.println("Sum of numbers is " + sum);
    }
}
