package saim_tasks.beforeTasks;

public class OperatorsPractice {
    public static void main(String[] args) {


        int a = 3, b = 2;
        long c = (a-- + b) * 2 / 3 % 2;
        //          (3 + 2)  * 2 / 3 % 2
        //            5 * 2 / 3 % 2
        //            10 / 3 % 2
        //              3 % 2 = 1
        System.out.println(c);
        System.out.println(a);
        System.out.println("***********************************");
        int numOne = 10; //12+1
        int numTwo = numOne++ * 3 + ++numOne + numOne++ % 2;
        //             10   * 3 + 12 + 12 % 2
        //               30 + 12 + 12 % 2
        //               42 + 0 =0

        int biggest = numOne > numTwo ? numOne : numTwo;
       //               13 > 42
        System.out.println(numOne);
        System.out.println(numTwo);
        System.out.println(biggest);



    }
}
