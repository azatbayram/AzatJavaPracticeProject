package Java.day19_StringClass;

public class CharAt {

    public static void main(String[] args) {

        String name="Azat";

        System.out.println(name.length());

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));

        //check if first character is 'A'
        String word="Apple";

        if( word.charAt(0) == 'A') {
            System.out.println("First character is A");
        }
        else {
            System.out.println("First character is not A");
        }

        //check first and last characters are same.
        String word2="civic";

        System.out.println(word2.length());

        if (word2.charAt(0)==word2.charAt(4)) {
            System.out.println("First and last characters are same.");
        }
        else {
            System.out.println("First and last characters are not same.");
        }

        //last index not hard coded.
        String word4 = "Java Script";

        char lastChar = word4.charAt(word4.length()-1);

        System.out.println("Last char of " + word4 + " is " + lastChar);


    }
}
