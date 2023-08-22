package Java.day15_MethodOverloading;

public class fibonacci {

    public static void main(String[] args) {

        int count=9;
        int pre1=0, pre2=1;

        System.out.println("Fibonacci series of " + count + " numbers");

        for (int i=1; i<count; i++){
            System.out.print(pre2 + " ");
            int sumOfReTwo=pre1+pre2;
            pre1=pre2;
            pre2=sumOfReTwo;
        }
    }
}
