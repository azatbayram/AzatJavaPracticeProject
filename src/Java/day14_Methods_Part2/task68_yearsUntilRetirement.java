package Java.day14_Methods_Part2;

public class task68_yearsUntilRetirement {

    public static void main(String[] args) {

        String name="Azat";
        int birthYear=1995;
        yearsUntilRetirement(name, birthYear);


    }

    public static void yearsUntilRetirement(String name, int birthYear) {

        int retirementYear=55;
        System.out.println("\"" + name + " retires in " + (retirementYear-calculateAge(birthYear)) + " years\"");

    }

    public static int calculateAge(int birthYear) {

        int age;
        age= 2021-birthYear;

        return age;
    }
}
