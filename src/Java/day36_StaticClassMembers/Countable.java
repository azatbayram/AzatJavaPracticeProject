package Java.day36_StaticClassMembers;

public class Countable {

    static int instanceCount;

    public Countable(){
        instanceCount++;
    }

    public int getInstanceCount(){
        return instanceCount;
    }
}
