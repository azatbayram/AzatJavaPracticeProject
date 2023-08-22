package Java.day24_arrays_part1;
import java.util.Random;

public class task91 {

	public static void main(String[] args) {
		
		Random rn=new Random();
		int[] myArray=new int[10];
		
		for(int i=0; i<myArray.length; i++) {
			
			myArray[i]=rn.nextInt(100);
			System.out.println(myArray[i]);
		}

	}

}
