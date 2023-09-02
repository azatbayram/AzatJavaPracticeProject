package Java.day33_ClassObject_constructor;

public class swappingToNumber {

	public static void main(String[] args) {
		
		int a=8;
		int b=6;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("------------------------");
		/*
			int c;
			c=a;
			a=b;
			b=c;
		System.out.println(a);
		System.out.println(b);
		System.out.println("------------------------");
		*/
		
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println(a);
		System.out.println(b);
		
		
		

	}

}
