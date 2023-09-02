package Java.day34_Constructor;

public class AppleTest {

    public static void main(String[] args) {

        Apple a1=new Apple();
        System.out.println(a1.color);
        changeApple(a1);
        System.out.println(a1.color);

        System.out.println(methodObject().color);
    }

    public static void changeApple(Apple x){
        x.color="green";
    }

    public static Apple methodObject(){
        Apple apple=new Apple();
        return apple;
    }

}
