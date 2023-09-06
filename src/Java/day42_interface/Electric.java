package Java.day42_interface;

public interface Electric {

    public static final boolean has_batteries=true;
    boolean isHas_batteries=true;//public static final variable

    public abstract void charge();
    void charge2(); //public abstract

    public default void methodA() {
        //code
    }

    public static void methodB() {
        //code
    }
}
