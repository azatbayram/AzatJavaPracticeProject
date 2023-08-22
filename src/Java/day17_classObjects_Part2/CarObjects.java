package Java.day17_classObjects_Part2;

public class CarObjects {

	public static void main(String[] args) {
		
		BMW b1 = new BMW();
		BMW b2 = new BMW();
		BMW b3 = new BMW();
		
		System.out.println(b1.make);
		System.out.println(b2.make);
		System.out.println(b3.make);
		
		b1.make="BMW2020";
		
		System.out.println(b1.make);
		System.out.println(b2.make);
		System.out.println(b3.make);
		
		b1.model="m3";
		
		b1.showPrice();
		
		b2.model="330i";
		b3.model="X3";
		
		b2.showPrice();
		b3.showPrice();
	

	}

}
