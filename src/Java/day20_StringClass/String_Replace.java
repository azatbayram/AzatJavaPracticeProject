package Java.day20_StringClass;

public class String_Replace {

	public static void main(String[] args) {
		
		String str="Moscow is a capital of Russia";
		System.out.println(str);
		
		str=str.replace("Moscow", "Baku").replace("Russia", "Azerbaijan");
		System.out.println(str);
		
        String email = "firstName_LastName@gmail.com";
		
		String company = "capitalone";
		
		String newEmail = email.replace("gmail", company);
		
		System.out.println(newEmail);
		
		System.out.println(email);

	}

}
