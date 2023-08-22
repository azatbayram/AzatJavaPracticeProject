package Java.day20_StringClass.day28_array_lab;

import java.util.Arrays;

public class Lab4_Question15 {

	public static void main(String[] args) {
		
		int[] x= {1,2,3,4};
		int[] y= {1,2,3};
		int[] z= {8,6,7,9,5};
		
		System.out.println(Arrays.toString(swapArray(x)));
		System.out.println(Arrays.toString(swapArray(y)));
		System.out.println(Arrays.toString(swapArray(z)));

	}

	public static int[] swapArray(int[] array) {
		
		int num=array[0];
		array[0]=array[array.length-1];
		array[array.length-1]=num;
		
		return array;
		
	}

}
