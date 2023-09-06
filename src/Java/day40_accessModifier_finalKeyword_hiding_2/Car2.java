package Java.day40_accessModifier_finalKeyword_hiding_2;


import Java.day40_accessModifier_finalKeyword_hiding.Car;

public class Car2 extends Car {
	
	public Car2() {
		//model="M3"; no access because of default variable and inside different package
		year=2017;
		//door=4; no access beauce of private variable 
		engine=3.5;
		
	}


}
