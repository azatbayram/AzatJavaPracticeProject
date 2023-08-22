package Java.day20_StringClass.day28_array_lab;

import java.util.Arrays;

public class Lab4_Question7 {

	public static void main(String[] args) {
		
		int[] x= {1,2,3};
		int[] y= {};
		
		int[] a= {7,4,6,2};
		int[] b= {};
		
		firstAndLastDigit(x, y);
		firstAndLastDigit(a, b);

	}

	public static void firstAndLastDigit(int[] array1, int[] array2) {
		
		array2= new int[2];
		
		array2[0]=array1[0];
		array2[array2.length-1]=array1[array1.length-1];
		
		System.out.println(Arrays.toString(array2));
	}

}
