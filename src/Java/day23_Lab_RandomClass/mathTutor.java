package Java.day23_Lab_RandomClass;

import java.util.Random;
import java.util.Scanner;

public class mathTutor {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int sum;
		int userAnswer;
		
		Scanner sc=new Scanner(System.in);
		Random rn=new Random();
		
		num1=rn.nextInt(100);
		num2=rn.nextInt(100);
		sum=num1+num2;
		
		System.out.println("Enter the answer of: " + num1 + " + " + num2 + "=" );
		userAnswer=sc.nextInt();
		if(sum==userAnswer) {
			System.out.println("Correct Answer");
		}
		else {
			System.out.println("Wrong Answer");
		}
		

	}

}
