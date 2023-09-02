package Java.day33_ClassObject_constructor;

public class Car {
	
	String model;
	String make;
	int year;
	double mile;
	String color;
	
	
	
	public Car() {
		
		make = "BMW";
		model = "M3";
		year = 2019;
		mile = 23000;
		color = "red";
	}


	public Car(String model, String make, int year, double mile, String color) {
		this.model = model;
		this.make = make;
		this.year = year;
		this.mile = mile;
		this.color = color;
	}

}
