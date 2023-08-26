package Java.day30_wrapperClass;

public class varArgs {

    public static void main(String[] args) {

        sum(2,4);
        sum(2, 3, 5, 6);

        concat("Apple", "Orange", "123", "Result");

    }

    public static void sum(int... numbers){
        //A variable argument parameter can take a variable number of arguments
        int sum=0;
        for (int value: numbers) {
            sum+=value;
        }
        System.out.println(sum);
    }

    public static void concat(String... strs){
        String nexStr="";
        for (String str: strs) {
            nexStr+=str.charAt(2);
        }
        System.out.println(nexStr);
    }
}
