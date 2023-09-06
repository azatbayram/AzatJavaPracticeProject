package Java.day45_Exceptions;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		String string="Selenium";
		
		try {
			System.out.println(string.length());
			System.out.println(string.charAt(100));
		} catch (Exception e) {
			System.out.println("Enter correct index");
			//return;
		} finally {
			System.out.println("Finally block");
		}
		
		System.out.println("Bye...");
	}

}
