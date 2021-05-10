package day07_arithmetic_operators_casting;

public class StringConcatPractice {
    public static void main (String [] args) {
        System.out.println("java"+5+3);

        System.out.println(5+5+ "java");

        System.out.println("java" + (5+3));

        System.out.println(5+ (3+ "java"));

        System.out.println("hello"+(1+2+3));

        String str1="hello";
        String str2="friends";
        System.out.println(str1+str2);
        System.out.println(str1+" "+str2);

        int num1 = 7;
        int num2 = 8;
        System.out.println(num1+num2);
        System.out.println(num1 + " " + num2 );
        System.out.println(num1 + "" + num2);

        String w="";
        System.out.println(5+w+4);

        char c1 = 'a';
        char c2 = 'b';
        System.out.println(c1+c2);
        System.out.println(c1+""+c2);








    }




}
