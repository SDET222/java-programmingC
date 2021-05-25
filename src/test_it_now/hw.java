package test_it_now;

import java.util.Arrays;

public class hw {
    public static void main(String[] args) {


        String h = "I love java. I enjoy coding";
    String  a [] =   h.split(" ");
    String [] rev = new String[a.length];
    String r="";

    for(String each:a) {
        r+=" ";
        for (int i = each.length()-1, j=0; i >=0 ; i--,j++) {


            r+=each.charAt(i);
        }
    }


        System.out.println(r);

        }

    }

