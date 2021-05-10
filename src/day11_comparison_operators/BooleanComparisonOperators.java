package day11_comparison_operators;

public class BooleanComparisonOperators {
    public static void main (String [] args) {

        System.out.println(10==10);
        System.out.println(10>=10);
        System.out.println(10<=10);
        System.out.println(10>9);
        System.out.println(10<11);
        System.out.println(10!=11);
        System.out.println(10<5);
        System.out.println(10.5!=10.5);
        System.out.println(10.6==10.7);
        System.out.println(true!=false);
        System.out.println("*********************************");
        int a = 100;
        int b = 200;
        System.out.println(a < b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println("****************************");


        boolean result;
        result = 5==5;
        System.out.println("result = " + result);

        result = 33 > 44;
        System.out.println("result = " + result);

        result = 88 < 99;
        System.out.println("result = " + result);

        result = 10 >= 10;
        System.out.println("result = " + result);

        result = 123 <= 124;
        System.out.println("result = " + result);

        result = 2 !=2;
        System.out.println("result = " + result);

        String city ="New Providence";
        System.out.println(city == "New Providence");
        System.out.println(city == "Baku");
        System.out.println(city != "Fairfax");

        String name = "Nadir";
        boolean checkName = name == "Nadir";
        System.out.println(checkName);

        checkName = name != "Murodil";
        System.out.println("checkName = " + checkName);
        System.out.println("************************************");

        int code = 25404;
        boolean checkCode = code > 25404;
        System.out.println("CheckCode = "+checkCode);
        checkCode = code >=25404;
        System.out.println("checkCode = " + checkCode);
        checkCode = code != b;
        System.out.println("checkCode = " + checkCode);
        checkCode = name == "Nadir";
        System.out.println("checkCode Name = " + checkCode);






    }




}
