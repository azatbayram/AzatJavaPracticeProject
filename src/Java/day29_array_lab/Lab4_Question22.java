package Java.day29_array_lab;

public class Lab4_Question22 {

	public static void main(String[] args) {
		
		int[] x= {1,4,1};
		int[] y= {1,4,1,4};
		int[] z= {1,1};
		
		System.out.println(compare1And4(x));
		System.out.println(compare1And4(y));
		System.out.println(compare1And4(z));

	}

	public static boolean compare1And4(int[] array) {
		
		int count=0;
		for(int i=0; i<array.length; i++) {
			
			if(array[i]==1) {
				count+=1;
			}
			if(array[i]==4) {
				count-=1;
			}
		}
		if(count>0) {
			return true;
		}
		return false;
	}

}
