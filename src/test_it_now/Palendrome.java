package test_it_now;

import java.util.ArrayList;

public class Palendrome {
    public static void main(String[] args) {

        String s = "Anna";
        s=s.toLowerCase();
        boolean isPalendrome=false;
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i)==s.charAt(s.length()-1-i)){
                isPalendrome=true;
            }
        }
        System.out.println(s+" is palndrome = "+isPalendrome);
        System.out.println("===================================================");

        String [] words = {"java","racecar", "catac", "ball"};

        ArrayList<String> arr = new ArrayList<>();

        for (String each:words) {
            for (int i = 0; i < each.length()/2; i++) {
                if(each.charAt(i)==each.charAt(each.length()-1-i)) {

                    arr.add(each);
                    break;
                }
            }
        }

        System.out.println(arr);



//TODO arrays palendrome


    }
}
