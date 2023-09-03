package Java.day36_StaticClassMembers;

public class CalculatorTest {

    public static void main(String[] args) {

        double result=Calculator.plus(55, 7);
        System.out.println("result = " + result);

        Calculator calculator=new Calculator();
        System.out.println(calculator.plus(55, 7));
    }
}
