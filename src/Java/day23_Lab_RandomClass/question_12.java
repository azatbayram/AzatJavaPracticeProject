package Java.day23_Lab_RandomClass;

public class question_12 {

	public static void main(String[] args) {
		
		String str="catdog cat   dog dog cat";
		System.out.println(catDog(str));

	}

	public static boolean catDog(String str) {
		int cat=0;
		int dog=0;
		
		for(int i=0; i<str.length()-2; i++) {
			
			if(str.substring(i, i+3).equals("cat")) {
				cat++;
			}
			if (str.substring(i, i+3).equals("dog")) {
				dog++;
			}
		}
		
		return cat==dog;
	}

}
