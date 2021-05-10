package office_hours;

public class CastingPractice {
    public static void main(String[] args) {

        byte b = 10;
        short s = b;
        byte b2 = (byte)s;

        double d = 5.3;
        int i = (int)d;
        System.out.println((double)i); //5.0
        System.out.println(i); // 5

        float f = 3.54f;
        float f4 = 5.5f;
        double million = 1_000_000;
        System.out.println(million);
        int th = 1_000;
        System.out.println("th = " + th);



    }
}
