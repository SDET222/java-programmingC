package repl_it.loop4;
import java.util.Scanner;
public class EqualsJavaPython {
    public static void main(String[] args) {

        /**Given a string, print out true if the number of appearances of "java"
         *  anywhere in the string is equal to the number of appearances of "python"
         *  anywhere in the string (case sensitive).
         *   We study java not python  */

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int countJava = 0;
        int countPython = 0;


        for (int i = 0; i < sentence.length(); i++) {

            if (sentence.contains("java")  ) {
                sentence.replaceFirst("java","");
                countJava++;
            } if (sentence.contains("python")) {
                sentence.replaceFirst("python","");
                countPython++;
            }

        }
        System.out.println(countJava==countPython);










    }
}
