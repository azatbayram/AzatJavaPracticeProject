package Java.day41_abstraction;

public abstract class Bird extends Animal{

    void eat(){
        System.out.println("Bird is eating");
    }

    //abstract method
    abstract void fly();
}
