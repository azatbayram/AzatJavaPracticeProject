package Java.day27_array_lab;

public class Lab4_Question2 {

	public static void main(String[] args) {
		
		int[] x= {1,2,3};
		int[] y= {1,2,3,1};
		int[] z= {1,2,1};
		int[] k= {1};
		
		System.out.println(checkFirstAndLast(x));
		System.out.println(checkFirstAndLast(y));
		System.out.println(checkFirstAndLast(z));
		System.out.println(checkFirstAndLast(k));
		
		

	}

	public static String checkFirstAndLast(int[] array) {
		
		if(array.length>1) {
			
			if(array[0]==array[array.length-1]) {
				return "true";
			}
		}
		else {
			return "Not Valid Array";
		}
		return "false";
	}

}
