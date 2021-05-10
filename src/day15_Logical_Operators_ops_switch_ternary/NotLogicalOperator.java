package day15_Logical_Operators_ops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true= " + (!true));
        System.out.println("!false= " + (!false));

        int age = 12;
        if (!(age > 7)) {
            System.out.println("Need to sit in child car sit. Age = " + age);
        } else {
            System.out.println("Can sit normal seat. Age = " + age);
        }
        boolean isSmokkingAllowed = false;
        if (!isSmokkingAllowed) {
            System.out.println("No smoking");
        } else {
            System.out.println("This is smoking area");
        }
        boolean isAffordable = true;
        if (!isAffordable) {
            System.out.println("Can't buy");
        } else {
            System.out.println("Let's buy it");
        }
        System.out.println("*********************************");
        String env = "qa";
        if (!env.equals("qa")) {
            System.out.println("In wrong evironment");
        }
        String carModel = "Ford";
        if (!carModel.equals("Tesla")) {
            System.out.println("Not interested");
        }
        System.out.println("*********************************");

        String password = "abc123";
        String inputPassword = "abc321";
        if (!inputPassword.equals(password)) {
            System.out.println("incorrect password");
        }




    }
}
