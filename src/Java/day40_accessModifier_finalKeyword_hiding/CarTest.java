package Java.day40_accessModifier_finalKeyword_hiding;

public class CarTest {

	public static void main(String[] args) {
		
		Car c=new Car();
		c.model="M3";
		c.year=2017;
		//c.door=4; no access because of private variable
		c.engine=3.5;
		

	}

}
