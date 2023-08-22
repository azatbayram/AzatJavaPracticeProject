package Java.day29_array_lab;

import java.util.Arrays;

public class Lab4_Question23 {

	public static void main(String[] args) {
		
		fizzArray(4);
		fizzArray(1);
		fizzArray(10);

	}

	public static void fizzArray(int num) {
		
		int[] array=new int[num];
		
		for(int i=0; i<array.length; i++) {
			array[i]=i;
		}
		
		System.out.println(Arrays.toString(array));
		
	}

}
