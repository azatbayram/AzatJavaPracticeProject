package Java.day31_arrayList_part1;

import java.util.ArrayList;

public class arrayListExample {

    public static void main(String[] args) {

        ArrayList<String> languages=new ArrayList<>();

        languages.add("Turkmen");
        languages.add("English");
        languages.add("Russian");
        languages.add("Turkish");

        System.out.println(languages.get(0));
        System.out.println(languages.get(1));
        System.out.println(languages.get(2));
        System.out.println(languages.get(3));

        System.out.println(languages.size());

        System.out.println(languages.toString());

        languages.add(1, "Arabic");
        System.out.println(languages.size());
        System.out.println(languages.toString());

        languages.remove(4);
        System.out.println(languages.size());
        System.out.println(languages.toString());
    }
}
