package Java.day13_MethodsPart1;

public class creditCardMethod {

    public static void main(String[] args) {

        double salary=50000;
        int creditRating=7;

        if(salary>=20000 && creditRating>=7){
            qualify();
        }
        else {
            nonQualify();
        }

    }

    public static void qualify(){
        System.out.println("Congrat, you are qualified for the credit card");
    }

    public static void nonQualify(){
        System.out.println("Sorry, you are not qualified for the credit card");
    }
}
