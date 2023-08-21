package Java.day13_MethodsPart1;

public class task65_calculateGrade {

    public static void main(String[] args) {

        calculateGrade(0, 65, 95);

    }

    public static void calculateGrade(int x1, int x2, int x3) {

        int average=(x1+x2+x3)/3;
        System.out.println("Average is " + average);

        if (average>=90 && average<=100) {

            System.out.println("Grade is A");
        }
        else if (average>=80 && average<=89) {

            System.out.println("Grade is B");
        }
        else if (average>=70 && average<=79) {

            System.out.println("Grade is C");
        }
        else if (average>=60 && average<=69) {
            System.out.println("Grade is D");
        }
        else if (average>=0 && average<=59) {

            System.out.println("Grade is F");
        }
        else {
            System.out.println("Invalid input");
        }

    }
}
