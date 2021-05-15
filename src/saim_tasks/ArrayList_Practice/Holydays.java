package saim_tasks.ArrayList_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Holydays {
    public static void main(String[] args) {

        List<String> holidays = new ArrayList<>();


        holidays.set(1,"New Years day, Martin Luther King, Jr. Day");
        holidays.set(2,"President’s Day");
        holidays.set(5,"Memorial Day");
        holidays.set(6,"Independence Day");
        holidays.set(9,"Labor Day");
        holidays.set(10,"Columbus Day");
        holidays.set(11,"Veterans Day, Thanksgiving Day");
        holidays.set(12,"Christmas Day");

        System.out.println(listOfHolidays(holidays,2));


    }
    public static List<String> listOfHolidays (List<String> list, int n) {

        List<String> listN = new ArrayList<>();

        if (n>=1 && n<=12) {
            listN.add(list.get(n));
            return listN;
        } else {
            return null;
        }

    }



}
