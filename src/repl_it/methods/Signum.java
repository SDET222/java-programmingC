package repl_it.methods;

public class Signum {
    public static void main(String[] args) {

        sign(0);

    }

    public static void sign (int num) {

        if (num<0) {
            System.out.println("neganive num");
        } else if (num==0) {
            System.out.println("Zero");
        } else {
            System.out.println("Positive num");
        }

    }


}
