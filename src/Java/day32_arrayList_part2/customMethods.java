package Java.day32_arrayList_part2;

import java.util.ArrayList;
import java.util.Random;

public class customMethods {

    public static void main(String[] args) {

        ArrayList<String> strnums = new ArrayList<>();
        strnums.add("123");
        strnums.add("33");
        strnums.add("12");

        System.out.println(strnums.toString());

        System.out.println("---------------------------------");

        ArrayList<Integer> converted=covertToIntList(strnums);
        System.out.println(converted.toString());

        System.out.println("---------------------------------");

        ArrayList<Integer> rList=getRandomList(20);
        System.out.println(rList.toString());

        System.out.println("---------------------------------");

        ArrayList<Integer> list=getNumList(15);
        System.out.println(list.toString());

        System.out.println("---------------------------------");

        ArrayList<Integer> numsList=new ArrayList<>();
        numsList.add(10);
        numsList.add(10);
        numsList.add(7);
        numsList.add(8);
        numsList.add(8);
        numsList.add(3);
        numsList.add(4);
        numsList.add(8);

        printList(numsList);
        System.out.println();
        System.out.println("---------------------------------");

        ArrayList<Double> doubleList=new ArrayList<>();
        doubleList.add(10.33);
        doubleList.add(1.22);
        doubleList.add(7.34);
        doubleList.add(3.55);
        doubleList.add(4.76);

        double sum=sumList(doubleList);
        System.out.println(sum);

    }

    public static void printList(ArrayList<Integer> numslist) {
        for (Integer item: numslist) {
            System.out.print(item + " ");
        }
    }

    public static ArrayList<Integer> covertToIntList(ArrayList<String> strNums){

        ArrayList<Integer> newList=new ArrayList<>();

        for (String str: strNums) {
            newList.add(Integer.parseInt(str));
        }
        return newList;

    }

    public static ArrayList<Integer> getRandomList(int size){

        ArrayList<Integer> randomNums=new ArrayList<>();
        Random random=new Random();

        for (int i=0; i<=size; i++){
            randomNums.add(random.nextInt(101));
        }

        return randomNums;
    }

    public static ArrayList<Integer> getNumList(int size){

        ArrayList<Integer> newList=new ArrayList<>();

        for (int i=1; i<=size; i++){
            newList.add(i);
        }

        return newList;
    }

    public static double sumList(ArrayList<Double> doubleList){

        double sum=0;

        for (Double d: doubleList){
            sum=sum+d;
        }

        return sum;
    }
}

