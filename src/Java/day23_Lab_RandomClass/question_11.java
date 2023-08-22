package Java.day23_Lab_RandomClass;

public class question_11 {

	public static void main(String[] args) {
		
		String str="abc hi hohi    hiho  hi";

		System.out.println(countHi(str));
	
	}

	public static int countHi(String str) {
		int x=0;
		
		for(int i=0; i<str.length()-1; i++) {

			if(str.substring(i, (i+2)).equals("hi")) {
				
				x++;
			}
		}
		
		return x;
		
	}

}
