package Java.day27_array_lab;

import java.util.Arrays;

public class pizza2DArray {

    public static void main(String[] args) {

        String[][] pizzas = {

                {"pinneapple","pepperoni"},
                {"anchovies","mushroom","olives"},
                {"4 cheese"},
                {"chicken","tomatoes","onioons"},
                {"green peppers","zuccini","brocoli","spinach","shrimp"}
        };

        // System.out.println(pizzas[0]);
        System.out.println("For each loop");
        for(String[] pizza: pizzas) {
            System.out.print(pizza.length + "-");
            System.out.println(Arrays.toString(pizza));
        };

        System.out.println("For iteration loop");
        for(int i=0;i<pizzas.length;i++) {
            System.out.print(pizzas[i].length);
            System.out.println(Arrays.toString(pizzas[i]));
        }

        System.out.println("----------------");


        for(String value : pizzas[3]) {

            System.out.println(value);

        }

        int[][] students = {
                {4,5,6}, //each row is array int[] inside 2d array int[][]
                {12,5,7},
                {23,56,12,55,3}
        };

        for(int[] group : students) {

            for(int studentID : group) {

                System.out.println(studentID);

            }
        }



    }

}
