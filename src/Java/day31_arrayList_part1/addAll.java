package Java.day31_arrayList_part1;

import java.util.ArrayList;

public class addAll {

    public static void main(String[] args) {

        ArrayList<String> l1=new ArrayList<>();
        l1.add("Java");
        l1.add("JS");
        l1.add("Python");

        ArrayList<String> l2=new ArrayList<>();
        l2.add("C#");
        l2.add("C++");

        System.out.println(l1.toString());
        System.out.println(l2.toString());

        l2.addAll(l1);
        System.out.println(l2.toString());

        l1.addAll(l2);
        System.out.println(l1.toString());

        System.out.println(l1.size());
        System.out.println(l2.size());

    }
}
