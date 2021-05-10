package saim_tasks.beforeTasks;
import java.util.Scanner;
public class SalaryCalculatorIf {
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double salaryAmmount = input.nextDouble();
        //double finalSalary;
        System.out.println("Are you full time? ");
        boolean fullTime = input.nextBoolean();
        if (fullTime) {
            salaryAmmount += 20_000;
            System.out.println("You are full time employee. Your final salary is : $"+salaryAmmount );

        }
        else {
            salaryAmmount -= 5_000;
            System.out.println("You are part time employee. Your final salary is: $"+salaryAmmount);

        }
        System.out.println("*****Smart salary systems*****");




    }

}
