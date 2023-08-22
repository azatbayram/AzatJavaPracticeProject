package Java.day23_Lab_RandomClass;

public class question_17 {

	public static void main(String[] args) {
		
		String str="taco cat";
		System.out.println(isPalindrom(str));

	}

	public static boolean isPalindrom(String str) {
		String backwardString="";
		for(int i=str.length()-1; i>=0; i--) {
			backwardString+=str.charAt(i);
		}
		if(str.replace(" ", "").equalsIgnoreCase(backwardString.replace(" ", ""))) {
			return true;
		}
		else {
			return false;
		}
	}

}
