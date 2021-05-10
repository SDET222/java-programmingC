package day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main (String [] args) {
        boolean isHungry = false;
        if(isHungry) {
            System.out.println("I am hungry. I will go get something to eat!\nThen code JAVA");
        }
        else {
            System.out.println("I'm full. Keep keep coding JAVA");
        }
        System.out.println("*************************************************");
        double price =230.44;
        //double budget =200.00;
        boolean isAffordable = price <= 200;
        if(isAffordable) {
            System.out.println("It is affordable");
        } else {
            System.out.println("It is not affordable");
        }
        System.out.println("=========================================");
        boolean isRemoteJob = false;
        if(!isRemoteJob) {
            System.out.println("Sorry, I'm not interested");
        }
        else {
            System.out.println("I'm interested, what is the interview process?");
        }


    }



}
