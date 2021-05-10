package saim_tasks.array_practice;

public class Numbers {
    public static void main(String[] args) {

        /** Create an int array called numbers that has length of 100
         2. Assign 1-100 to each index of the array. Then use a for each loop to
         print out all the elements of the array*/

        int [] numbers = new int[100];

        for (int i = 0; i<100; i++) {
            numbers[i]=i+1;
            //System.out.println(numbers[i]);
        }
        System.out.println(numbers[4]);

        for (int each:numbers){
            System.out.print(each+", ");
        }


    }
}
