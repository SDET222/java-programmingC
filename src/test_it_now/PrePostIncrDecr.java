package test_it_now;

public class PrePostIncrDecr {
    public static void main (String [] args) {

        double a, b, c, d;
        a = 2;
        b = 7;
        c = a++ + ++b;
        //10 = 2  + 8

        d = ++c + b++ + ++a;
        // 23 = 11 + 8 + 4

        System.out.println("a = " + a); // 4
        System.out.println("b = " + b); // 9
        System.out.println("c = " + c); // 11
        System.out.println("d = " + d); // 23
        System.out.println(" -c = " + ++c);
        System.out.println("================================");

        double z = 14;
        double x = 18;
        double y = ++z + ++x / 2;
        //   24.5   = 15 + 19 / 2
        System.out.println("y = " + ++y);
        System.out.println("x = " + x++);
        System.out.println("x after ++ = " + x);
        System.out.println("================================");

        boolean l = 25>24;
        boolean s = l==false;
        System.out.println("l = " + l); //true
        System.out.println("s = " + s); //false
        System.out.println("=======================================");

        boolean l1 = 21>19;
        boolean l2 = l1 !=false;
        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);
        System.out.println("=============================================");

        int n1, n2, n3, n4;
        n1 = 25;
        n2 = ++n1;   // n2 = 26
        n3 = n2++ + ++n1; // n3 = 26 + 27 = 53
        n4 = ++n3 - --n2; // n4 = 54 - 26 = 28

        System.out.println("n1 = " + n1); // 27
        System.out.println("n2 = " + n2); // 26
        System.out.println("n3 = " + n3); // 54
        System.out.println("n4 = " + n4); // 28
        System.out.println("=====================================");

        boolean result1 = n3 > n4;
        boolean result2 = n2 <= n1;
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println(n1 != n2);
        System.out.println(n1 + n2 > n3);







    }



}
