package Java.day44_OOP_Review.Shapes;

import java.util.ArrayList;
import java.util.List;

import static Java.day44_OOP_Review.Shapes.ShapeManager.*;

public class ShapeActions {

	public static void main(String[] args) {


		drawSquare((Square)buildShape("square"));
		
		drawShape(buildShape("shape"));

		System.out.println("-------------");

		List<Shape> myList = new ArrayList<>();
		myList.add(new Shape());
		myList.add(new Square());
		myList.add(new Shape());
		myList.add(new Square());
		myList.add(new Diamond());

		drawShape(myList);

	}

}
