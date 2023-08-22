package Java.day30_wrapperClass;

public class task96 {

	public static void main(String[] args) {
		
		String str1="Today weather is sunny and 72 degree. It is a perfect day to practice java.";
		
		//String str2=str1.substring(str1.indexOf("7"), str1.indexOf(" degree"));
		//System.out.println(str2);
		
		String[] arr=str1.split("and ");
		arr=arr[1].split(" degree");
		
		 String degree1=arr[0];
		
		
		//int degree=Integer.parseInt(str2);
		double degree=Double.parseDouble(degree1);
		double celcius=(degree-32)/1.8;
		
		System.out.println("Write a program to output: " + degree + " degree is equal to " + Math.round(celcius) + " celcius");

	}

}
