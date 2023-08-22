package Java.day23_Lab_RandomClass;
import java.util.Random;

public class randomNumber {

	public static void main(String[] args) {
		
		Random randomNumber=new Random();
		
		System.out.println(randomNumber.nextInt());
		System.out.println(randomNumber.nextDouble());
		System.out.println(randomNumber.nextFloat());
		System.out.println(randomNumber.nextBoolean());
		
		System.out.println(randomNumber.nextInt(50)); //0-49
		System.out.println(randomNumber.nextInt(10)+5); //5-14
      
	}

}
