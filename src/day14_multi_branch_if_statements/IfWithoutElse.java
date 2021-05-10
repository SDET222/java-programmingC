package day14_multi_branch_if_statements;

import java.sql.SQLOutput;

public class IfWithoutElse {
    public static void main (String [] args) {

        int year = 2021;
        boolean covidYear;
        if (year==2020) {
            System.out.println("COVID is here\nPlease wear mask");
            covidYear=true;
        }
        System.out.println("Keep coding JAVA");
        System.out.println("+++++++++++++++++++++++++++++");
        String country = "Kongo";
        if (country.equals("USA")) {
            System.out.println("Washington DC is the capital of USA");
            System.out.println("White house is on Pennsylvania Ave");
        }
        System.out.println("Welcome to "+country+"!!!");



    }
}
