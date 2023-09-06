package Java.day45_Exceptions;

public class ThrowAndThrows {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Hello World");
		
		//throw new RuntimeException("This is some exception");
		
		//throw new Exception("Another exception");
		
		/*
		try {
			throw new Exception("Another exception");
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		String username="";
		
		if(username.isEmpty()) {
			throw new RuntimeException("Username can not be empty");
		}
		else {
			System.out.println("Valid username");
		}

	}
	
	public static void sleep(int seconds) throws InterruptedException {
		
		Thread.sleep(seconds * 1000);
		
	}
	
	public static void sleep2(int seconds) {
		
		try {
			sleep(seconds);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void sleep3(int seconds) {
		
		sleep2(seconds);
		
	}

}
