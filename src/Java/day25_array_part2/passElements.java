package Java.day25_array_part2;

public class passElements {

	public static void main(String[] args) {
		
		int[] numbers= {5,10,15,20,50,30};
		for(int value: numbers) {
			showValue(value);
		}

	}

	public static void showValue(int value) {
		
		System.out.print(value + " ");
		
	}

}
