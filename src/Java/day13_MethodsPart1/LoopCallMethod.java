package Java.day13_MethodsPart1;

public class LoopCallMethod {

    public static void main(String[] args) {

        System.out.println("I am in the main method");
        for (int i=0; i<5; i++){
            dsplayMessage();
        }
        System.out.println(" I am back to the main method");
    }

    public static void dsplayMessage(){
        System.out.println("Display message method");
    }
}
