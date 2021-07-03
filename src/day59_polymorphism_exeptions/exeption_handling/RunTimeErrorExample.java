package day59_polymorphism_exeptions.exeption_handling;

/**
 * Runtime exception happens during executing --> throws 'ArithmeticException'
 */
public class RunTimeErrorExample {
    public static void main(String[] args) {
        System.out.println(10/2);
       // System.out.println(10/0); //ArithmeticException
        System.out.println(10/3);

        int[] nums = {2,4,5};
        System.out.println(nums[0]);
        System.out.println(nums[3]); // ArrayIndexOutOfBoundsException





    }
}
