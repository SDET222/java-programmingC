package test_it_now;

public class ArrayNums {
    public static void main(String[] args) {

        Integer[] nums = {1, 2,2, 1, 4, 4};
        boolean d = false;
        int count = 0;
        int count2 = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                count++;

            }
            if (nums[i] == 4 && nums[i + 1] == 4) {
                count2++;

            }

        }
        if (count == count2 ) {
            d = false;
        } else
            d = true;


        System.out.println(d);


    }
}
