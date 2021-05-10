package day37_methods_overloading;

public class GetDayName2 {
    public static void main(String[] args) {
        System.out.println(getDayName2(5));
        System.out.println(getDayName2(15));

    }

    public static String getDayName2(int day) {
        String res = "";
        switch (day) {
            case 1:
                res = "Monday";
                break;
            case 2:
                res = "Tuesday";
                break;
            case 3:
                res = "Wednesday";
                break;
            case 4:
                res = "Thursday";
                break;
            case 5:
                res = "Friday";
                break;
            case 6:
                res = "Saturday";
                break;
            case 7:
                res = "Sunday";
                break;
            default:
                System.out.println("Invalid day");
                res= null;


        }
        return res;
    }

}
