package Java.day44_OOP_Review.CallCenter;

public interface VoiceCallable {
	
	boolean CAN_CALL=true; //public static final boolean CAN_Call=true;
	
	//abtract method
	void call(String contact);
	
	//static method
	public static void decline() {
		System.out.println("Azat declined voice call...");	
	}
	
	//default method
	//default method is accessible in same package
	public default void accept() {
		System.out.println("Azat finally accepted voice call...");
	}
	

}
