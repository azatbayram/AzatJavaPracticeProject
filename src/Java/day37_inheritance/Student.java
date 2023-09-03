package Java.day37_inheritance;

public class Student extends Person{

    int studentID;
    String termClass;

    public void code(String lang){
        System.out.println(name + " is coding " + lang);
    }

    public void attendClass(){
        System.out.println(name + " is attending " + termClass + " class");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", studentID=" + studentID +
                ", termClass='" + termClass + '\'' +
                '}';
    }
}
