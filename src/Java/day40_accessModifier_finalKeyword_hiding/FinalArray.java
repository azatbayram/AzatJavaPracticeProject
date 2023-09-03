package Java.day40_accessModifier_finalKeyword_hiding;

import java.util.Arrays;

public class FinalArray {
	
	public static void main(String[] args) {
		
		final int[] teams= {11,11};
		System.out.println(teams[0]);
		
		teams[0]=15;
		System.out.println(teams[0]);
		
		int nums[] = new int[] {20,20,40};
		System.out.println(Arrays.toString(nums));
		nums=new int[] {15,60,90};
		System.out.println(Arrays.toString(nums));
		
		final int[] finalNums= {23,66,44};
		System.out.println(Arrays.toString(finalNums));
		finalNums[0]=45;
		System.out.println(Arrays.toString(finalNums));
		
		//finalNums=new int[] {56,78,98};
		
		
	}

}
