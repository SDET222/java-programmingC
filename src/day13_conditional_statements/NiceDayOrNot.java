package day13_conditional_statements;

public class NiceDayOrNot {
    public static void main(String[] args) {
        double temp = 72;
        if (temp>=70 && temp<90) {
            System.out.println("It is beautiful day!\nLet's code Java");
        }
        else {
            System.out.println("It is kind of cold today\nStay home and code Java");
        }
    }
}
