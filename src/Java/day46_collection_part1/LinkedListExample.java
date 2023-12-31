package Java.day46_collection_part1;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {

        List<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(50);
        list.add(500);
        list.add(5000);

        System.out.println(list.get(0));
        System.out.println(list.get(1));

        System.out.println(((LinkedList<Integer>) list).getFirst());
        System.out.println(((LinkedList<Integer>) list).getLast());

        ((LinkedList<Integer>)list).addFirst(1);
        ((LinkedList<Integer>)list).addLast(99);

        System.out.println(((LinkedList<Integer>) list).getFirst());
        System.out.println(((LinkedList<Integer>) list).getLast());

        System.out.println(list.toString());
    }

}
