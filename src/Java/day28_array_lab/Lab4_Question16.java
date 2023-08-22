package Java.day28_array_lab;

public class Lab4_Question16 {

	public static void main(String[] args) {
		
		int[] x= {2,1,2,3,4};
		int[] y= {2,2,0};
		int[] z= {1,3,5};
		
		System.out.println(EvenNumbers(x));
		System.out.println(EvenNumbers(y));
		System.out.println(EvenNumbers(z));

	}

	public static int EvenNumbers(int[] array) {
		
		int counter=0;
		
		for(int i=0; i<array.length; i++) {
			
			if(array[i]%2==0) {
				counter+=1;
			}
		}
		
		return counter;
	}

}
