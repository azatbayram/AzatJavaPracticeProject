package Java.day21_StringClass;

public class String_Substring {

	public static void main(String[] args) {
		
		String sentence = "Java String Manipulation is fun!";
		
		System.out.println(sentence.substring(2));
		System.out.println(sentence.substring(5, 11));
		System.out.println(sentence.length());
		System.out.println(sentence.substring(5, sentence.length()-5));  
		
		
		String chars="{{}}";
		String word="AUTOMATION";
		
		System.out.println(chars.substring(0, 2) + word + chars.substring(2));
		
		String str="PROGRAMMING IS FUN!";
		
		str=str.toLowerCase();
		System.out.println(str);
		
		System.out.println(str.toUpperCase());
		
		System.out.println(word.length());
		System.out.println(word.indexOf('T',6));
	}

}
