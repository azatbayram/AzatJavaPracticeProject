package Java.day44_OOP_Review.Shapes;

public class Square extends Shape {
	
	public Square() {
		type="square";
	}
	
	public void draw() {
		System.out.println("Drawing a square");
	}
	
	public void squareMethod() {
		System.out.println("Square method");
	}

}
