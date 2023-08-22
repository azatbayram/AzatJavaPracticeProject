package Java.day20_StringClass;
import java.util.Scanner;

public class task82 {
	
	static Scanner sc=new Scanner(System.in);

	/*public static void main(String[] args) {
		
		enterUsername();
		enterPassword();
		checkInput(enterUsername(), enterPassword());
		

	}

	private static void checkInput( String username, String password) {
		
		
		
		
	}

	private static String enterPassword() {
		
		System.out.println("Enter your password: ");
		String password=sc.next();
		if(password.contains(" ")) {
			System.out.println("password can not be emplty");
		}
		return password;
		
	}

	private static String enterUsername() {
		
		System.out.println("Enter your username: ");
		String username=sc.next();
		if(username.contains(" ")) {
			System.out.println("username can not be emplty");
		}
		return username;
		
	}*/
	
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("Enter your username:");
		String userName = sc.nextLine();
		
		System.out.print("Enter your password:");
		String password = sc.nextLine();
		
		String userNameInSystem = "azatbayram";
		String passwordInSystem = "123";
		
		if(userName.equals("") && password.equals("")) {
			System.out.println("Username and password fields can not be empty");
		}else if(userName.equals("") && !password.equals("")){
			System.out.println("Username can not be empty");
		}else if(!userName.equals("") && password.equals("")) {
			System.out.println("Password can not be empty");
		}else if(!userName.equals(userNameInSystem) || ! password.equals(passwordInSystem)) {
			System.out.println("Username or password not valid,please verify");
		}else if(userName.equals(userNameInSystem) && password.equals(passwordInSystem)) {
			System.out.println("User logged in  successfully");
		}
		
		
	}


}
