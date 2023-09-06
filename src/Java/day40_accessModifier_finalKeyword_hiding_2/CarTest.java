package Java.day40_accessModifier_finalKeyword_hiding_2;

import Java.day40_accessModifier_finalKeyword_hiding.Car;

public class CarTest {

	public static void main(String[] args) {
		
		Car c=new Car();
		
		//c.model="M3"; no access because of different package
		c.year=2017;
		//c.door=4; no access because of private variable
		//c.engine=3.5; no access because engine is protected variable and inside different package 
		
		System.out.println(c.toString());

	}

}
