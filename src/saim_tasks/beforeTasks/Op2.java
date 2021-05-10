package saim_tasks.beforeTasks;

public class Op2 {
    public static void main(String[] args) {


        int a = 200;
        int b = -a++ + - --a * a-- % 2 ;
        //      -200 + -200 * 200 % 2 +b
        //       -200+

        System.out.println("b = " + b);
        System.out.println(a);
    }
}
