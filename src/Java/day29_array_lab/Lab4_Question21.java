package Java.day29_array_lab;

public class Lab4_Question21 {

	public static void main(String[] args) {
		
		int[] x= {2,3,2,2,4,2};
		int[] y= {2,3,2,2,4,2,2};
		int[] z= {1,2,3,4};
		
		System.out.println(checkSumOf2(x));
		System.out.println(checkSumOf2(y));
		System.out.println(checkSumOf2(z));

	}

	public static boolean checkSumOf2(int[] array) {
		
		int sum=0;
		for(int i=0; i<array.length; i++) {
			
			if(array[i]==2) {
				sum+=array[i];
			}
		}
		if(sum==8) {
			return true;
		}
		return false;
	}

}
