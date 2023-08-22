package Java.day28_array_lab;

public class Lab4_Question20 {

	public static void main(String[] args) {
		
		int[] x= {1,2,2};
		int[] y= {1,2,1,2};
		int[] a= {2,1,2};
		int[] b= {2,2,1,2};
		
		System.out.println(checkTwo(x));
		System.out.println(checkTwo(y));
		System.out.println(checkTwo(a));
		System.out.println(checkTwo(b));

	}

	public static boolean checkTwo(int[] array) {
		
		for(int i=0; i<array.length-1; i++) {
			
			if(array[i]==2 && array[i+1]==2) {
				return true;
			}
		}
		return false;
	}

}
