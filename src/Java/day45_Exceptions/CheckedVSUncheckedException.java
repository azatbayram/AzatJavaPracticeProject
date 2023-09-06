package Java.day45_Exceptions;

public class CheckedVSUncheckedException {

    public static void main(String[] args) {

        try{
            Thread.sleep(3000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
