package saim_tasks.beforeTasks;

import java.util.Scanner;

public class PersonalInformation {
    public static void main(String[] args) {

//        Ask the user how many people they live with?
//        if user lives with Less than 2 people: print "Live with less than 2 people"
//        if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
//        if the user lives with more than 6 people: print "Live with "more than 6 people"
//        Ask the user what city they live in?
//        Ask the user if the live in downtown ("yes or no")
//        if you live downtown, ask them have you thought about moving to the suburbs?
//        ("yes or
//        no")
//        if they have thought about it print "do it its great", if they have not print
//        "You should
//        think about it"
//        Ask the user their favorite animal?
//        Print "Wow %animal is a great animal"
//        Ask the user how many pets they want?
//        Print "Interesting, do you want %numberOfPets %favoriteAnimals?"

        Scanner scan = new Scanner(System.in);
        System.out.println("how many people they live with?");
        int roomMates = scan.nextInt();

        if (roomMates < 2) {
            System.out.println("Live with less than 2 people");
        } else if (roomMates >= 3 && roomMates <= 6) {
            System.out.println("Live with 3 - 6 people");
        } else if (roomMates > 6) {
            System.out.println("Live with more than 6 people");
        }
        System.out.println("What city you live?");
        System.out.println("Do you live in downtown");
        String isDowntown = scan.next();
        if (isDowntown.equals("yes")) {
            System.out.println("Have you thought about moving to the suburbs?");
            String isAboutMoving = scan.next();
            if (isAboutMoving.equals("yes")) {
                System.out.println("do it its great");
            } else if (isAboutMoving.equals("no")) {
                System.out.println("You should think about it");
            }
        }
        System.out.println(" What is your favorite animal?");
        String animal = scan.next();
        System.out.println(animal + " is great animal");
        System.out.println("How many pets do you want?");
        int numOfPets = scan.nextInt();
        System.out.println("Interesting, do you want " + numOfPets +" "+ animal);


    }
}
