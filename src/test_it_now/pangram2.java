package test_it_now;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class pangram2 {
    public static void main(String[] args) {

        String str = "A quick brown fox jumps over the lazy dog";

        str = str.toLowerCase();


        List<Character> ch2 = new ArrayList<>();
        List<Character> ch1 = new ArrayList<>();

        for(char chr = 'a'; chr <= 'z'; chr++){
            ch2.add(chr);
        }


        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=' '){
                ch1.add(str.charAt(i));
            }

        }

//        Collections.sort(ch1);
//        Collections.sort(ch1);

        System.out.println(ch1.containsAll(ch2));

        System.out.println(ch1);
        System.out.println(ch2);




    }
}
