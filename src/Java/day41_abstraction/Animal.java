package Java.day41_abstraction;

public abstract class Animal {

    //instance variable
    String name;

    //static variable
    private static int age;

    //abstract method
    abstract void eat();
    abstract void breathe();

    //instance method
    private void sign(){
        System.out.println("Animal is signing");
    }

    //constructor
    public Animal(){
    }

    public Animal(int age){
        this.age=age;
    }

    //instance block
    {
        System.out.println("This is instance block");
    }

    static {
        System.out.println("This is static block");
    }

}
