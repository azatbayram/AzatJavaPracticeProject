package Java.day34_Constructor;

public class DiceTest {

    public static void main(String[] args) {

        final int six_dice=6;
        Dice sixDice=new Dice(six_dice);
        rollDice(sixDice);
    }

    public static void rollDice(Dice d){
        //rolling 6 sides dice
        System.out.println("Rolling a " + d.getSides() + " sided dice");

        //the dice's value
        System.out.println("The dice's value: " + d.getValue());

    }
}
