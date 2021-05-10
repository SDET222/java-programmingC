package day14_multi_branch_if_statements;

public class LogicalANDoperator {
    public static void main(String[] args) {


        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println(10 > 5 && 1 == 1);
        System.out.println(11 > 10 && 1 > 5);
        System.out.println("************************************");
        int a = 1;
        int b = 8;
        int c = 12;
        boolean check = a > b && c > a;

        System.out.println(check);

        if (a>6 && b>4) {
            System.out.println("I have enough numbers");
        } else {
            System.out.println("I need more numbers");
        }

        System.out.println("Sorry, I don't know this version!");
    }
}
