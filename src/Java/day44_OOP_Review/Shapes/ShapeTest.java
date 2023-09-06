package Java.day44_OOP_Review.Shapes;


public class ShapeTest {

	public static void main(String[] args) {
		
		Shape square=new Square();
		Shape diamond=new Diamond();
		Object shapeObject=new Shape();
		
		square.draw();
		diamond.draw();
		
		((Square)square).squareMethod();

	}

}
