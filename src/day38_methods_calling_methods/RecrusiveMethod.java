package day38_methods_calling_methods;

public class RecrusiveMethod {
    public static void main(String[] args) {
        recursive(1);
    }
    public static void recursive (int num) {
        System.out.print(num+ " ");
        num++;

        if (num<=100) {
            recursive(num);

        }

    }
}
