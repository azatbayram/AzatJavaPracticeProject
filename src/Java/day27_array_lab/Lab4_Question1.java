package Java.day27_array_lab;

public class Lab4_Question1 {

	public static void main(String[] args) {
		
		int[] x= {1,2,6};
		int[] y= {6,1,2,3};
		int[] z= {13,6,1,2,3};
		int[] a= {5,8,9};
		
		System.out.println(check6Digit(x));
		System.out.println(check6Digit(y));
		System.out.println(check6Digit(z));
		System.out.println(check6Digit(a));
		

	}

	public static boolean check6Digit(int[] array) {
		
		if(array.length<1) {
			return false;
		}
		
		if(array[0]==6 || array[array.length-1]==6) {
			return true;
		}else {
			return false;
		}
		
	}

}
