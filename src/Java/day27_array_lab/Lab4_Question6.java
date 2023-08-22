package Java.day27_array_lab;

import java.util.Arrays;

public class Lab4_Question6 {

	public static void main(String[] args) {
		
		int[] x= {1,2,3};
		int[] y= {11,5,9};
		int[] a= {110,5,98,0,1200,11,-4};
		
		ChangeToGreatest(x);
		ChangeToGreatest(y);
		ChangeToGreatest(a);
	}

	public static void ChangeToGreatest(int[] array) {
		
		int num=array[0];
		
		for(int i=1; i<array.length; i++) {
			
			if(array[i]>num) {
				num=array[i];
			}
		}
		
		for(int i=0; i<array.length; i++) {
			
			array[i]=num;
		}
		System.out.println(Arrays.toString(array));
		
	}

}
