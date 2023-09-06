package Java.day42_interface;

public class ElectricCarTest {

	public static void main(String[] args) {
		
		//ElectricCar ec=new ElectricCar(); //ERROR - can not be instantiated
		Tesla modelS=new Tesla("Model S", 45000, "Grey");
		modelS.charge();
		modelS.drive();
		modelS.start();
		modelS.stop();
		
		System.out.println("====================");
		
		Ford fusion=new Ford("Fusion", 35000, "White", 2018);
		fusion.charge();
		fusion.start();
		fusion.drive();
		fusion.stop();
		
		System.out.println("====================");
		
		TeslaSemi semi=new TeslaSemi("Semi", 50000, "Brown", 3.5);
		semi.charge();
		semi.load("Oranges");
		semi.start();
		semi.drive();
		semi.stop();
		
		System.out.println("====================");
		
		TeslaTruck truck = new TeslaTruck("CyberTruck", 100000, "White", 6.5);
		truck.charge();
		truck.start();
		truck.load("Java Books");
		truck.drive();
		truck.stop();
		
		System.out.println("===========");
		
		System.out.println(modelS.toString());
		System.out.println(fusion.toString());
		System.out.println(semi.toString());
		System.out.println(truck.toString());

	}

}
