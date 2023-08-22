package Java.day29_array_lab;

public class Lab4_Question27 {

	public static void main(String[] args) {
		
		/*Write a method that accepts an array and prints true if the array contains, somewhere,
		three increasing adjacent numbers like 4,5,6,... or 23,24,25.*/
		
		int[] x = {1,4,5,6,2}; //true
		int[] y = {1,2,3}; //true
		int[] z = {1,2,4,5,8,9}; //false
		
		System.out.println(increasingArray(x));
		System.out.println(increasingArray(y));
		System.out.println(increasingArray(z));

	}

	public static boolean increasingArray(int[] array) {
		
		boolean count=false;
		for(int i=0; i<array.length-2; i++) {
			
			if(array[i]+1==array[i+1] && array[i]+2==array[i+2]) {
				count=true;
			}
			
		}
		
		return count;
		
	}

}
