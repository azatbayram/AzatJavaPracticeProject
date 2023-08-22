package Java.day23_Lab_RandomClass;

public class question_16 {

	public static void main(String[] args) {
		
		String str="hello";
		String str1="f";
		atFirst(str);
		
	}

	public static void atFirst(String str) {
		
		if(str.length()<2) {
			System.out.println(str.charAt(0) + "@");
		}
		else {
			System.out.println(str.substring(0, 2));
		}
		
	}

}
