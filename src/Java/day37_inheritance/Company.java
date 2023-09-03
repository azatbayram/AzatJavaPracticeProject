package Java.day37_inheritance;

public class Company {

    public static void main(String[] args) {

        Employee emp1=new Employee();

        emp1.name="Azat";
        emp1.age=26;
        emp1.gender='M';
        emp1.jobTitle="SDET";

        emp1.eat("Salad");
        emp1.work();

        System.out.println(emp1.toString());

    }
}
