package Java.day33_ClassObject_constructor;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle R1=new Rectangle(2.4, 5.7);
		
		System.out.println(R1.length);
		System.out.println(R1.width);
	
		R1.getArea();
		
		Rectangle R2=new Rectangle();
		
		System.out.println(R2.length);
		System.out.println(R2.width);
		
		
		/*
		System.out.println(R1.length);
		System.out.println(R1.width);
		
		R1.length=5.4;
		R1.width=3.2;
		
		R1.getArea();
		
		Rectangle R2=new Rectangle();
		
		R2.length=2.7;
		R2.width=12.5;
		
		System.out.println(R2.length);
		System.out.println(R2.width);
		
		R2.getArea();
		*/

	}

}
