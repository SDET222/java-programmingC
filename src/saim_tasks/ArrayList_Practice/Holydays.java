package saim_tasks.ArrayList_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Holydays {
    public static void main(String[] args) {

        ArrayList<String> holidays = new ArrayList<>();


        holidays.add(0,"New Years day, Martin Luther King, Jr. Day");
        holidays.add(1,"President’s Day");
        holidays.add(2,null);
        holidays.add(3,null);
        holidays.add(4,"Memorial Day");
        holidays.add(5,"Independence Day");
        holidays.add(6,null);
        holidays.add(7,null);
        holidays.add(8,"Labor Day");
        holidays.add(9,"Columbus Day");
        holidays.add(10,"Veterans Day, Thanksgiving Day");
        holidays.add(11,"Christmas Day");
        holidays.add(12,null);






        System.out.println(listOfHolidays(holidays,1));


    }
    public static ArrayList<String> listOfHolidays (ArrayList<String> list, int n) {

        ArrayList<String> listN = new ArrayList<>();

        if (n>=1 && n<=12) {
            listN.add(list.get(n-1));
            return listN;
        } else {
            return null;
        }

    }



}
