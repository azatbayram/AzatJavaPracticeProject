package Java.day13_MethodsPart1;

public class greaterThan {

    public static void main(String[] args) {

        greaterNumber(65, 78);

    }

    public static void greaterNumber(int x, int y){

        int num1=x;
        int num2=y;

        if(num1>num2){
            System.out.println(num1 + " is greater than " + num2);
        }
        else if(num1<num2){
            System.out.println(num2 + " is greater than " + num1);
        }
        else {
            System.out.println(num1 + " is equal to " + num2 );
        }
    }
}
