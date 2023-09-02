package Java.day31_arrayList_part1;

import java.util.ArrayList;

public class removeInteger {

    public static void main(String[] args) {

        ArrayList<Integer> nums=new ArrayList<>();

        System.out.println(nums.size());
        System.out.println(nums.isEmpty());
        System.out.println(nums.size() == 0);

        nums.add(4);
        nums.add(55);
        nums.add(15);
        nums.add(63);
        nums.add(100);
        nums.add(68);

        //System.out.println(nums);
        System.out.println(nums.toString());

        nums.remove(4);

        System.out.println(nums.toString());

        Integer n1=new Integer(4);
        Integer n2=Integer.valueOf(4);

        nums.remove(n1);

        System.out.println(nums.toString());

        nums.remove(new Integer(55));
        System.out.println(nums.toString());

        nums.remove(Integer.valueOf(63));
        System.out.println(nums.toString());
    }
}
