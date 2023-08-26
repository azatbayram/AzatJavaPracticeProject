package Java.day31_arrayList_part1;

import java.util.ArrayList;

public class arrayListIntro {

    public static void main(String[] args) {

        //creating an ArrayList
        ArrayList<String> names=new ArrayList<>();

        ArrayList<Integer> nums=new ArrayList<>();

        //Assigning values to ArrayList
        names.add("Azat");
        names.add("Agamyrat");
        names.add("Myrat");
        names.add("Guwanc");
        names.add("Eziz");
        names.add("Hajy");

        nums.add(99);
        nums.add(365);
        nums.add(1000);
        nums.add(new Integer("200"));

        //Reading from ArrayList
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));
        System.out.println(names.get(3));
        System.out.println(names.get(4));
        System.out.println(names.get(5));

        System.out.println("Names count: "+names.size());
        System.out.println("Nums count: "+nums.size());

        System.out.println(names.toString());
        System.out.println(nums.toString());
    }
}
