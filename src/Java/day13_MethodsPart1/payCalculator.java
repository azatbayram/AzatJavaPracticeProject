package Java.day13_MethodsPart1;

public class payCalculator {

    public static void main(String[] args) {
        payCalculator(80, 24);
        payCalculator(60, 15.8);
    }

    public static void payCalculator(double hours, double hourlyPay){

        double pay=hourlyPay* hours;

        System.out.println("Payment: "+pay);
    }
}
