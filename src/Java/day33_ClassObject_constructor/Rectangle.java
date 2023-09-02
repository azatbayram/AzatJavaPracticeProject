package Java.day33_ClassObject_constructor;

public class Rectangle {
	
	double length;
	double width;
	
	public void getArea() {
		System.out.println(length*width);
	}
	
	//constructor
	public Rectangle(double a, double b) {
		length=a;
		width=b;
	}
	
	public Rectangle() {
		length=0.0;
		width=0.0;
	}

}
