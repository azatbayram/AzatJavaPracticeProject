package Java.day45_Exceptions;

public class RuntimeError {

    public static void main(String[] args) {
        go();
    }

    public static void go(){
        System.out.println("going");
        go();
    }
}
