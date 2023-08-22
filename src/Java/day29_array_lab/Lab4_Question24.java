package Java.day29_array_lab;

public class Lab4_Question24 {

	public static void main(String[] args) {
		
		int[] x= {1,2,1,3};
		int a=2;
		int b=1;
		
		System.out.println(checkNumber(x,a));
		System.out.println(checkNumber(x,b));

	}

	public static boolean checkNumber(int[] array, int num) {
		
		int sum=0;
		for(int i=0; i<array.length; i++) {
			
			if(array[i]==num) {
				sum+=1;
			}
		}
		if(sum>1) {
			return true;
		}
		return false;
	}

}
