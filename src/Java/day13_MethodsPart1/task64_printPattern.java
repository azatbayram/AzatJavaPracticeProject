package Java.day13_MethodsPart1;

public class task64_printPattern {

    public static void main(String[] args) {

        printPattern(3);
        printPattern(4);
        printPattern(5);

    }

    public static void printPattern(int rows) {

        for (int i=1; i<=rows; i++) {

            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
