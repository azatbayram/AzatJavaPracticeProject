package Java.day28_array_lab;

public class Lab4_Question8 {

	public static void main(String[] args) {
		
		int[] x= {2,5};
		int[] y= {4,5};
		int[] z= {3,7};
		
		System.out.println(check2and3(x));
		System.out.println(check2and3(z));
		System.out.println(check2and3(y));
		

	}

	public static boolean check2and3(int[] array) {
		
		for(int i=0; i<array.length; i++) {
			
			if(array[i]==2 || array[i]==3) {
				
				return true;
				
			}
		}
		
		return false;
	}

}
