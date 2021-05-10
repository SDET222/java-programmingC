package saim_tasks.loop_practice;

import java.util.Scanner;
public class DynamicAlphabet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /**• Write a program that will ask ‘upper’ or ‘lower’
         • If it is upper: print the alphabet in all uppercase letter from A to Z
         • If it is lower: print the alphabet in all uppercase letter from a to z
         - Challenge: Also ask if they want to show the alphabet in ascending or
         order descending
         - Ascending: A – Z or a – z
         - Descending: Z – A or z – a  */
        System.out.println("\'upper\' or \'lower\'?");
        String upOrL = scan.next();
        System.out.println("ascending or descending");
        String ascOrDesc = scan.next();

        if (upOrL.equalsIgnoreCase("lower") && ascOrDesc.equalsIgnoreCase("ascending")){
            for (char letter = 'a'; letter<='z';letter++) {
                System.out.print(letter+", ");
            }


        } else if (upOrL.equalsIgnoreCase("upper") && ascOrDesc.equalsIgnoreCase("ascending")) {
            for (char letter = 'A'; letter <= 'Z'; letter++) {
                System.out.print(letter + ", ");
            }

        } else if (upOrL.equalsIgnoreCase("lower") && ascOrDesc.equalsIgnoreCase("descending")) {
            for (char letter = 'z'; letter >= 'a'; letter--) {
                System.out.print(letter + ", ");
            }

        }  else if (upOrL.equalsIgnoreCase("upper") && ascOrDesc.equalsIgnoreCase("descending")) {
            for (char letter = 'Z'; letter >= 'A'; letter--) {
                System.out.print(letter + ", ");
            }
        } else {
            System.out.println("Incorrect input");
        }












        }
}
