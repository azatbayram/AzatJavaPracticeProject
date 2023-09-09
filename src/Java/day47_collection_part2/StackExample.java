package Java.day47_collection_part2;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Stack<Integer> numsStack=new Stack<>();

        numsStack.add(50);
        numsStack.add(70);
        numsStack.add(500);
        numsStack.add(45);

        System.out.println(numsStack.toString());

        //check value on top of stack
        System.out.println(numsStack.peek());

        //read value on top of stack then remove it
        System.out.println(numsStack.pop());
        System.out.println(numsStack.toString());

        System.out.println(numsStack.get(1));
    }
}
