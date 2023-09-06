package Java.day45_Exceptions;

public class MultiCatch {

    public static void main(String[] args) {

        try{

            System.out.println(4/0);

            String str=null;
            System.out.println(str.toLowerCase());

            int[] n={11, 45};
            System.out.println(n[2]);

        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception happened");
        }
        catch (NullPointerException e){
            System.out.println("Nullpointer exception happened");
        }
        catch (RuntimeException e){
            e.printStackTrace();
        }
    }
}
