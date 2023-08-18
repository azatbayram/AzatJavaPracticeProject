package Java.day13_MethodsPart1;

public class ConvertMileToKM {

    public static void main(String[] args) {

        convertMileToKm(80);
    }

    public static void convertMileToKm(int x) {

        int mile = x;
        double km=mile*1.60934;

        System.out.println(mile + " mile = " + km + " km" );

    }
}
