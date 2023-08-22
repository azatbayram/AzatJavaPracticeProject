package Java.day20_StringClass.day28_array_lab;

public class Lab4_Question18 {

	public static void main(String[] args) {
		
		int[] x={1,2,2,1};
		int[] y={1,1};
		int[] a={1,2,2,1,13};
		int[] b={1,2,2,1,13,3};
		
		System.out.println(sumArray(x));
		System.out.println(sumArray(y));
		System.out.println(sumArray(a));
		System.out.println(sumArray(b));

	}

	public static int sumArray(int[] array) {
		
		int sum=0;
		
		for(int i=0; i<array.length; i++) {
			
			if(array[i]==13) {
				break;
			}
			sum+=array[i];
		}
		
		return sum;
	}

}
