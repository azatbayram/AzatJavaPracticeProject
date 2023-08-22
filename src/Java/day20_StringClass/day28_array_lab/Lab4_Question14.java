package Java.day20_StringClass.day28_array_lab;

import java.util.Arrays;

public class Lab4_Question14 {

	public static void main(String[] args) {
		
		int[] x= {1,2};
		int[] y= {3,4};
		
		int[] x1= {4,4};
		int[] y1= {2,2};
		
		int[] x2= {9,2};
		int[] y2= {3,4};
		
		System.out.println(Arrays.toString(ConcatArrays(x,y)));
		System.out.println(Arrays.toString(ConcatArrays(x1,y1)));
		System.out.println(Arrays.toString(ConcatArrays(x2,y2)));

	}

	public static int[] ConcatArrays(int[] array1, int[] array2) {
		
		int[] arr=new int[array1.length+array2.length];
		
		for(int i=0;i<arr.length; i++) {
			if(i<array1.length) {
				arr[i]=array1[i];
			}
			else {
				arr[i]=array2[i-array1.length];
			}
		}
		return arr;
	}

}
