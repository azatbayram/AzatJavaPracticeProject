package Java.day29_array_lab;

public class Lab4_Question26 {

	public static void main(String[] args) {
		
		/*Write a method that accepts an array and prints true if the array contains 3 even
		or 3 odd values all next to each other.*/
		
		int[] x= {2,1,3,5};
		int[] y= {2,1,2,5};
		int[] z= {2,4,2,5};
		
		System.out.println(evenOrOdd(x));
		System.out.println(evenOrOdd(y));
		System.out.println(evenOrOdd(z));

	}

	public static boolean evenOrOdd(int[] array) {
		
		int countEven=0;
		int countOdd=0;
		for(int i=0; i<array.length; i++) {
			if(array[i]%2==0) {
				countEven+=1;
			}
			else {
				countOdd+=1;
			}
		}
		if(countEven==3 || countOdd==3) {
			return true;
		}
		return false;
	}

}
