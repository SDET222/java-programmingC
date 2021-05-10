package day38_methods_calling_methods;

public class ArraysUtilTest {
    public static void main(String[] args) {

        int[] n = {1, 2, 3, 25, 177, 79};
        ArraysUtil.printArrays(n);
        ArraysUtil.printArrays(new int[]{1, 2, 3, 4, 5});

        int[] numbers = {2, 5, 3};
        System.out.println("Sum is: " + ArraysUtil.sum(numbers));

        int [] nums = {2,5,8};
        System.out.println("found = "+ArraysUtil.isContains(nums,9));
        System.out.println("found = "+ArraysUtil.isContains(nums,8));

    }
}
