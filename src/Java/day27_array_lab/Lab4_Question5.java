package Java.day27_array_lab;

import java.util.Arrays;

public class Lab4_Question5 {

	public static void main(String[] args) {
		
		int[] x= {1,2,3};
		int[] y= {17,12,10,8};
		int[] a= {7,0,0};
		
		rotatedLeft(x);
		rotatedLeft(y);
		rotatedLeft(a);

	}

	public static void rotatedLeft(int[] array) {
		int num=array[0];
		for(int i=0; i<array.length; i++) {
			
			if(i==array.length-1) {
				break;
			}
			array[i]=array[i+1];
			
		}
		array[array.length-1]=num;
		
		System.out.println(Arrays.toString(array));
		
	}

}
