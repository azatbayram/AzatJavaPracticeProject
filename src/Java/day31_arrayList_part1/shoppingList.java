package Java.day31_arrayList_part1;

import java.util.ArrayList;

public class shoppingList {

    public static void main(String[] args) {

        ArrayList<String> shoppingList=new ArrayList<>();

        shoppingList.add("paper towel");
        shoppingList.add("dish soap");
        shoppingList.add("trash bag");
        shoppingList.add("clorox");
        shoppingList.add("gloves");
        shoppingList.add("shovel");

        //print number of items
        int count=shoppingList.size();
        System.out.println(count);

        //print all items in single line
        System.out.println(shoppingList.toString());

        //print each item
        for (String item : shoppingList ){
            System.out.println(item);
        }

        //print first and last items in single line
        System.out.println(shoppingList.get(0)+" | "+ shoppingList.get(count-1));

        shoppingList.remove("paper towel");
        shoppingList.remove("shovel");

        System.out.println(shoppingList.toString());
        System.out.println(shoppingList.get(0));

        shoppingList.remove(0);
        System.out.println(shoppingList.toString());

        //remove all item at once
        shoppingList.clear();
        System.out.println(shoppingList.toString());

    }
}
