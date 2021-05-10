package repl_it.StringManipulations;
import java.util.Scanner;
public class GetSandwich {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter:");

        String str = scan.next(); // xxbreadjambreadyy
        String str2 = str;

        if (str2.contains("bread") ) {
            str2=str2.replaceFirst("bread",""); // xxjambreadyy
        }
        if (str2.contains("bread")) {
            System.out.println(str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread")));
        } else {
            System.out.println("nothing");
        }








    }
}
