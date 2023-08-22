package Java.day30_wrapperClass;

public class parsingValue {

    public static void main(String[] args) {

        String numberAsString="2018";
        int number=Integer.parseInt(numberAsString);

        System.out.println(numberAsString);
        System.out.println(number);

        number=number+1;
        numberAsString=numberAsString+1;

        System.out.println(numberAsString);
        System.out.println(number);

        double number2=Double.parseDouble(numberAsString);
        System.out.println(number2);

        int i=10;
        String s1=String.valueOf(i);
        System.out.println(s1);

        String s2=Integer.toString(i);
        System.out.println(s2);
    }
}
