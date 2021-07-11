package day61_exceptions_collections;

public class CustomExceptionTest {
    public static void main(String[] args) {

        int minutes = 30;
        System.out.println("Class is going on for "+minutes+" minutes");
        if(minutes>50) {
            throw new BreakTimeException("It is break time buddy!");
        }
        System.out.println("Lets continue the class");

        int balance = 400;
        int itemPrice = 500;

        if(itemPrice>balance) {
            throw new InsufficientBalanceException("Transaction declined. Not enough funds");
        }
        System.out.println("Item successfully purchased");
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><>");





    }
}
