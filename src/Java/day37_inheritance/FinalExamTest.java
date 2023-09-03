package Java.day37_inheritance;

import java.util.Scanner;

public class FinalExamTest {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of questions");
        int numQ= scanner.nextInt();
        System.out.println("Missed number of questions");
        int numM= scanner.nextInt();

        FinalExam exam1=new FinalExam(numQ, numM);

        System.out.println("exam1.getGrade() = " + exam1.getGrade());
    }
}
