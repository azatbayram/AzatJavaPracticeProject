package Java.day23_Lab_RandomClass;

public class question_15 {

	public static void main(String[] args) {
		String str="badxxx";
		String str1="xbadxxx";
		String str2="";
		String str3="xxxbadxx";
		String str4="  ";
		
//		System.out.println(hasBad(str4	));

	}

//	public static boolean hasBad(String str) {
//
//		if(str.isEmpty() || str.isBlank()) {
//			return false;
//		}
//		else {
//			if(str.substring(0, 3).equals("bad")) {
//				return true;
//			}
//			else if(str.substring(1, 4).equals("bad")) {
//				return true;
//			}
//			else {
//				return false;
//			}
//		}
//	}
	
	public static boolean hasBad2(String str) {
		
		boolean flag = true;
		
		
		
		for(int i=0;i<2;i++) {
			
			if(str.substring(i, i+3).equals("bad")) {
				
				flag = true;
				break;
				
			}else {
				
				flag = false;
			}
			
		}
		
		if(flag) {
			return true;
		}else {
			return false;
		}
	}
}
