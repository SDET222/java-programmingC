package repl_it.first_practice;

import java.util.Scanner;

public class SwitchPractice {
    public static void main(String[] args) {


        /*Your school goes on a Field trip each year. The place you go will be based on your
        grade. Given some grade number (1-6) figure out the details of your field trip.
        Print the information at the end.

        Data based on grade:

        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith

        grade - 2
        location - Zoo
        number of groups - 7
        teacher in charge - Mr. Lee

        grade - 3
        location - Aquarium
        number of groups - 5
        teacher in charge - Ms. Wilson

        grade - 4
        location - Movie theater
        number of groups - 2
        teacher in charge - Ms. Reyes

        grade - 5
        location - Museum
        number of groups - 5
        teacher in charge - Ms. Lela

        grade - 6
        location - Six Flags
        number of groups - 8
        teacher in charge - Mr. Watt  */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter grade:");
        int grade = scan.nextInt();

        switch (grade) {
            case 1:
                System.out.println("location -  Apple orchard \nnumber of groups - 3" +
                        "\nteacher in charge - Ms. Smith");
                break;
            case 2:
                System.out.println("location -  Zoo \nnumber of groups - 7" +
                        "\nteacher in charge - Mr.Lee");
                break;

            case 3:
                System.out.println("location -  Aquarium \nnumber of groups - 5" +
                        "\nteacher in charge - Ms. Wilson");
                break;

            case 4:
                System.out.println("location -  Movie theatre \nnumber of groups - 2" +
                        "\nteacher in charge - Ms. Reyes");
                break;

            case 5:
                System.out.println("location -  Museum \n number of groups - 5" +
                        "\n teacher in charge - Ms. Leila");
                break;

            case 6:
                System.out.println("location -  Six Flags \n number of groups - 8" +
                        "\n teacher in charge - Mr. Watt");
                break;
            default:
                System.out.println("Invalid grade entered");
                break;

        }


    }
}
