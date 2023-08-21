package Java.day13_MethodsPart1;

public class task60_calculator {

    public static void main(String[] args) {

        calculator(5, 6, "+");
        calculator(5, 6, "-");
        calculator(5, 6, "*");
        calculator(5, 6, "/");

    }

    public static void calculator(int num1, int num2, String operator){

        switch (operator){
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
    }
}
