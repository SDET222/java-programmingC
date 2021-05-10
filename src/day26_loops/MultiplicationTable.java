package day26_loops;

public class MultiplicationTable {
    public static void main(String[] args) {


        int number = 9;
        int result = 0;

        if (number <1 || number >10) {
            System.out.println("ERROR: Invalid input");
            return;
        }


        for (int i = 1; i <= 10; i++) {
            result = number * i;

            System.out.println(number + "*" + i + " = " + result);
        }


    }
}
