package saim_tasks.ArrayList_Practice;

import java.util.ArrayList;
import java.util.List;

public class Pangram {
    // A Pangram is a String that contains all of the letters in the alphabet.
    public static void main(String[] args) {
        String str = "A quick brown fox jumps over the lazy dog";
        System.out.println(isPangram(str));

    }

    public static boolean isPangram(String str) {

        str = str.toLowerCase();

        List<Character> ch2 = new ArrayList<>();
        List<Character> ch1 = new ArrayList<>();

        for (char chr = 'a';  chr <= 'z'; chr++) {
            ch2.add(chr);
        }

        for (int i = 0; i < str.length(); i++) {
            ch1.add(str.charAt(i));
//            if (str.charAt(i) != ' ') {
//            }
        }

        System.out.println(ch1);
        System.out.println(ch2);
        return ch1.containsAll(ch2);
    }

    public static boolean isPangram2 (String str ){
        str = str.toLowerCase();
        String alp = "abcdefghijklmnopqrstuvwxyz";

        for(int i=0; i < str.length(); i++ ){

            if(Character.isLetter(str.charAt(i))){
                alp = alp.replace("" + str.charAt(i), "");
                // System.out.println(str.charAt(i) + " " + alp);
            }

            if(alp.isEmpty()){
                break;
            }

        }

        return alp.isEmpty();
    }

}
