package Java.day40_accessModifier_finalKeyword_hiding;

public class FinalMethod {
	
	public final void method1() {
		
		System.out.println("Method-1");
		
	}
	
	public static void staticMethod(String word) {
		
		System.out.println("Static Method");
		
	}
	

}

class Sub extends FinalMethod {
	
	/*
	public void method1() {
		System.out.println("Method-1 in sub class");
	}
	*/
	/*
	public static void staticMethod(String w) {
		System.out.println("Static method in sub class");
	}
	*/
}
