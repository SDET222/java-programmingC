package saim_tasks.array_practice;

public class AverageNumber {
    public static void main(String[] args) {


        int[] number = {11, 24, 33, 25, 45};
int total=0;
        for (int each:number) {
            total+=each;

        }
        int average = total / number.length;
        System.out.println("total = " + total);
        System.out.println("average = " + average);









    }
}
