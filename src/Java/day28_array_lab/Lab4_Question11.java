package Java.day28_array_lab;

import java.util.Arrays;

public class Lab4_Question11 {

	public static void main(String[] args) {
		
		int[] x= {1,2,3};
		int[] x1= {2,3,5};
		int[] x2= {1,2,1};
		int[] x3= {11,2,13,3,2};
		
		System.out.println(Arrays.toString(afterTwo(x)));
		System.out.println(Arrays.toString(afterTwo(x1)));
		System.out.println(Arrays.toString(afterTwo(x2)));
		System.out.println(Arrays.toString(afterTwo(x3)));

	}

	public static int[] afterTwo(int[] array) {
		
		for(int i=0; i<array.length-1; i++) {
			
			if(array[i]==2 && array[i+1]==3) {
				array[i+1]=0;
			}
		}
		
		return array;
	}

}
