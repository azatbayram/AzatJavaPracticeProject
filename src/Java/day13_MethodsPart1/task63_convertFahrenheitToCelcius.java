package Java.day13_MethodsPart1;

public class task63_convertFahrenheitToCelcius {

    public static void main(String[] args) {

        calculateCelcius(32);
        calculateCelcius(50);

    }

    public static void calculateCelcius(int fahrenheit) {

        double celcius=(fahrenheit-32)/1.8;
        System.out.println(fahrenheit + " F is equal to " + celcius + " C");
    }
}
