package repl_it.methods;

public class SwapNumbers {
    public static void main(String[] args) {

        swapNums(15,4);

    }
    public static void swapNums (int a, int b) {
        a=a+b; // 15+4   a=19
        b=a-b;  // 19-4= b=15
        a=a-b; //  19-15 a=4
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
