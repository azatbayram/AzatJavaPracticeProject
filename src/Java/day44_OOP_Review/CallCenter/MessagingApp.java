package Java.day44_OOP_Review.CallCenter;

public abstract class MessagingApp {
	
	
	public String name;
	protected boolean isFree;
	boolean allOSCompatible;
	private static int count;
	public static final String APP_TYPE="Messenger";

	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		MessagingApp.count = count;
	}

	public MessagingApp() {
		System.out.println("MessagingApp no-argsconstructor...");
	}
	
	
	
	public MessagingApp(String name, int count) {
		
		this.name = name;
		MessagingApp.count=count;
		
	}

	public abstract void sendMessage(String msg);
	
	public void launch() {
		System.out.println("Messaging is launching...");
	}
	
	public static void close() {
		System.out.println("Messaging is closing...");
	}
	
	

}
