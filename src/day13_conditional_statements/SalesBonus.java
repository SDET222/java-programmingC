package day13_conditional_statements;

public class SalesBonus {
    public static void main(String[] args) {

        double bonus = 0;
        double salesAmmount = 5000.55;
        if (salesAmmount <= 1000) {
            bonus = 50;
            System.out.println("Good job, you qualified for bonus! $" + bonus);
        } else {
            bonus = 100;
            System.out.println("Great job, you are qualified for full bonus $" + bonus);
        }
        System.out.println("Your total bonus: $" + bonus);


    }
}
