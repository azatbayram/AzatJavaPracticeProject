package Java.day46_collection_part1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArrayLIst {

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("java");
        list.add("js");
        list.add("ruby");
        list.add("html");
        list.add("kotlin");
        list.add("c++");

        System.out.println("Before sorting");
        System.out.println(list.toString());
        System.out.println("After sorting");
        Collections.sort(list);
        System.out.println(list.toString());

        List<Product> productList=new ArrayList<>();
        productList.add(new Product("spoon", 13.99));
        productList.add(new Product("bag", 100.00));
        productList.add(new Product("shoes", 55.99));
        productList.add(new Product("computer", 1560.99));

        System.out.println("Before sorting");
        System.out.println(productList.toString());
        System.out.println("After sorting");
        Collections.sort(productList);
        System.out.println(productList.toString());

        Product p1=new Product("spoon", 25.34);
        Product p2=new Product("chair", 7.99);

        System.err.println(p1.compareTo(p2));



    }
}
