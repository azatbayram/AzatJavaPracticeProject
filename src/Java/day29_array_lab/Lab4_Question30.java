package Java.day29_array_lab;

import java.util.Arrays;

public class Lab4_Question30 {

	public static void main(String[] args) {
		
		/*It is said that an element in array is alone if there are values before and after it, and those
		values are different from it. Write a method that accepts an array and a number and
		prints the given array where every instance of the given value which is alone is replaced
		by whichever value to its left or right is larger.*/
		
		int[] x = {1,2,3};
		int n = 2;
		System.out.println(Arrays.toString(notAlone(x, n))); //[1, 3, 3]
		int[] y = {1, 2, 3, 2, 5, 2};
		int n1 = 2;
		System.out.println(Arrays.toString(notAlone(y, n1))); //[1, 3, 3, 5, 5, 2]

	}

	public static int[] notAlone(int[] array, int num) {
		
		for(int i=0; i<array.length-1; i++) {
			
			if(array[i]==num) {
				if(array[i-1]>array[i+1]) {
					array[i]=array[i-1];
				}
				else if(array[i-1]<array[i+1]) {
					array[i]=array[i+1];
				}
				else if(array[i-1]==array[i+1]) {
					array[i]=array[i+1];
				}
			}
		}
		return array;
		
		
	}

}
