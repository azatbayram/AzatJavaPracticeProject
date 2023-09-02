package Java.day31_arrayList_part1;

import java.util.ArrayList;

public class cities {

    public static void main(String[] args) {

        ArrayList<String> cities=new ArrayList<>();

        cities.add("London");
        cities.add("Ashgabat");
        cities.add("Istanbul");
        cities.add("Washington");
        cities.add("Berlin");
        cities.add("Baku");

        System.out.println(cities.toString());

        System.out.println("---------------------------------------------");

        for (String city: cities) {
            System.out.println(city);
        }

        System.out.println("---------------------------------------------");

        for (int i=0; i< cities.size(); i++){
            System.out.println(cities.get(i));
        }

        System.out.println("Removing Baku");

        cities.remove("Baku");
        cities.remove("New York");

        System.out.println(cities.toString());

        System.out.println("---------------------------------------------");

        cities.add(0, "Arlington");
        cities.add(1, "Baku");

        System.out.println(cities.toString());

        int num1=cities.indexOf("Ashgabat");
        System.out.println(num1);
        int num2= cities.indexOf("New York");
        System.out.println(num2);

        cities.clear();
        System.out.println(cities.isEmpty());
    }
}
