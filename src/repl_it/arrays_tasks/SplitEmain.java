package repl_it.arrays_tasks;
import java.util.*;
public class SplitEmain {
    public static void main(String[] args) {


        String  email = "info@cybertek.school.com@";

        String arr [] = email.split("@");



//            if (arr.length==2) {
//                System.out.println(arr[0]);
//                System.out.println(arr[1]);
//            } else {
//                System.out.println("Invalid email");
//            }

            int count=0;

            for(int i=0; i< email.length();i++) {
                if (email.charAt(i)=='@') {
                    count++;
                }
            }if (count ==1 && email.contains("@")) {
            System.out.println(arr[0]);
            System.out.println(arr[1]);
        } else {
            System.out.println("Invalid email");
        }











    }
}
