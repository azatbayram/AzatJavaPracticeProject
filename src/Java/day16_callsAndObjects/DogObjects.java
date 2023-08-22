package Java.day16_callsAndObjects;

public class DogObjects {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Dog dog3 = new Dog();
		
		dog1.age = 10;
		dog1.breed = "Maltese";
		dog1.color = "Black";
		dog1.name = "Sharik";
		
		System.out.println(dog1.age);
		System.out.println(dog1.breed);
		System.out.println(dog1.color);
		
		dog1.barking();
		dog1.hungry();
		dog1.sleeping();

	}

}
