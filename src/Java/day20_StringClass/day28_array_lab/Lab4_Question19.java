package Java.day20_StringClass.day28_array_lab;

import java.util.Arrays;

public class Lab4_Question19 {

	public static void main(String[] args) {
		
		int[] x = {1,2,2};
		int[] y = {1, 2, 2, 6, 99, 99, 7};
		int[] a = {1,1,6,7,2};
		int[] b = {1,1,6,2};
		int[] c = {1,2,2,6,99,99,7,3,4};
		
		System.out.println(totalNumber(x));
		System.out.println(totalNumber(y));
		System.out.println(totalNumber(a));
		System.out.println(totalNumber(b));
		System.out.println(totalNumber(c));

	}

	public static int totalNumber(int[] array) {
		
		int sum=0;
		
		if(Arrays.binarySearch(array, 6)>0) {
			
			for(int i=Arrays.binarySearch(array, 6); i<array.length; i++) {
				
				if(array[i]==7) {
					array[i]=0;
					break;
				}
				array[i]=0;
				
			}
			
		}
		
		
		for(int i=0; i<array.length; i++) {
			
			sum+=array[i];
		}
		
		return sum;
	}

}
