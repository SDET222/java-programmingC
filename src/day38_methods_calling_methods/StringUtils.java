package day38_methods_calling_methods;

import java.util.*;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println(isNullOrEmpty(null));
        System.out.println(isNullOrEmpty("java"));
        String word = null;
        // System.out.println(word.toUpperCase());  ==> nullpointer exeption
        System.out.println(getSumFromString("a5bc12defnn105"));

    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }


    public static boolean isPalendrome(String word) {
        boolean isPalendrome = false;
        word = word.toLowerCase();
        for (int i = 0, j = word.length() - 1; i < word.length() / 2; j--, i++) {
            if (word.charAt(i) == word.charAt(j)) {
                isPalendrome = true;
            }
        }
        return isPalendrome;
    }

    public static String reverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

    public static void timeConversion(String s) {
        int hour = 0;
        if (s.contains("AM")) {
            if (s.startsWith("12")) {
                s = s.replaceFirst("12", "00");
                System.out.println(s.substring(0, s.length() - 2));
            } else {
                System.out.println(s.substring(0, s.length() - 2));
            }


        }
        if (s.contains("PM") && s.startsWith("12")) {
            System.out.println(s.substring(0, s.length() - 2));

        } else if (s.contains("PM")) {
            hour = Integer.parseInt(s.substring(0, 2)) + 12;
            System.out.println(hour + s.substring(2, s.length() - 2));
        }

    }

    public static int countAppearance(String[] arr, String t) {
        int count = 0;
        for (String each : arr) {
            if (each.equals(t)) {
                count++;
            }
        }

        return count;
    }

    public static void printUniqueWords(String[] words) {
        //"java", "code", "python", "code","baku" ,"rust", "code"," rust"
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            count = 0;
            for (int j = 0; j < words.length; j++) {

                if (words[i].equals(words[j])) {
                    count++;
                }

            }
            if (count == 1) {
                System.out.println(words[i]);
            }

        }

    }

    public static String limit(String text, int maxLength) {
        return text.substring(0, maxLength);
    }


    public static String at3(String target, String word) {
        //at3("longword","foo")
        //return: "lonfoogword"

        return target.substring(0, 3) + word + target.substring(3);
    }


    public static String bigger(String a, String b) {
        if (a.length() > b.length()) {
            return a;
        } else {
            return b;
        }
    }

    public static String removeFirst(String target) {
        return target.substring(1);
    }

    public static String countLetters(String str) {
        //countLetters("aaabbcccc");
        //"3a2b4c"
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }

            }
            if (!result.contains("" + str.charAt(i))) {
                result += "" + count + str.charAt(i);
                str = str.replace("" + str.charAt(i), "");
            }

        }
        return result;

    }

    public static String extractNum(String s) {
        //aa2aa3 -->23
        String nums = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                nums += s.charAt(i);
            }
        }
        return nums;
    }

    public static void countLetter(String str) {
        String checked = "";

        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i);
            int count = 0;

            if (!checked.contains("" + eachLetter)) {

                for (int j = 0; j < str.length(); j++) {
                    char eachOtherLetter = str.charAt(j);
                    if (eachLetter == eachOtherLetter) {
                        count++;
                    }
                }

                System.out.println(eachLetter + " - " + count);
                checked += eachLetter;
            }
        }

    }

    public static int getSumFromString(String s) {
        //a5bc12def100g
        int sum = 0;
        String num = "";
        for (int i = 0; i < s.length(); i++) {

            if (Character.isDigit(s.charAt(i))) {


                num += s.charAt(i);

                if (i==s.length()-1 || !Character.isDigit(s.charAt(i + 1))) {

                    sum += Integer.parseInt(num);
                    num = "";
                }

            }

        }
        return sum;

    }

    public static boolean isAnagram (String a, String b) {

       a=a.toLowerCase();
       b=b.toLowerCase();
      char []arr1 =  a.toCharArray();
      char[]arr2 = b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
       return Arrays.equals(arr1,arr2);
    }

    public static String coverString(String main, String coverME) {
        //coverString("java methods", "me") ) ; ==> "java [me]thods"
        String covered = "["+coverME+"]";
        if (main.contains(coverME)) {
          main=main.replace(coverME,covered);
        } else {
            main="["+main+"]";
        }



        return main;
    }


}
