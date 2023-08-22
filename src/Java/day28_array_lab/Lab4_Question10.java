package Java.day28_array_lab;

public class Lab4_Question10 {

	public static void main(String[] args) {
		
		int[] x= {2,2};
		int[] y= {3,3};
		int[] a= {2,3};
		int[] b= {12,20,42};
		int[] c= {2,2,2};
		
		System.out.println(check2and3(x));
		System.out.println(check2and3(y));
		System.out.println(check2and3(a));
		System.out.println(check2and3(b));
		System.out.println(check2and3(c));

	}

	public static boolean check2and3(int[] array) {
		
		int counter1=0;
		int counter2=0;
		for(int i=0; i<array.length; i++) {
			
			if(array[i]==2) {
				counter1+=1;
			}
			if(array[i]==3) {
				counter2+=1;
			}
		}
		if(counter1==2 || counter2==2) {
			return true;
		}
		else {
			return false;
		}
	}

}
