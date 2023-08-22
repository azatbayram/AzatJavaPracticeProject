package Java.day23_Lab_RandomClass;

public class question_14 {

	public static void main(String[] args) {
		
		String str="oddly";
		System.out.println(endsLy(str));

	}

	public static boolean endsLy(String str) {
		
		int x=str.length();
		
		if(str.substring(x-2, x).equals("ly")) {
			return true;
		}
		else {
			return false;
		}
	}

}
