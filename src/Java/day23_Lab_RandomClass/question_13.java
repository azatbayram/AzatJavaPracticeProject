package Java.day23_Lab_RandomClass;

public class question_13 {

	public static void main(String[] args) {
		
		String str="AABBCC";
		doubleChar(str);

	}

	public static void doubleChar(String str) {
		
		String doubleStr="";
		 
		for(int i=0; i<str.length(); i++) {
			 
			for(int x=0; x<2; x++) {
				 
				doubleStr=doubleStr.concat(str.substring(i, i+1));
			 }
	    }
		
		 System.out.println(doubleStr);
		
	}

}
