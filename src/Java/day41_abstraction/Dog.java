package Java.day41_abstraction;

public class Dog extends Animal{

    @Override
    void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    void breathe() {
        System.out.println("Dog is breathing");
    }
}
