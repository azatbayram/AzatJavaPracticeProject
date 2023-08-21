package Java.day13_MethodsPart1;

public class passingArgument {

    public static void main(String[] args) {

        int x=25;

        displayValue(x);
        displayValue(15);
        displayValue(x+15);

    }

    public static void displayValue(int num){
        System.out.println("The value is "+num);
    }
}
