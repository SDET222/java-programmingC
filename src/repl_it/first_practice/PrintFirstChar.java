package repl_it.first_practice;
import java.util.Scanner;
public class PrintFirstChar {
    public static void main(String[] args) {

        /**Write a program that will print out the first character of the word.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word");
        String word = scan.next();
        System.out.println(word.charAt(0));


        String name ="Orkhan";

        String nameIs = name=="Orkhan" ? "It is ok" : "Wrong name";
        System.out.println(nameIs);



            }


         }

