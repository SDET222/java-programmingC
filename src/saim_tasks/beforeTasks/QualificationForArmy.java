package saim_tasks.beforeTasks;

import java.util.Scanner;

public class QualificationForArmy {
    public static void main(String[] args) {
//        Given information: Citizenship(String), resident (boolean), and has high school
//        diploma
//                (boolean), and age(int). Determine if the person is qualified to join
//        the army.
//        - The person must be a Citizen of the USA or a resident
//                -> If not print: You must be a U.S. citizen or a resident
//        - Their age must be between 18 and 35
//-> If not print: Your age must be between 18 to 35 years old
//        - They must have a high school diploma
//-> If not print: You must have a high school diploma
//                > If all the criteria is met print: You are qualified for the US Army

        Scanner scan = new Scanner(System.in);
        System.out.println("Citizenship:");
        String citizenship = scan.next();
        System.out.println("US resident?");
        boolean resident = scan.nextBoolean();
        System.out.println("Enter your age:");
        int age = scan.nextInt();
        System.out.println("Do you have high school diploma?");
        boolean hasDiploma = scan.nextBoolean();
        if (citizenship.equals("US") || (resident)) {

            if (age >= 18 && age <= 35) {

                if (hasDiploma) {
                    System.out.println("You are qualify for Army");

                } else {
                    System.out.println("You must have diploma");
                }

            } else {
                System.out.println("Your age must be between 18 to 35 years old");
            }

        } else {
            System.out.println("You must be a U.S. citizen or a resident");
        }


    }
}
