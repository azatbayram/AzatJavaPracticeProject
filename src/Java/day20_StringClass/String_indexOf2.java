package Java.day20_StringClass;

public class String_indexOf2 {

	public static void main(String[] args) {
		
		//index of with 2 value
		String list="html-selenium-angular-jenkins-grid";
		int firstDash=list.indexOf("-");
		System.out.println(firstDash);
		
		int secondDash=list.indexOf("-", 5);
		System.out.println(secondDash);
		
		int thirdDash=list.indexOf("-", secondDash+1);
		System.out.println(thirdDash);
		
		int fourthDash=list.indexOf("-", thirdDash+1);
		System.out.println(fourthDash);
		
		int fifthDash=list.indexOf("-", fourthDash+1);
		System.out.println(fifthDash);
		
		int lastDash=list.lastIndexOf("-");
		System.out.println(lastDash);

	}

}
