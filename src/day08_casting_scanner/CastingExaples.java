package day08_casting_scanner;

public class CastingExaples {
    public static void main (String [] args) {
        byte num1 = 100;
        int num2 = num1;
        short num3 = 500;
        long num4 = num3;

        int num8 = 3456;
        double num9 = num8;
        System.out.println(num9);
        System.out.println("num9 = " + num9);
        System.out.println("====================");

        int i1 = 1590;
        short b1 =(short)i1;
        System.out.println(b1);

        double num13 = 55.3;
        float num14 = (float)num13;
        System.out.println("num14 = " + num14);

        double num15 = 1234.5;
        int num16 = (int)num15;
        System.out.println("num15 = " + num15);
        System.out.println("num16 = " + num16);

        int num17 = 200;
        byte num18 = (byte)num17;
        System.out.println("num18 = " + num18);
        char letter = 'a';
        int nl = letter;
        System.out.println("letter = " + letter);
        System.out.println("nl = " + nl);



    }




}
