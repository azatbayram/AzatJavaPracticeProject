package Java.day25_array_part2;

public class returnArray {
	
    public static void main(String[] args) {
		
		double[] values;
		
		values = getArray();
		
		for(double num : values) {
			
			System.out.print(num + " ");
		}
	}
	
	
	public static double[] getArray() {
		
		double[] array = {1.2,2.3,4.4,5.6};
		
		return array;
		
	}
	

}
