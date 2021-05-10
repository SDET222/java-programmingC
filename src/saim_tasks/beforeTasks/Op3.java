package saim_tasks.beforeTasks;

public class Op3 {
    public static void main(String[] args) {

        int x = 300;
        int y = 400;
        int z = x + y - x * y + x / y;
        //      300+400  -  300*400+300/400
     //          700-  120000 + 0 = -119300
        System.out.println("z = " + z);

    }
}
