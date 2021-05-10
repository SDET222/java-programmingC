package test_it_now;

public class LogicOperators {
    public static void main(String[] args) {

        int a = 2;
        int b = 4;
        int c = 7;

        if (a==2 || b==4 && c==5 ) {   // something wrong!  /  && evaluates FIRST
            System.out.println("True");
        } else {
            System.out.println("False");
        }





    }
}
