package Java.day26_array_part3;

public class quize {

	public static void main(String[] args) {
		/*
		int arr[]= {1,2,3,4};
		int i=0;
		
		do {
			System.out.println(arr[i]+" ");
			i++;
		}while(i<arr.length-1); */
		
		System.out.println("--------------------");
		
		int[] num1= new int[3];
		int[] num2= {1,2,3,4,5};
		num1=num2;
		for(int i=0; i<num1.length; i++) {
			System.out.print(num1[i]);
		}

	}

}
