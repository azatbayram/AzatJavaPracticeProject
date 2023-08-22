package Java.day24_arrays_part1;

public class arrayCreation {

	public static void main(String[] args) {
		
		//option-1
		int [] numbers;
		numbers = new int[3];
		
		//option-2
		int [] scores = new int[5];
		float[] temp=new float[40];
		char[] letter=new char[100];
		double[] price=new double[500];
		String[] words=new String[15];
		
		System.out.println(letter[5]);
		System.out.println(words[10]);
		System.out.println(numbers[2]);
		System.out.println(temp[15]);
		System.out.println(price[100]);
		System.out.println(numbers[0]);
		
		int[] myList= {1,2,3,4};
		System.out.println(myList[0]);
		System.out.println(myList[3]);
		
		String[] myArray= {"Apple", "Orange", "Watermelon"};
		

	}

}
