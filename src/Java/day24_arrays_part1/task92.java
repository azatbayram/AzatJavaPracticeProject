package Java.day24_arrays_part1;

import java.util.Arrays;

public class task92 {

	public static void main(String[] args) {
		
		int[] numbers= {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<numbers.length; i++) {
			
			System.out.println(numbers[i]*19);
		}
		System.out.println(Arrays.toString(numbers));

	}

}
