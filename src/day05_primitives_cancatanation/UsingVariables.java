package day05_primitives_cancatanation;

public class UsingVariables {
    public static void main (String[] args) {
        int num1= 100;
        int num2=num1;
        System.out.println(num1);
        System.out.println(num2);
        num1=200;                   //to change num2 you should reasign num1=num2 again
        System.out.println(num1);
        System.out.println(num2);

        int n1 = 55;
        int n2 = n1;
        int n3 = n2;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        int orkhansZipCode=7974;
        int kamransZipCode=orkhansZipCode;
        System.out.println(orkhansZipCode);
        System.out.println(kamransZipCode);
        orkhansZipCode=1001;
        System.out.println(orkhansZipCode);
        System.out.println(kamransZipCode);
        kamransZipCode=orkhansZipCode;
        System.out.println(kamransZipCode);






    }

}
