package Java.day35_encapsulation;

public class Calculator {
	
	Floor floor;  //composition
	Carpet carpet;
	
	
	
	public Calculator(Floor floor, Carpet carpet) {
		
		this.floor = floor;
		this.carpet = carpet;
	}



	public double getTotalCost() {
		
		return carpet.getCost()*floor.getArea();
		
	}

}
