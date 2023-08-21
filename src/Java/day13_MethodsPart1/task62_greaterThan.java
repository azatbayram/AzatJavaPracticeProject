package Java.day13_MethodsPart1;

public class task62_greaterThan {

    public static void main(String[] args) {
        int n1=25;
        int n2=69;
        int n3=35;

        greaterThan(n1, n2, n3);

    }

    public static void greaterThan(int n1, int n2, int n3) {

        if(n1>n2 && n1>n3) {

            System.out.println(n1 + " is biggest");
        }
        else {

            if(n2>n3) {

                System.out.println(n2 + " is biggest");
            }
            else {

                System.out.println(n3 + " is biggest");
            }
        }
    }
}
