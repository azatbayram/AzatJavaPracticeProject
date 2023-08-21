package Java.day14_Methods_Part2;

public class task67_compareLastDigit {

    public static void main(String[] args) {

        int num1;
        int num2;
        boolean result;

        num1=16;
        num2=117;
        result=lastDigit(num1, num2);

        System.out.println(result);


    }
    public static boolean lastDigit(int num1, int num2) {

        boolean x;

        if (num1%10 == num2%10) {

            x=true;
        }
        else {

            x=false;
        }
        return x;
    }
}
