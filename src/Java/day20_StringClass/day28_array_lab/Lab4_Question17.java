package Java.day20_StringClass.day28_array_lab;

import java.util.Arrays;

public class Lab4_Question17 {

	public static void main(String[] args) {
		
		int[] x= {10,3,5,6};
		int[] y= {7,2,10,9};
		int[] z= {2,10,7,2};
		
		System.out.println(diffrenceLS(x));
		System.out.println(diffrenceLS(y));
		System.out.println(diffrenceLS(z));
		

	}

	public static int diffrenceLS(int[] array) {
		
		int largest = 0;
		int smallest=0;
		int[] arr=Arrays.copyOf(array, array.length);
		for(int i=0; i<array.length-1; i++) {
			
			if(array[i]<=array[i+1]) {
				largest=array[i+1];
			}
			else {
				largest=array[i];
				array[i+1]=array[i];
			}
		}
        for(int i=0; i<arr.length-1; i++) {
			
			if(arr[i]>=arr[i+1]) {
				smallest=arr[i+1];
			}
			else {
				smallest=arr[i];
				arr[i+1]=arr[i];
			}
		}
		return largest-smallest;
	}

}
