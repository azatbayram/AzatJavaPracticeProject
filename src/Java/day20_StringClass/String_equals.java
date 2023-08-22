package Java.day20_StringClass;

public class String_equals {

	public static void main(String[] args) {
		
		String str1="Welcome to Java";
		String str2="Welcome to Java";
		String str3="Welcome to C++";
		
		boolean b1=str1.equals(str2);
		boolean b2=str1.equals(str3);
		boolean b3=str1.equals(str1);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		boolean b4=str1==str2;
		boolean b5=str1==str3;
		
		System.out.println(b4);
		System.out.println(b5);
		
		String str4= new String("Welcome to Java");
		
		boolean b6=str1==str4;
		
		System.out.println(b6);
	}

}
