package Java.day13_MethodsPart1;

public class passingMultipleArguments {

    public static void main(String[] args) {

        showSum(5, 10);
        showSum(12, 15);
        showSubtract(23, 15);

    }

    public static void showSum(int num1, int num2){
        System.out.println(num1+num2);
    }

    public static void showSubtract(int num1, int num2){
        System.out.println(num1-num2);
    }
}
