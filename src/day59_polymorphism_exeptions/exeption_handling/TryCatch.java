package day59_polymorphism_exeptions.exeption_handling;

public class TryCatch {
    public static void main(String[] args) {

        try {
            System.out.println(10/2);
            System.out.println(10/0);
            System.out.println(10/3);

        } catch(Exception e) {
            System.out.println("Runtime exception happened and handled");
        }
        System.out.println("After first try catch");

        int[] nums = {2,4,5};
        try {

            System.out.println(nums[0]);
            System.out.println(nums[3]); //ArrayIndexOutOfBoundsException
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("After second try catch");
        }

        for (int i = 0; i < 10; i++) {

            System.out.print(" 01010101110001001110011101 = "+ i);
        }
    }
}
