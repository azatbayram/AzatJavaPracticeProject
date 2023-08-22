package Java.day17_classObjects_Part2;

import java.util.Scanner;


public class ReadUserInput {
	
	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		
		System.out.println("Type some number: ");
		int num1 = x.nextInt();
		System.out.println("You entered this number: " + num1);
		
		System.out.println("Type another number: ");
		int num2=x.nextInt();
		System.out.println("You entered this number: " + num2);
		
		System.out.println("Type third number: ");
		int num3 = x.nextInt();
		System.out.println("You entered this number: " + num3);
		

	}

}
