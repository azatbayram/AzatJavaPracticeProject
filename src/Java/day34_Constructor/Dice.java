package Java.day34_Constructor;

import java.util.Random;

public class Dice {

    int sides;
    int value;

    public Dice(int numSides){
        sides=numSides;
        roll();
    }

    public void roll(){
        Random random=new Random();
        value= random.nextInt(sides);
    }

    public int getSides(){
        return sides;
    }

    public int getValue(){
        return value;
    }
}
