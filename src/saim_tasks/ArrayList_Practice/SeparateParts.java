package saim_tasks.ArrayList_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SeparateParts {
    public static void main(String[] args) {


        /**Write a program that can extract the special characters, digits
         * and letters from a string and stores them into separate ArrayLists
         * of Characters

         Ex: str = "ABCD123$%#@&456EFG!"
         list1: {$, %, #, @, &, !}
         list2: {A, B, C, D, E, F, G}
         list3: {1, 2, 3, 4, 5, 6}

         Challenge: make a method that will do this action and it will return
         an ArrayList which holds all 3 of the other ArrayLists
         Challenge 2: do the original task again, but without a loop. Use lambda */


        String str ="ABCD123$%#@&456EFG!";


        List<Character> newList = new ArrayList<>();

        List<Character> letters = new ArrayList<>();
        List<Character> nums = new ArrayList<>();
        List<Character> specChars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
                newList.add(str.charAt(i));
            if(Character.isLetter(str.charAt(i))) {
                letters.add(str.charAt(i));
            } else if (Character.isDigit(str.charAt(i))) {
                nums.add(str.charAt(i));
            } else {
                specChars.add(str.charAt(i));
            }

        }

        System.out.println("letters = " + letters);
        System.out.println("nums = " + nums);
        System.out.println("specChars = " + specChars);
        System.out.println("newList = " + newList);

        System.out.println("==========================");

        List<Character> letters2 = new ArrayList<>();
        List<Character> nums2 = new ArrayList<>();
        List<Character> specChars2 = new ArrayList<>();


        newList.forEach(each-> {
            if (Character.isDigit(each)) {
                nums2.add(each);
            } else if (Character.isLetter(each)) {
                letters2.add(each);
            } else {
                specChars2.add(each);
            }

        });
        System.out.println("letters2 = " + letters2);
        System.out.println("nums2 = " + nums2);
        System.out.println("specChars2 = " + specChars2);

        System.out.println("=========================================");

        System.out.println("Merged lists: " + mergeLists(letters,nums,specChars));


    }
    public static List<List<Character>> mergeLists (List<Character> list1, List<Character> list2, List<Character> list3){

        List<List<Character>> listM = new ArrayList<>();

        listM.add(list1);
        listM.add(list2);
        listM.add(list3);

        return listM;
    }
}
