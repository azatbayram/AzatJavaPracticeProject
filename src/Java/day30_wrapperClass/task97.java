package Java.day30_wrapperClass;

public class task97 {

    public static void main(String[] args) {

        String text="(((W&e**_lco73me %t%o co!@$,,<r>e <J>>>$@av```~a777.||}{";

        System.out.println(filterText(text));

    }

    public static String filterText(String txt){
        String str="";

        for (int i=0; i<txt.length(); i++){
            if(Character.isAlphabetic(txt.charAt(i)) || txt.charAt(i)==' '){
                str+=txt.charAt(i);
            }
        }

        return str;
    }
}
