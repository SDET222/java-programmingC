package saim_tasks.beforeTasks;

public class TimeTernary {
    public static void main(String[] args) {
        /* Given some time value (int) in 24 hours format. Print if its the morning or night.
0 - 11 : Morning
12- 24 : Night
-> You can assume the value given is always valid (in the 24 hours range), but if you want a
challenge use an if to control invalid values */


        int time = 1;
        String dayOrNight = time>=0 && time<=11 ? ("Morning") : ("Night");
        System.out.println(dayOrNight);



    }
}
