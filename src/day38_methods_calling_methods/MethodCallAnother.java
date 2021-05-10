package day38_methods_calling_methods;

public class MethodCallAnother {
    public static void main(String[] args) {
    aMethod();



    }
    public static void aMethod () {
        System.out.println("start");
        bMethod();
    }
    public static void bMethod () {

        System.out.println("continue");
        cMethod();
    }
    public static void cMethod () {

        System.out.println("end");

    }


}
