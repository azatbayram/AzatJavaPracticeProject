package Java.day20_StringClass;

public class task81 {

	public static void main(String[] args) {
		
		String date="23/04/2021 16:33:00";
		System.out.println(date);
		timeStamp(date);

	}

	private static void timeStamp(String date) {
		
		date=date.replace("/", "").replace(" ", "").replace(":", "");
		System.out.println(date);
		
	}

}
