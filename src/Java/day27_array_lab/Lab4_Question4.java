package Java.day27_array_lab;

public class Lab4_Question4 {

	public static void main(String[] args) {
		
		int[] x= {1,2,3};
		int[] y= {5,11,2};
		int[] z= {7,0,0};
		int[] a= {3,-2,10,4};
		
		sumArrayElements(x);
		sumArrayElements(y);
		sumArrayElements(z);
		sumArrayElements(a);
		

	}

	public static void sumArrayElements(int[] array) {
		
		int sum=0;
		for(int num: array) {
			sum+=num;
		}
		System.out.println(sum);
		
	}

}
