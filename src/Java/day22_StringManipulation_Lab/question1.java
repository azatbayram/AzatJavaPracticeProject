package Java.day22_StringManipulation_Lab;
import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.next();
		
		helloName(name);

	}

	public static void helloName(String name) {
		
		System.out.println("\"Hello " + name + "!\"");
		
	}

}
