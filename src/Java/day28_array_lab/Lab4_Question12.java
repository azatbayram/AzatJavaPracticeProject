package Java.day28_array_lab;

public class Lab4_Question12 {

	public static void main(String[] args) {
		
		int[] x= {1,2,3};
		int[] y= {1,3};
		
		int[] x1= {7,2,3};
		int[] y1= {1};
		
		int[] x2= {3,2,4};
		int[] y2= {4,3,4};
		
		System.out.println(CheckFirst(x,y));
		System.out.println(CheckFirst(x1,y1));
		System.out.println(CheckFirst(x2,y2));


	}

	public static int CheckFirst(int[] array1, int[] array2) {
		
		int counter=0;
		
		if(array1[0]==1) {
			counter+=1;
		}
		if(array2[0]==1) {
			counter+=1;
		}
		
		return counter;
		
	}

}
