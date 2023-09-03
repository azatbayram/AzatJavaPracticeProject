package Java.day36_StaticClassMembers;

public class AllBlocks {

    public AllBlocks(){
        System.out.println("No argument constructor");
    }

    public AllBlocks(int x){
        System.out.println("One argument constructor");
    }

    static {
        System.out.println("First Static Init");
    }

    {
        System.out.println("First Instance Init");
    }

    {
        System.out.println("Second Instance Init");
    }

    static {
        System.out.println("Second Static Init");
    }
}
