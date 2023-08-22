package Java.day30_wrapperClass;

public class boxing {

    public static void main(String[] args) {

        //Autoboxing -> primitive to object
        Integer num1=1234;
        int n=5;
        Integer num2=n;

        //Unboxing -> object to primitive
        Double d1=new Double(34.5);
        double d2=d1;
        System.out.println(d1);
        System.out.println(d2);

        long l1=new Long(6000000l);//unboxing
        Long l2=new Long(524353244325234l);//no boxing
        long l3=l2; //unboxing

        Integer num3=Integer.valueOf(345);
        //Double d3=num3; //casting is not possible with wrapper classes
    }
}
