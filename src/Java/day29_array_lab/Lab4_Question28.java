package Java.day29_array_lab;

import java.util.Arrays;

public class Lab4_Question28 {

	public static void main(String[] args) {
		
		/*Write a method that accepts start and end numbers. Given start and end
		numbers, return a new array containing the sequence of integers from start up to
		but not including end, so start=5 and end=10 yields [5, 6, 7, 8, 9].*/
		
		fizzArray3(5, 10); // [5, 6, 7, 8, 9]
		fizzArray3(11, 18); //[11, 12, 13, 14, 15, 16, 17]
		fizzArray3(1, 3); // [1, 2]

	}

	public static void fizzArray3(int i, int j) {
		
		int[] array=new int[j-i];
		
		for(int x=0, y=i; x<array.length; x++, y++) {
			
			array[x]=y;
		}
		
		System.out.println(Arrays.toString(array));
		
	}

}
