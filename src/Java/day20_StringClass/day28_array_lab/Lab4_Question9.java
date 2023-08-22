package Java.day20_StringClass.day28_array_lab;

import java.util.Arrays;

public class Lab4_Question9 {

	public static void main(String[] args) {
		
		int[] x= {4,5,6};
		
		System.out.println(Arrays.toString(doubleArray(x)));

	}

	public static int[] doubleArray(int[] array) {
		
		int[] arr=new int[array.length*2];
		arr[arr.length-1]=array[array.length-1];
		
		return arr;
	}

}
