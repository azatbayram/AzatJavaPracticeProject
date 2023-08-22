package Java.day20_StringClass.day28_array_lab;

import java.util.Arrays;

public class Lab4_Question13 {

	public static void main(String[] args) {
		
		int[] x= {1,2};
		int[] y= {3,4};
		
		int[] x1= {5,6};
		int[] y1= {3,8};
		
		int[] x2= {1,1};
		int[] y2= {1,0};
		
		BiggerElements(x,y);
		BiggerElements(x1,y1);
		BiggerElements(x2,y2);

	}

	public static void BiggerElements(int[] array1, int[] array2) {
		
		int sum1=0;
		int sum2=0;
		
		for(int i=0; i<array1.length; i++) {
			sum1+=array1[i];
		}
		for(int i=0; i<array2.length; i++) {
			sum2+=array2[i];
		}
		
		if(sum1>sum2) {
			System.out.println(Arrays.toString(array1));
		}
		else if(sum1==sum2) {
			System.out.println("equal");
			
		}
		else {
			System.out.println(Arrays.toString(array2));
		}
	}

}
