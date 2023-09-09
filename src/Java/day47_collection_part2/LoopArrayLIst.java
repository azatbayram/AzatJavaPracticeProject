package Java.day47_collection_part2;

import java.util.ArrayList;
import java.util.List;

public class LoopArrayLIst {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        nums.add(50);
        nums.add(543);
        nums.add(1150);
        nums.add(550);
        nums.add(570);
        nums.add(93);
        nums.add(5000);
        nums.add(950);

        //looping using for each loop
        for (Integer n:nums) {
            System.out.println(n);
        }

        System.out.println();

        //looping using iterator loop
        for (int i=0; i<nums.size(); i++){
            System.out.println(nums.get(i));
        }

        System.out.println();

        //looping forEach() method. Lambda expression
        nums.forEach(n -> System.out.print(n + "|"));

        System.out.println();

        nums.removeIf(n -> n<500);
        nums.forEach(n -> System.out.print(n + "|"));
    }
}
